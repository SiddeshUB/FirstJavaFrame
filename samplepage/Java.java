package samplepage;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Java extends JFrame {

//	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textName;
	private JTextField textAge;
	JLabel lblInfo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Java frame = new Java();
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
	public Java() {
		setTitle("Java Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 458, 331);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter Name");
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		lblNewLabel.setBounds(30, 28, 119, 32);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter Age");
		lblNewLabel_1.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		lblNewLabel_1.setBounds(30, 100, 119, 23);
		contentPane.add(lblNewLabel_1);
		
		JTextField textName = new JTextField();
		textName.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		textName.setBounds(197, 37, 180, 23);
		contentPane.add(textName);
		textName.setColumns(10);
		
		textAge = new JTextField();
		textAge.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		textAge.setBounds(197, 100, 180, 23);
		contentPane.add(textAge);
		textAge.setColumns(10);
		
		JButton btnOk = new JButton("Ok");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n=textName.getText();
				int age =Integer.parseInt(textAge.getText());
				if(age>=18) {
					lblInfo.setText(n+" You are eligile to vote!");
				}
				else {
					lblInfo.setText(n+" You are not eligile to vote!");
				}
			}
		});
		btnOk.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		btnOk.setBounds(39, 179, 89, 23);
		contentPane.add(btnOk);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textName.setText("");
				textAge.setText("");
				lblInfo.setText("");
			}
		});
		btnReset.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		btnReset.setBounds(197, 179, 89, 23);
		contentPane.add(btnReset);
		
		lblInfo = new JLabel("");
		lblInfo.setBounds(73, 253, 304, 23);
		contentPane.add(lblInfo);
	}
}
