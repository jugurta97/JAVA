package dz.micka;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class ProductsMenu extends JFrame{
	private static final long serialVersionUID = 3984766994215737254L;
	
	private static JFrame productsWindow;
	private JPanel contentPane ; 
	
	public ProductsMenu() {
		super ("Products Menu");
		this.setSize(600,400);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);	
		
		JLabel productsTextLabel = new JLabel("Choose your option:");
		productsTextLabel.setSize(150, 20);
		productsTextLabel.setLocation(250, 10);
		contentPane.add(productsTextLabel);
		
		
		JButton addProductBtn = new JButton("Add a Product");
		addProductBtn.setSize(300 , 30);
		addProductBtn.setLocation(160, 50);
		addProductBtn.addActionListener((e)->addProductBtnListener(e));
		contentPane.add(addProductBtn);
		
		JButton deleteProductBtn = new JButton("Delete a product");
		deleteProductBtn.setSize(300 , 30);
		deleteProductBtn.setLocation(160, 90);
		deleteProductBtn.addActionListener((e)->deleteProductBtnListener(e));
		contentPane.add(deleteProductBtn);
		
		JButton showProductBtn = new JButton("Show the products");
		showProductBtn.setSize(300 , 30);
		showProductBtn.setLocation(160, 130);
		showProductBtn.addActionListener((e)->showProductBtnListener(e));
		contentPane.add(showProductBtn);
		
		JButton goBackBtn = new JButton ("Go Back"); 
		goBackBtn.setSize (300 , 30); 
		goBackBtn.setLocation(160, 250);
		goBackBtn.setFont(new Font("Tahoma", Font.PLAIN, 20));
		goBackBtn.addActionListener((e)->goBackBtnListener(e));
		contentPane.add(goBackBtn);
		
	
		
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new LineBorder(Color.RED));
		
	}

	private void addProductBtnListener (ActionEvent e) {
		ProductAddForm.main(new String [] {});
		productsWindow.dispose();
	} 
	
	private void deleteProductBtnListener (ActionEvent e) {
		ProductDeleteForm.main( new String [] {});
		productsWindow.dispose();
	}
	private void showProductBtnListener (ActionEvent e) {
		ProductShow.main(new String [] {});
		productsWindow.dispose();
	}
	private void goBackBtnListener (ActionEvent e) {
		StoreMenu.main(new String[] {});
		productsWindow.dispose();
	}
	public static void main(String[] args) {
		productsWindow = new ProductsMenu(); 
		productsWindow.setVisible(true);
		
	}

}
