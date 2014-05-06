package com.nex3z.msserialport;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import gnu.io.*;

public class SerialComm {
	private int baudRate = 9600;
	private int dataBits = SerialPort.DATABITS_8;
	//private int flowControl;
	private int parity = SerialPort.PARITY_NONE;
	private int stopBits = SerialPort.STOPBITS_1;
	
	private InputStream serialPortIn;
	private OutputStream serialPortOut;
	
	public InputStream getSerialPortIn() {
		return serialPortIn;
	}

	public OutputStream getSerialPortOut() {
		return serialPortOut;
	}
	
	public void setConnectParam(int baudRate, int dataBits, int parity, int stopBits) {
		this.baudRate = baudRate;
		this.dataBits = dataBits;
		this.parity = parity;
		this.stopBits = stopBits;
	}
	
	public void connect(String portName) throws Exception {
		CommPortIdentifier portIdentifier = CommPortIdentifier
				.getPortIdentifier(portName);
		if (portIdentifier.isCurrentlyOwned()) {
			System.out.println("Error: " + portName + " is currently in use.");
		} else {
			int timeout = 2000;
			CommPort commPort = portIdentifier.open(this.getClass().getName(), timeout);

			if (commPort instanceof SerialPort) {
				SerialPort serialPort = (SerialPort) commPort;
				serialPort.setSerialPortParams(this.baudRate, this.dataBits,
						this.stopBits, this.parity);

				serialPortIn = serialPort.getInputStream();
				serialPortOut = serialPort.getOutputStream();

				(new Thread(new SerialReader(serialPortIn))).start();
				(new Thread(new SerialWriter(serialPortOut))).start();

			} else {
				System.out.println("Error: Only serial ports are handled.");
			}
		}
	}

	public static class SerialReader implements Runnable {

		InputStream in;

		public SerialReader(InputStream in) {
			this.in = in;
		}

		public void run() {
			byte[] buffer = new byte[1024];
			int len = -1;
			try {
				while ((len = this.in.read(buffer)) != -1) {
					System.out.print(new String(buffer, 0, len));
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static class SerialWriter implements Runnable {

		OutputStream out;

		public SerialWriter(OutputStream out) {
			this.out = out;
		}

		public void run() {
			try {
				int c = 0;
				while ((c = System.in.read()) != -1) {
					this.out.write(c);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		try {
			(new SerialComm()).connect("COM5");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
