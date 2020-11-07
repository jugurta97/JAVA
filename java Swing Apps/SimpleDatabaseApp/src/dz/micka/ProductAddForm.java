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

public class ProductAddForm extends JFrame {

	private static final long serialVersionUID = 7563647280859776365L;
	
	private static JFrame productAddWindow ;
	private JPanel contentPane ; 
	private JTextField descProductTextField ;
	private JTextField priceBuyProductTextField;
	private JTextField priceSellProductTextField;
	private JTextField stockProducttextField;
	
	
	public ProductAddForm () {
		super ("Product Add Form"); 
		this.setSize(600,400);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		contentPane = new JPanel (); 
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel textProductLabel  = new JLabel("Product Information : ");
		textProductLabel.setSize(140,30);
		textProductLabel.setLocation(220, 10);
		contentPane.add(textProductLabel);
		
		JLabel descProductLabel  = new JLabel("Product Description : ");
		descProductLabel.setSize(140,30);
		descProductLabel.setLocation(100, 40);
		contentPane.add(descProductLabel);

		descProductTextField = new JTextField();
		descProductTextField.setSize(180,30);
		descProductTextField.setLocation(330,40);
		contentPane.add(descProductTextField);
		
		JLabel priceBuyProductLabel  = new JLabel("Product buy price : ");
		priceBuyProductLabel.setSize(140,30);
		priceBuyProductLabel.setLocation(100, 80);
		contentPane.add(priceBuyProductLabel);

		priceBuyProductTextField = new JTextField();
		priceBuyProductTextField.setSize(180,30);
		priceBuyProductTextField.setLocation(330,80);
		contentPane.add(priceBuyProductTextField);
		
		JLabel priceSellProductLabel  = new JLabel("Product sell price : ");
		priceSellProductLabel.setSize(140,30);
		priceSellProductLabel.setLocation(100, 120);
		contentPane.add(priceSellProductLabel);

		priceSellProductTextField = new JTextField();
		priceSellProductTextField.setSize(180,30);
		priceSellProductTextField.setLocation(330,120);
		contentPane.add(priceSellProductTextField);
		
		JLabel stockProductLabel  = new JLabel("Product available instock : ");
		stockProductLabel.setSize(160,30);
		stockProductLabel.setLocation(100, 160);
		contentPane.add(stockProductLabel);

		stockProducttextField = new JTextField();
		stockProducttextField.setSize(180,30);
		stockProducttextField.setLocation(330,160);
		contentPane.add(stockProducttextField);
		
		JButton addProductBtn  = new JButton("Add Product ");
		addProductBtn.setSize(160,30);
		addProductBtn.setLocation(230, 210);
		addProductBtn.addActionListener((e)-> addProductBtnListener(e));
		contentPane.add(addProductBtn);
		
		JButton goBackBtn = new JButton ("Go Back"); 
		goBackBtn.setSize (300 , 30); 
		goBackBtn.setLocation(160, 250);
		goBackBtn.setFont(new Font("Tahoma", Font.PLAIN, 20));
		goBackBtn.addActionListener((e)->goBackBtnListener(e));
		contentPane.add(goBackBtn);
		
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new LineBorder(Color.RED));
	}
	
	
	private void addProductBtnListener(ActionEvent e) {
		String name = descProductTextField.getText();
		Float buyPrice = Float.parseFloat(priceBuyProductTextField.getText());
		Float sellPrice = Float.parseFloat(priceSellProductTextField.getText());
		int stockProduct = Integer.parseInt(stockProducttextField.getText());
		if(name==null||name.trim().isEmpty()){
			JOptionPane.showMessageDialog(ProductAddForm.this,"Product name can't be empty !");
		
			/*JOptionPane optionPane = new JOptionPane("thank you for using java",JOptionPane.WARNING_MESSAGE);
				JDialog dialog = optionPane.createDialog("Warning!");
					dialog.setAlwaysOnTop(true); // to show top of all other application
						dialog.setVisible(true); // to visible the dialog					*/

		}else{
		int i = ProductsDao.addProduct(name, buyPrice, sellPrice, stockProduct);
		
		if (i>0) {
			JOptionPane.showMessageDialog(ProductAddForm.this,"Product successfully Added!");
			ProductsMenu.main(new String [] {});
			productAddWindow.dispose();
		}else{
			JOptionPane.showMessageDialog(ProductAddForm.this,"Sorry, unable to Add the Product!");			
		}
	}	
}

	
	private void goBackBtnListener (ActionEvent e) {
		ProductsMenu.main(new String[] {});
		productAddWindow.dispose();
	}
	public static void main(String[] args) {
	productAddWindow = new ProductAddForm (); 
	productAddWindow.setVisible(true);
	}

}


/* message alerts samples 
 private void msgbox(String s){
   JOptionPane.showMessageDialog(null, s);
}
then call it with:
msgbox("don't touch that!");
*/
 