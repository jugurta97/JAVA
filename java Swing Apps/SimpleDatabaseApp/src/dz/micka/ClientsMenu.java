package dz.micka;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class ClientsMenu extends JFrame{
	private static final long serialVersionUID = -5562007584728049950L;
	
	static JFrame clientMenuWindow ; 
	private JPanel contentPane ;
	
	public ClientsMenu () {
		super ("Clients Menu Window");
		this.setSize(600, 400);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		contentPane = new JPanel(); 
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel labelClientMenu = new JLabel("Choose Your Option:");
		labelClientMenu.setSize(150 , 20);
		labelClientMenu.setLocation(250 ,20);
		contentPane.add(labelClientMenu);
		
		JButton addClientBtn = new JButton("Add Client"); 
		addClientBtn.setSize(300  , 30 );
		addClientBtn.setLocation (160 , 50 );
		addClientBtn.addActionListener((e) -> addClientBtnListener(e));
		contentPane.add(addClientBtn);
		
		JButton removeClientBtn = new JButton("Remove Client");
		removeClientBtn.setSize(300 , 30 );
		removeClientBtn.setLocation(160 , 90);
		removeClientBtn.addActionListener((e) -> removeClientBtnListener(e));
		contentPane.add(removeClientBtn);
		
		JButton showClientBtn  = new  JButton("Show The Clients"); 
		showClientBtn.setSize(300 , 30 );
		showClientBtn.setLocation(160 , 130);
		showClientBtn.addActionListener((e) -> showClientBtnListener(e));
		contentPane.add(showClientBtn); 
		
		JButton goBackBtn = new JButton("Go Back"); 
		goBackBtn.setSize(300 , 30);
		goBackBtn.setLocation(160 , 250);
		goBackBtn.setFont(new Font("Tahoma", Font.PLAIN, 20));	
		goBackBtn.addActionListener((e) -> goBackBtnListener(e));
		contentPane.add(goBackBtn);
		


		
	
		
		contentPane.setBorder(new LineBorder(Color.RED));
		contentPane.setBackground(Color.LIGHT_GRAY);
	}
	private void addClientBtnListener (ActionEvent e) {
		ClientAddForm.main(new String [] {});
		clientMenuWindow.dispose();
	}
	private void removeClientBtnListener (ActionEvent e) {
		ClientDeleteForm.main(new String [] {});
		clientMenuWindow.dispose();
	}
	private void showClientBtnListener (ActionEvent e) {
		
	}
	
	private void goBackBtnListener (ActionEvent e) {
		StoreMenu.main(new String [] {});
		clientMenuWindow.dispose();
	}
		
	public static void main(String[] args) {
		clientMenuWindow = new ClientsMenu();
		clientMenuWindow.setVisible(true);
	}
}
