import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import javax.swing.JSplitPane;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JCheckBox;
import javax.swing.AbstractListModel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.Box;
import java.awt.Component;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ListSelectionModel;
import javax.swing.JToggleButton;


public class MSSerialPort {

	private JFrame frmMsserialport;
	private JSplitPane splitPaneMain;
	private JSplitPane splitPaneConfigAndRx;
	private JPanel panelConfigAndCmd;
	private JPanel panelConfig;
	private JPanel panelCmd;
	private JLabel lblNewLabel;
	private JButton btnOpenPort;
	private JTextField txtPortNumber;
	private JLabel lblNewLabel_1;
	private JButton btnDetect;
	private JTextField txtBaudRate;
	private JLabel lblNewLabel_2;
	private JButton btnSetMoto;
	private JLabel lblNewLabel_3;
	private JButton btnSetSepura;
	private JScrollPane scrollPaneCmd;
	private JList listCmd;
	private JButton btnAddCmd;
	private JButton btnRemoveCmd;
	private JButton btnClearCmd;
	private JButton btnImportCmd;
	private JButton btnExportCmd;
	private JCheckBox chckbxAutosaveCmd;
	private JTabbedPane tabbedPaneRxData;
	private JScrollPane scrollPaneRxText;
	private JScrollPane scrollPaneRxHex;
	private JTextArea textAreaRxText;
	private JTextArea textAreaRxHex;
	private JPanel panelSend;
	private Box hBoxSendBtn;
	private JButton btnSend;
	private JButton btnHelp;
	private JButton btnExit;
	private Component hGlueSend;
	private JScrollPane scrollPaneSend;
	private JTextArea textAreaSend;
	private Component vStrutBottom;
	private JLabel lblNewLabel_4;
	private JTextField txtDataBits;
	private JButton btnNewButton;
	private JComboBox comboBox;
	private JComboBox comboBox_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("ch.randelshofer.quaqua.tiger.Quaqua15TigerCrossPlatformLookAndFeel");
			JFrame.setDefaultLookAndFeelDecorated(true);
		} catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MSSerialPort window = new MSSerialPort();
					window.frmMsserialport.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MSSerialPort() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMsserialport = new JFrame();
		frmMsserialport.setTitle("MSSerialPort");
		frmMsserialport.setBounds(100, 100, 819, 701);
		frmMsserialport.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMsserialport.getContentPane().setLayout(new BoxLayout(frmMsserialport.getContentPane(), BoxLayout.X_AXIS));
		{
			splitPaneMain = new JSplitPane();
			splitPaneMain.setAlignmentY(10.0f);
			splitPaneMain.setResizeWeight(0.5);
			splitPaneMain.setOrientation(JSplitPane.VERTICAL_SPLIT);
			//splitPaneMain.setDividerLocation(250);
			frmMsserialport.getContentPane().add(splitPaneMain);
			{
				splitPaneConfigAndRx = new JSplitPane();
				splitPaneConfigAndRx.setDividerLocation(250);
				splitPaneMain.setLeftComponent(splitPaneConfigAndRx);
				{
					panelConfigAndCmd = new JPanel();
					splitPaneConfigAndRx.setLeftComponent(panelConfigAndCmd);
					GridBagLayout gbl_panelConfigAndCmd = new GridBagLayout();
					gbl_panelConfigAndCmd.columnWidths = new int[]{241, 0};
					gbl_panelConfigAndCmd.rowHeights = new int[]{129, 258, 0};
					gbl_panelConfigAndCmd.columnWeights = new double[]{1.0, Double.MIN_VALUE};
					gbl_panelConfigAndCmd.rowWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
					panelConfigAndCmd.setLayout(gbl_panelConfigAndCmd);
					{
						panelConfig = new JPanel();
						panelConfig.setBorder(new TitledBorder(null, "\u8BBE\u7F6E", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(51, 51, 51)));
						GridBagConstraints gbc_panelConfig = new GridBagConstraints();
						gbc_panelConfig.fill = GridBagConstraints.HORIZONTAL;
						gbc_panelConfig.anchor = GridBagConstraints.NORTH;
						gbc_panelConfig.insets = new Insets(0, 0, 5, 0);
						gbc_panelConfig.gridx = 0;
						gbc_panelConfig.gridy = 0;
						panelConfigAndCmd.add(panelConfig, gbc_panelConfig);
						GridBagLayout gbl_panelConfig = new GridBagLayout();
						gbl_panelConfig.columnWidths = new int[]{0, 93, 0, 0};
						gbl_panelConfig.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
						gbl_panelConfig.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
						gbl_panelConfig.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
						panelConfig.setLayout(gbl_panelConfig);
						{
							lblNewLabel = new JLabel("COM\uFF1A");
							GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
							gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
							gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
							gbc_lblNewLabel.gridx = 0;
							gbc_lblNewLabel.gridy = 0;
							panelConfig.add(lblNewLabel, gbc_lblNewLabel);
						}
						{
							txtPortNumber = new JTextField();
							GridBagConstraints gbc_txtPortNumber = new GridBagConstraints();
							gbc_txtPortNumber.insets = new Insets(0, 0, 5, 5);
							gbc_txtPortNumber.fill = GridBagConstraints.HORIZONTAL;
							gbc_txtPortNumber.gridx = 1;
							gbc_txtPortNumber.gridy = 0;
							panelConfig.add(txtPortNumber, gbc_txtPortNumber);
							txtPortNumber.setColumns(10);
						}
						{
							btnOpenPort = new JButton("\u6253\u5F00");
							GridBagConstraints gbc_btnOpenPort = new GridBagConstraints();
							gbc_btnOpenPort.fill = GridBagConstraints.HORIZONTAL;
							gbc_btnOpenPort.insets = new Insets(0, 0, 5, 0);
							gbc_btnOpenPort.gridx = 2;
							gbc_btnOpenPort.gridy = 0;
							panelConfig.add(btnOpenPort, gbc_btnOpenPort);
						}
						{
							lblNewLabel_1 = new JLabel("\u6CE2\u7279\u7387\uFF1A");
							GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
							gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
							gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
							gbc_lblNewLabel_1.gridx = 0;
							gbc_lblNewLabel_1.gridy = 1;
							panelConfig.add(lblNewLabel_1, gbc_lblNewLabel_1);
						}
						{
							txtBaudRate = new JTextField();
							GridBagConstraints gbc_txtBaudRate = new GridBagConstraints();
							gbc_txtBaudRate.insets = new Insets(0, 0, 5, 5);
							gbc_txtBaudRate.fill = GridBagConstraints.HORIZONTAL;
							gbc_txtBaudRate.gridx = 1;
							gbc_txtBaudRate.gridy = 1;
							panelConfig.add(txtBaudRate, gbc_txtBaudRate);
							txtBaudRate.setColumns(10);
						}
						{
							btnDetect = new JButton("\u68C0\u6D4B...");
							GridBagConstraints gbc_btnDetect = new GridBagConstraints();
							gbc_btnDetect.fill = GridBagConstraints.HORIZONTAL;
							gbc_btnDetect.insets = new Insets(0, 0, 5, 0);
							gbc_btnDetect.gridx = 2;
							gbc_btnDetect.gridy = 1;
							panelConfig.add(btnDetect, gbc_btnDetect);
						}
						{
							lblNewLabel_2 = new JLabel("\u6821\u9A8C\u4F4D\uFF1A");
							GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
							gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
							gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
							gbc_lblNewLabel_2.gridx = 0;
							gbc_lblNewLabel_2.gridy = 3;
							panelConfig.add(lblNewLabel_2, gbc_lblNewLabel_2);
						}
						{
							comboBox = new JComboBox();
							comboBox.setModel(new DefaultComboBoxModel(new String[] {"\u65E0", "\u5947\u6821\u9A8C", "\u5076\u6821\u9A8C"}));
							GridBagConstraints gbc_comboBox = new GridBagConstraints();
							gbc_comboBox.insets = new Insets(0, 0, 5, 5);
							gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
							gbc_comboBox.gridx = 1;
							gbc_comboBox.gridy = 3;
							panelConfig.add(comboBox, gbc_comboBox);
						}
						{
							btnSetMoto = new JButton("Moto");
							GridBagConstraints gbc_btnSetMoto = new GridBagConstraints();
							gbc_btnSetMoto.fill = GridBagConstraints.HORIZONTAL;
							gbc_btnSetMoto.insets = new Insets(0, 0, 5, 0);
							gbc_btnSetMoto.gridx = 2;
							gbc_btnSetMoto.gridy = 3;
							panelConfig.add(btnSetMoto, gbc_btnSetMoto);
						}
						{
							lblNewLabel_3 = new JLabel("\u505C\u6B62\u4F4D\uFF1A");
							GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
							gbc_lblNewLabel_3.anchor = GridBagConstraints.EAST;
							gbc_lblNewLabel_3.insets = new Insets(0, 0, 0, 5);
							gbc_lblNewLabel_3.gridx = 0;
							gbc_lblNewLabel_3.gridy = 4;
							panelConfig.add(lblNewLabel_3, gbc_lblNewLabel_3);
						}
						{
							comboBox_1 = new JComboBox();
							comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"1", "1.5", "2", "\u65E0"}));
							GridBagConstraints gbc_comboBox_1 = new GridBagConstraints();
							gbc_comboBox_1.insets = new Insets(0, 0, 0, 5);
							gbc_comboBox_1.fill = GridBagConstraints.HORIZONTAL;
							gbc_comboBox_1.gridx = 1;
							gbc_comboBox_1.gridy = 4;
							panelConfig.add(comboBox_1, gbc_comboBox_1);
						}
						{
							btnSetSepura = new JButton("Sepura");
							GridBagConstraints gbc_btnSetSepura = new GridBagConstraints();
							gbc_btnSetSepura.fill = GridBagConstraints.HORIZONTAL;
							gbc_btnSetSepura.gridx = 2;
							gbc_btnSetSepura.gridy = 4;
							panelConfig.add(btnSetSepura, gbc_btnSetSepura);
						}
						{
							lblNewLabel_4 = new JLabel("\u6570\u636E\u4F4D\uFF1A");
							GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
							gbc_lblNewLabel_4.anchor = GridBagConstraints.EAST;
							gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
							gbc_lblNewLabel_4.gridx = 0;
							gbc_lblNewLabel_4.gridy = 2;
							panelConfig.add(lblNewLabel_4, gbc_lblNewLabel_4);
						}
						{
							txtDataBits = new JTextField();
							GridBagConstraints gbc_txtDataBits = new GridBagConstraints();
							gbc_txtDataBits.insets = new Insets(0, 0, 5, 5);
							gbc_txtDataBits.fill = GridBagConstraints.HORIZONTAL;
							gbc_txtDataBits.gridx = 1;
							gbc_txtDataBits.gridy = 2;
							panelConfig.add(txtDataBits, gbc_txtDataBits);
							txtDataBits.setColumns(10);
						}
						{
							btnNewButton = new JButton("\u67E5\u770B...");
							GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
							gbc_btnNewButton.fill = GridBagConstraints.HORIZONTAL;
							gbc_btnNewButton.insets = new Insets(0, 0, 5, 0);
							gbc_btnNewButton.gridx = 2;
							gbc_btnNewButton.gridy = 2;
							panelConfig.add(btnNewButton, gbc_btnNewButton);
						}
					}
					{
						panelCmd = new JPanel();
						panelCmd.setBorder(new TitledBorder(null, "\u6307\u4EE4", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(51, 51, 51)));
						GridBagConstraints gbc_panelCmd = new GridBagConstraints();
						gbc_panelCmd.anchor = GridBagConstraints.NORTH;
						gbc_panelCmd.fill = GridBagConstraints.BOTH;
						gbc_panelCmd.gridx = 0;
						gbc_panelCmd.gridy = 1;
						panelConfigAndCmd.add(panelCmd, gbc_panelCmd);
						GridBagLayout gbl_panelCmd = new GridBagLayout();
						gbl_panelCmd.columnWidths = new int[]{0, 84, 0, 0};
						gbl_panelCmd.rowHeights = new int[]{0, 0, 0, 0};
						gbl_panelCmd.columnWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
						gbl_panelCmd.rowWeights = new double[]{1.0, 0.0, 0.0, Double.MIN_VALUE};
						panelCmd.setLayout(gbl_panelCmd);
						{
							scrollPaneCmd = new JScrollPane();
							GridBagConstraints gbc_scrollPaneCmd = new GridBagConstraints();
							gbc_scrollPaneCmd.gridwidth = 3;
							gbc_scrollPaneCmd.insets = new Insets(0, 0, 5, 0);
							gbc_scrollPaneCmd.fill = GridBagConstraints.BOTH;
							gbc_scrollPaneCmd.gridx = 0;
							gbc_scrollPaneCmd.gridy = 0;
							panelCmd.add(scrollPaneCmd, gbc_scrollPaneCmd);
							{
								listCmd = new JList();
								listCmd.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
								listCmd.setModel(new AbstractListModel() {
									String[] values = new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15"};
									public int getSize() {
										return values.length;
									}
									public Object getElementAt(int index) {
										return values[index];
									}
								});
								scrollPaneCmd.setViewportView(listCmd);
							}
						}
						{
							btnAddCmd = new JButton("\u6DFB\u52A0");
							GridBagConstraints gbc_btnAddCmd = new GridBagConstraints();
							gbc_btnAddCmd.fill = GridBagConstraints.HORIZONTAL;
							gbc_btnAddCmd.insets = new Insets(0, 0, 5, 5);
							gbc_btnAddCmd.gridx = 0;
							gbc_btnAddCmd.gridy = 1;
							panelCmd.add(btnAddCmd, gbc_btnAddCmd);
						}
						{
							btnRemoveCmd = new JButton("\u79FB\u9664");
							GridBagConstraints gbc_btnRemoveCmd = new GridBagConstraints();
							gbc_btnRemoveCmd.fill = GridBagConstraints.HORIZONTAL;
							gbc_btnRemoveCmd.insets = new Insets(0, 0, 5, 5);
							gbc_btnRemoveCmd.gridx = 1;
							gbc_btnRemoveCmd.gridy = 1;
							panelCmd.add(btnRemoveCmd, gbc_btnRemoveCmd);
						}
						{
							btnClearCmd = new JButton("\u6E05\u7A7A");
							GridBagConstraints gbc_btnClearCmd = new GridBagConstraints();
							gbc_btnClearCmd.fill = GridBagConstraints.HORIZONTAL;
							gbc_btnClearCmd.insets = new Insets(0, 0, 5, 0);
							gbc_btnClearCmd.gridx = 2;
							gbc_btnClearCmd.gridy = 1;
							panelCmd.add(btnClearCmd, gbc_btnClearCmd);
						}
						{
							btnImportCmd = new JButton("\u5BFC\u5165...");
							GridBagConstraints gbc_btnImportCmd = new GridBagConstraints();
							gbc_btnImportCmd.fill = GridBagConstraints.HORIZONTAL;
							gbc_btnImportCmd.insets = new Insets(0, 0, 0, 5);
							gbc_btnImportCmd.gridx = 0;
							gbc_btnImportCmd.gridy = 2;
							panelCmd.add(btnImportCmd, gbc_btnImportCmd);
						}
						{
							btnExportCmd = new JButton("\u5BFC\u51FA...");
							GridBagConstraints gbc_btnExportCmd = new GridBagConstraints();
							gbc_btnExportCmd.fill = GridBagConstraints.HORIZONTAL;
							gbc_btnExportCmd.insets = new Insets(0, 0, 0, 5);
							gbc_btnExportCmd.gridx = 1;
							gbc_btnExportCmd.gridy = 2;
							panelCmd.add(btnExportCmd, gbc_btnExportCmd);
						}
						{
							chckbxAutosaveCmd = new JCheckBox("\u81EA\u52A8\u4FDD\u5B58");
							chckbxAutosaveCmd.setToolTipText("Auto Save");
							chckbxAutosaveCmd.setSelected(true);
							GridBagConstraints gbc_chckbxAutosaveCmd = new GridBagConstraints();
							gbc_chckbxAutosaveCmd.fill = GridBagConstraints.HORIZONTAL;
							gbc_chckbxAutosaveCmd.gridx = 2;
							gbc_chckbxAutosaveCmd.gridy = 2;
							panelCmd.add(chckbxAutosaveCmd, gbc_chckbxAutosaveCmd);
						}
					}
				}
				{
					tabbedPaneRxData = new JTabbedPane(JTabbedPane.TOP);
					splitPaneConfigAndRx.setRightComponent(tabbedPaneRxData);
					{
						scrollPaneRxText = new JScrollPane();
						tabbedPaneRxData.addTab("\u6587\u672C", null, scrollPaneRxText, null);
						{
							textAreaRxText = new JTextArea();
							textAreaRxText.setLineWrap(true);
							scrollPaneRxText.setViewportView(textAreaRxText);
						}
					}
					{
						scrollPaneRxHex = new JScrollPane();
						tabbedPaneRxData.addTab("\u5341\u516D\u8FDB\u5236", null, scrollPaneRxHex, null);
						{
							textAreaRxHex = new JTextArea();
							textAreaRxHex.setLineWrap(true);
							scrollPaneRxHex.setViewportView(textAreaRxHex);
						}
					}
				}
			}
			{
				panelSend = new JPanel();
				panelSend.setBorder(new TitledBorder(null, "\u53D1\u9001", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(51, 51, 51)));
				splitPaneMain.setRightComponent(panelSend);
				panelSend.setLayout(new BoxLayout(panelSend, BoxLayout.Y_AXIS));
				{
					scrollPaneSend = new JScrollPane();
					scrollPaneSend.setAlignmentY(Component.TOP_ALIGNMENT);
					scrollPaneSend.setAlignmentX(Component.LEFT_ALIGNMENT);
					panelSend.add(scrollPaneSend);
					{
						textAreaSend = new JTextArea();
						textAreaSend.setLineWrap(true);
						scrollPaneSend.setViewportView(textAreaSend);
					}
				}
				{
					hBoxSendBtn = Box.createHorizontalBox();
					hBoxSendBtn.setAlignmentX(Component.LEFT_ALIGNMENT);
					panelSend.add(hBoxSendBtn);
					{
						btnSend = new JButton("\u53D1\u9001");
						hBoxSendBtn.add(btnSend);
					}
					{
						hGlueSend = Box.createHorizontalGlue();
						hBoxSendBtn.add(hGlueSend);
					}
					{
						btnHelp = new JButton("\u5E2E\u52A9...");
						hBoxSendBtn.add(btnHelp);
					}
					{
						btnExit = new JButton("\u9000\u51FA");
						hBoxSendBtn.add(btnExit);
					}
				}
			}
		}
		{
			vStrutBottom = Box.createVerticalStrut(20);
			frmMsserialport.getContentPane().add(vStrutBottom);
		}
	}

}
