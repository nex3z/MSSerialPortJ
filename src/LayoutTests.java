import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import javax.swing.JPanel;
import java.awt.Insets;
import javax.swing.JSplitPane;
import javax.swing.BoxLayout;
import javax.swing.UIManager;
import javax.swing.Box;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Component;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.AbstractListModel;


public class LayoutTests {

	private JFrame frame;
	private JSplitPane splitPane;
	private JSplitPane splitPane_1;
	private Box verticalBox;
	private Box verticalBox_1;
	private Box verticalBox_2;
	private Box horizontalBox;
	private Box horizontalBox_1;
	private Box horizontalBox_2;
	private JLabel lblNewLabel;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JScrollPane scrollPane;
	private JList list;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
			JFrame.setDefaultLookAndFeelDecorated(true);
		} catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LayoutTests window = new LayoutTests();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LayoutTests() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	/**
	 * 
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 742, 491);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.X_AXIS));
		{
			splitPane = new JSplitPane();
			splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
			splitPane.setDividerLocation(400);
			frame.getContentPane().add(splitPane);
			{
				splitPane_1 = new JSplitPane();
				splitPane_1.setDividerLocation(200);
				splitPane.setLeftComponent(splitPane_1);
				
				{
					verticalBox = Box.createVerticalBox();
					splitPane_1.setLeftComponent(verticalBox);
					{
						verticalBox_1 = Box.createVerticalBox();
						verticalBox.add(verticalBox_1);
						{
							horizontalBox = Box.createHorizontalBox();
							verticalBox_1.add(horizontalBox);
							{
								lblNewLabel = new JLabel("New label");
								horizontalBox.add(lblNewLabel);
							}
							{
								btnNewButton = new JButton("New button");
								horizontalBox.add(btnNewButton);
							}
						}
						{
							horizontalBox_1 = Box.createHorizontalBox();
							verticalBox_1.add(horizontalBox_1);
							{
								btnNewButton_1 = new JButton("New button");
								horizontalBox_1.add(btnNewButton_1);
							}
						}
						{
							horizontalBox_2 = Box.createHorizontalBox();
							verticalBox_1.add(horizontalBox_2);
							{
								btnNewButton_2 = new JButton("New button");
								horizontalBox_2.add(btnNewButton_2);
							}
						}
					}
					{
						verticalBox_2 = Box.createVerticalBox();
						verticalBox.add(verticalBox_2);
						{
							scrollPane = new JScrollPane();
							verticalBox_2.add(scrollPane);
							{
								list = new JList();
								scrollPane.setViewportView(list);
							}
						}
					}
				}
			}
		}
	}

}
