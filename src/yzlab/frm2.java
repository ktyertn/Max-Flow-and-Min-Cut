package yzlab;

import static javax.swing.JOptionPane.showMessageDialog;

import java.awt.BorderLayout;
import java.awt.Dimension;
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

public class frm2 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	
	public frm2(int N) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Toolkit toolkit=getToolkit();
		Dimension size=toolkit.getScreenSize();
		setLocation(size.width/2-getWidth()/2,size.height/2-getHeight()/2);
		
		JLabel lblNewLabel = new JLabel("Ba\u015Flang\u0131\u00E7 Noktas\u0131 :");
		lblNewLabel.setBounds(114, 50, 97, 21);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(213, 50, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblBitiNoktas = new JLabel("Biti\u015F Noktas\u0131 :");
		lblBitiNoktas.setBounds(114, 82, 97, 21);
		contentPane.add(lblBitiNoktas);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(213, 82, 86, 20);
		contentPane.add(textField_1);
		
		JButton btnNewButton = new JButton("Devam->");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String bNokta=textField.getText().toString();
				int Bnokta=Integer.parseInt(bNokta);
				
				String sNokta=textField_1.getText().toString();
				int Snokta=Integer.parseInt(sNokta);
				
				frm3 frm3=new frm3(N, Bnokta,Snokta);
				frm3.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton.setBounds(164, 140, 89, 23);
		contentPane.add(btnNewButton);
	}
}
