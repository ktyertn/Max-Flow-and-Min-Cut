package yzlab;

import java.awt.BorderLayout;
import java.awt.Dimension;

import static javax.swing.JOptionPane.showMessageDialog;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frm1 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	static frm1 frame = new frm1();
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
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
	public frm1() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		Toolkit toolkit=getToolkit();
		Dimension size=toolkit.getScreenSize();
		setLocation(size.width/2-getWidth()/2,size.height/2-getHeight()/2);
		
		JLabel lblNewLabel = new JLabel("Musluk Say\u0131s\u0131m\u0131 Giriniz:");
		lblNewLabel.setBounds(43, 93, 156, 45);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(209, 105, 156, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Devam ->");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				
				String muslukSayýsý=textField.getText().toString();
				int mSayýsý=Integer.parseInt(muslukSayýsý);
				
				frm2 frm2=new frm2(mSayýsý);
				frm2.setVisible(true);
				frame.setVisible(false);
				
			
				
				
				
			}
		});
		btnNewButton.setBounds(167, 149, 89, 23);
		contentPane.add(btnNewButton);
	}
}