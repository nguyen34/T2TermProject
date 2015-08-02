package inputUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;

import org.zeromq.ZMQ;

public class InputUI extends JFrame {

	private JPanel contentPane;
	private JTextField inputText;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InputUI frame = new InputUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public InputUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		inputText = new JTextField();
		inputText.setBounds(108, 74, 182, 25);
		contentPane.add(inputText);
		inputText.setColumns(10);
		
		JButton submitButton = new JButton("Submit");
		submitButton.setBounds(157, 112, 97, 25);
		contentPane.add(submitButton);
	}
}
