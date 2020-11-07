package dz.micka;


import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class StoreMenu extends JFrame {

	private static final long serialVersionUID = 2086547380310265747L;
	private JPanel contentPane ; 
	static JFrame storeWindow;
	public StoreMenu () {
		
		super("Menu Store Window"); 
		this.setSize(600,400);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		
		
		
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);	

		
	    JLabel	menuTextLabel = new JLabel("Main Menu : "); 
		menuTextLabel.setSize(300, 30); 
		menuTextLabel.setLocation(250, 10);
		contentPane.add(menuTextLabel);       
		
		
		JButton productsBtn = new JButton("Products");
		productsBtn.setSize(200,30);
		productsBtn.setLocation(200,45); 
		productsBtn.addActionListener((e) -> productsBtnListener(e));
		contentPane.add(productsBtn);
		
		JButton clientsBtn = new JButton("Clients");
		clientsBtn.setSize(200,30);
		clientsBtn.setLocation(200,85);
		clientsBtn.addActionListener((e) -> clientsBtnListener(e));
		contentPane.add(clientsBtn);
			
		JButton invoicesBtn = new JButton("Invoices");
		invoicesBtn.setSize(200,30);
		invoicesBtn.setLocation(200,125); 
		invoicesBtn.addActionListener((e) -> invoicesBtnListener(e));;
		contentPane.add(invoicesBtn);
		
		JButton disconnectBtn = new JButton("Log Out !");
		disconnectBtn.setSize(200,30);
		disconnectBtn.setLocation(200,250); 
		disconnectBtn.addActionListener((e) -> disconnectBtnListner(e));
		contentPane.add(disconnectBtn);
		
		
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new LineBorder(Color.RED));
	}	

	private void productsBtnListener (ActionEvent e) {
		ProductsMenu.main(new String [] {});
		storeWindow.dispose();
	}
	
	private void clientsBtnListener (ActionEvent e) {
		ClientsMenu.main(new String [] {});
		storeWindow.dispose();
	}
	
	private void invoicesBtnListener (ActionEvent e) {
		
	}
	
	private void disconnectBtnListner (ActionEvent e) {
		int clickedBtn = JOptionPane.showConfirmDialog(StoreMenu.this,"Are you sure to disconnect ?!","Disconnecting", JOptionPane.YES_NO_OPTION);
		if (clickedBtn == JOptionPane.YES_OPTION) {
		AdminLogin.main(new String[] {});
		storeWindow.dispose();
		}
	}
	
	
	public static void main(String[] args)   {
			
		storeWindow = new StoreMenu () ; 
		storeWindow.setVisible(true);
	}

}
