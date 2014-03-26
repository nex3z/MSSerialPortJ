import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.Box;
import java.awt.Component;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JProgressBar;
import javax.swing.SwingConstants;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;


public class MSDetect extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("ch.randelshofer.quaqua.tiger.Quaqua15TigerCrossPlatformLookAndFeel");
			JDialog.setDefaultLookAndFeelDecorated(true);
		} catch (Throwable e) {
			e.printStackTrace();
		}
		try {
			MSDetect dialog = new MSDetect();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public MSDetect() {
		setResizable(false);
		setTitle("MSDetect");
		setBounds(100, 100, 465, 376);
		getContentPane().setLayout(new BorderLayout());
		getContentPane().add(contentPanel, BorderLayout.NORTH);
		contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.Y_AXIS));
		{
			JLabel lblNewLabel = new JLabel("<html>hello <br> world!</html>");
			lblNewLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
			contentPanel.add(lblNewLabel);
		}
		{
			Box horizontalBox = Box.createHorizontalBox();
			contentPanel.add(horizontalBox);
			{
				JButton btnNewButton = new JButton("New button");
				horizontalBox.add(btnNewButton);
			}
			{
				Component horizontalStrut = Box.createHorizontalStrut(20);
				horizontalBox.add(horizontalStrut);
			}
			{
				JButton btnNewButton_1 = new JButton("New button");
				horizontalBox.add(btnNewButton_1);
			}
		}
		{
			Box verticalBox = Box.createVerticalBox();
			contentPanel.add(verticalBox);
			{
				JScrollPane scrollPane = new JScrollPane();
				verticalBox.add(scrollPane);
				{
					JTextArea textArea = new JTextArea();
					textArea.setBackground(UIManager.getColor("FormattedTextField.inactiveBackground"));
					textArea.setForeground(SystemColor.desktop);
					textArea.setLineWrap(true);
					textArea.setRows(11);
					scrollPane.setViewportView(textArea);
				}
			}
			{
				JProgressBar progressBar = new JProgressBar();
				progressBar.setValue(20);
				verticalBox.add(progressBar);
			}
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

}
