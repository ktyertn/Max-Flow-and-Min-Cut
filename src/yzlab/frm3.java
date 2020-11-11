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

public class frm3 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblSonrakiNokta;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JLabel lblAkYounluu;
	private JTextField textField_2;

	public frm3(int N,int bNokta,int sNokta) {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Toolkit toolkit=getToolkit();
		Dimension size=toolkit.getScreenSize();
		setLocation(size.width/2-getWidth()/2,size.height/2-getHeight()/2);
		
		showMessageDialog(null,N+"\n"+bNokta+"\n"+sNokta);
		
		JLabel lblNewLabel = new JLabel("\u00D6nceki Nokta:");
		lblNewLabel.setBounds(108, 52, 89, 22);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(205, 53, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(205, 84, 86, 20);
		contentPane.add(textField_1);
		
		lblSonrakiNokta = new JLabel("Sonraki Nokta:");
		lblSonrakiNokta.setBounds(106, 85, 89, 22);
		contentPane.add(lblSonrakiNokta);
		int graph[][]=new int[N][N];
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				graph[i][j]=0;
			}
		}
		btnNewButton = new JButton("Kenar Ekle");

		btnNewButton.setBounds(163, 129, 89, 23);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Devam->");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MaxFlow m = new MaxFlow(N); 
				int mFlow=m.fordFulkerson(graph, bNokta, sNokta);
				showMessageDialog(null,mFlow);
				
				 
			}
		});
		btnNewButton_1.setBounds(163, 173, 89, 23);
		contentPane.add(btnNewButton_1);
		
		lblAkYounluu = new JLabel("Ak\u0131\u015F Yo\u011Funlu\u011Fu:");
		lblAkYounluu.setBounds(108, 19, 89, 22);
		contentPane.add(lblAkYounluu);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(205, 20, 86, 20);
		contentPane.add(textField_2);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				String node1=textField.getText().toString();
				int Node1=Integer.parseInt(node1);
				
				String node2=textField_1.getText().toString();
				int Node2=Integer.parseInt(node2);
				
				String tmp=textField_2.getText().toString();
				int akýsYogunlugu=Integer.parseInt(tmp);
				
				graph[Node1-1][Node2-1]=akýsYogunlugu;
				//showMessageDialog(null,graph[Node1-1][Node2-1]);
				
				for(int i=0;i<N;i++) {
					for(int j=0;j<N;j++) {
						System.out.print(graph[i][j]+"\t");
					}
					System.out.print("\n");
				}
				System.out.print("\n");
			}
		});
	}
}
