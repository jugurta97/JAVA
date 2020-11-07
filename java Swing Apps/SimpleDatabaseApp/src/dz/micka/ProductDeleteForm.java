package dz.micka;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class ProductDeleteForm extends JFrame{
		private static final long serialVersionUID = -6505718931088032963L;
		
		private static JFrame productsDeleteWindow ;
		private JPanel contentPane ; 
		private JTextField nameProductTextField ;
		
		public ProductDeleteForm () {
			super ("Product Delete Form"); 
			this.setSize(600,400);
			this.setLocationRelativeTo(null);
			this.setResizable(false);
			this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
			
			contentPane = new JPanel();
			contentPane.setLayout(null);
			setContentPane(contentPane);
			
			JLabel textProductLabel  = new JLabel("Product Information : ");
			textProductLabel.setSize(140,30);
			textProductLabel.setLocation(220, 10);
			contentPane.add(textProductLabel);
			
			JLabel nameProductLabel = new JLabel("Name Of The Product :");
			nameProductLabel.setSize(140 , 30);
			nameProductLabel.setLocation(100, 40);
			contentPane.add(nameProductLabel);
			
			nameProductTextField = new JTextField() ;
			nameProductTextField.setSize(180, 30);
			nameProductTextField.setLocation(330,40);
			contentPane.add(nameProductTextField);
			
			JButton deleteProductBtn = new JButton("Delete Product"); 
			deleteProductBtn.setSize(160,30);
			deleteProductBtn.setLocation(230 , 120);
			deleteProductBtn.addActionListener((e) -> deleteProductBtnListener(e));
			contentPane.add(deleteProductBtn);
			
			JButton goBackBtn = new JButton("Go Back"); 
			goBackBtn.setSize(300 , 30 );
			goBackBtn.setLocation(160 , 180);
			goBackBtn.setFont(new Font("Tahoma", Font.PLAIN, 20));
			goBackBtn.addActionListener((e) -> goBackBtnListener(e));
			contentPane.add(goBackBtn);
			
			
			contentPane.setBackground(Color.LIGHT_GRAY);
			contentPane.setBorder(new LineBorder(Color.RED));
		}	
		private void deleteProductBtnListener (ActionEvent e) {
			String name = nameProductTextField.getText();
			if(name==null||name.trim().equals("")){
				JOptionPane.showMessageDialog(ProductDeleteForm.this,"Product Name can't be blank");
			}else{
			int i = ProductsDao.deleteProduct(name);
			
			if (i>0) {
				JOptionPane.showMessageDialog(ProductDeleteForm.this,"Product succesfuly deleted !");
				ProductsMenu.main(new String [] {});
				productsDeleteWindow.dispose();
			}else {
				JOptionPane.showMessageDialog(ProductDeleteForm.this, "Unable to delete the product !");
			}
		}	
	}
	
		private void goBackBtnListener (ActionEvent e) {
			ProductsMenu.main(new String [] {});
			productsDeleteWindow.dispose();
		}
		
	
		public static void main(String[] args) {
		productsDeleteWindow = new ProductDeleteForm(); 
		productsDeleteWindow.setVisible(true);
	}

}
