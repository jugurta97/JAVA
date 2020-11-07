package dz.micka;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;


public class ClientAddForm extends JFrame{
	private static final long serialVersionUID = 310578294202648300L;

	private static JFrame clientAddWindow ; 
	private JPanel contentPane ;
	private JTextField  lastNameTextField ;  
	private JTextField firstNameTextField;
	private JTextField adressTextField;
	private JTextField cityTextField;
	private JTextField stateTextField;
	private JTextField zipCodeTextField;
	private JTextField countryTextField;
	private JTextField phoneNbrTextField;
	private JTextField emailTextField;
ClientAddForm ()  {
	   	super ("Client Add Form");
	   	this.setSize(600,500);
	   	this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		//setBounds(500, 200, 450, 404);
	
		
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel textLabel = new JLabel("Client Info :");
		textLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel lastNameLabel = new JLabel("LastName :");
		JLabel firstNameLabel = new JLabel("FirstName :");
		JLabel adressLabel = new JLabel("Adress :");
		JLabel cityLabel = new JLabel("City : ");
		JLabel stateLabel = new JLabel("State : ");
		JLabel zipCodeLabel = new JLabel("Zip Code : ");
		JLabel countryLabel = new JLabel("Country : ");
		JLabel phoneNbrLabel = new JLabel("Phone Number : ");
		JLabel emailLabel = new JLabel("Email :");
		
		
		
		lastNameTextField = new JTextField(50);
		firstNameTextField = new JTextField(20);
		adressTextField = new JTextField(20);
		cityTextField = new JTextField(20);
		stateTextField = new JTextField(20);
		zipCodeTextField = new JTextField(20);
		countryTextField = new JTextField(20);
		phoneNbrTextField = new JTextField(20);
		emailTextField = new JTextField(20);
		
		JButton addClientBtn = new JButton("Add Client");
		addClientBtn.addActionListener((e)-> addClientBtnListener(e));
		JButton goBackBtn = new JButton("Go Back ");
		goBackBtn.addActionListener((e) -> goBackBtnListener(e));
	 
		
		GroupLayout myLayout = new GroupLayout(contentPane);
	        
	       myLayout.setHorizontalGroup(
	        	  myLayout.createParallelGroup(Alignment.TRAILING)
	    			.addGroup(  myLayout.createSequentialGroup()
	    				.addGroup(myLayout.createParallelGroup(Alignment.LEADING)	
	    					.addGroup(myLayout.createSequentialGroup()
	    							.addGap(230)
	    							.addComponent(textLabel))
		    				.addGroup(myLayout.createSequentialGroup()
		    							.addGap(80)
		    					.addGroup( myLayout.createParallelGroup(Alignment.LEADING , false)
		    							.addComponent(lastNameLabel , GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
		    							.addComponent(firstNameLabel , GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
		    							.addComponent(adressLabel , GroupLayout.PREFERRED_SIZE, 150,GroupLayout.PREFERRED_SIZE)
		    							.addComponent(cityLabel, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
		    							.addComponent(stateLabel, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
		    							.addComponent(zipCodeLabel, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
		    							.addComponent(countryLabel, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
		    							.addComponent(phoneNbrLabel, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
		    							.addComponent(emailLabel, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)		)
		    							.addGap(80)
		    					.addGroup( myLayout.createParallelGroup(Alignment.LEADING)	
		    							.addComponent(lastNameTextField ,GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE)
		    							.addComponent(firstNameTextField,GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE)
		    							.addComponent(adressTextField,GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE)
		    							.addComponent(cityTextField ,GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE)
		    							.addComponent(stateTextField,GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE)
		    							.addComponent(zipCodeTextField,GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE)
		    							.addComponent(countryTextField,GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE)
		    							.addComponent(phoneNbrTextField,GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE)
		    							.addComponent(emailTextField,GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE)
		    							) ) )
		    				.addContainerGap(125, Short.MAX_VALUE)) 
		    			.addGroup(Alignment.LEADING, myLayout.createSequentialGroup()
		    					.addGap(220)
		    					.addComponent(addClientBtn,GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE))
		    			.addGroup(Alignment.LEADING ,myLayout.createSequentialGroup()
		    					.addGap(480)
		    					.addComponent(goBackBtn))
		    			  );
	    						

		
		
		myLayout.setVerticalGroup(
				myLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(myLayout.createSequentialGroup()
						.addComponent(textLabel)
						.addGap(18)
							.addGroup(myLayout.createParallelGroup(Alignment.BASELINE)
									.addComponent(lastNameLabel)
									.addComponent(lastNameTextField ,GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(myLayout.createParallelGroup(Alignment.BASELINE)
									.addComponent(firstNameLabel)
									.addComponent(firstNameTextField,GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(myLayout.createParallelGroup(Alignment.BASELINE)
									.addComponent(adressLabel)
									.addComponent(adressTextField,GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(myLayout.createParallelGroup(Alignment.BASELINE)
									.addComponent(cityLabel)
									.addComponent(cityTextField,GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(myLayout.createParallelGroup(Alignment.BASELINE)
									.addComponent(stateLabel)
									.addComponent(stateTextField,GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(myLayout.createParallelGroup(Alignment.BASELINE)
									.addComponent(zipCodeLabel)
									.addComponent(zipCodeTextField,GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
																		 
							.addGap(18)
							.addGroup(myLayout.createParallelGroup(Alignment.BASELINE)
									.addComponent(countryLabel)
									.addComponent(countryTextField,GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))			
							.addGap(18)
							.addGroup(myLayout.createParallelGroup(Alignment.BASELINE)
									.addComponent(phoneNbrLabel)
									.addComponent(phoneNbrTextField,GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))					
							.addGap(18)
							.addGroup(myLayout.createParallelGroup(Alignment.BASELINE)
									.addComponent(emailLabel)
									.addComponent(emailTextField,GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(30)
							.addComponent(addClientBtn, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
							.addComponent(goBackBtn, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
							
							.addContainerGap(53, Short.MAX_VALUE))
				
				);
		
		contentPane.setLayout(myLayout);
            
		
		contentPane.setBorder(new LineBorder(Color.RED));
		contentPane.setBackground(Color.LIGHT_GRAY);
	}
	private void addClientBtnListener (ActionEvent e) {
		String lastName = lastNameTextField.getText();
		String firstName = firstNameTextField.getText();
		String adress = adressTextField.getText();
		String city = cityTextField.getText();
		String state = stateTextField.getText();
		String zipCode = zipCodeTextField.getText();
		String country = countryTextField.getText();
		String phoneNbr = phoneNbrTextField.getText();
		String email = emailTextField.getText();
		
		int i = ClientsDao.addClient(lastName,firstName,adress,city,state,zipCode,country,phoneNbr,email);
		
		if (lastName.isEmpty() & firstName.isEmpty() ) {
			JOptionPane.showMessageDialog(ClientAddForm.this ,"Can't add a client with empty Lastname and firstName ","Error",JOptionPane.ERROR_MESSAGE);
		}else {
		
			if (i>0) {
		int clickedBtn =JOptionPane.showConfirmDialog(ClientAddForm.this, "Client Succesfuly Added,Would you add an Other ?","Information",JOptionPane.YES_NO_OPTION);
						if(clickedBtn == JOptionPane.YES_OPTION) {
							lastNameTextField.setText(null); 	firstNameTextField.setText(null);
							adressTextField.setText(null); 		cityTextField.setText(null);
							stateTextField.setText(null); 		zipCodeTextField.setText(null);
							countryTextField.setText("");		phoneNbrTextField.setText("");
							emailTextField.setText("");
						}else {
							ClientsMenu.main(new String [] {});
							clientAddWindow.dispose();	
						}
				
				/*	JOptionPane.showMessageDialog(ClientAddForm.this ,"Client Succesfully Added !");
				ClientsMenu.main(new String [] {});
				clientAddWindow.dispose();					*/
			}else {
				JOptionPane.showMessageDialog(ClientAddForm.this,"Unable to add the client");
			}
		}
	}
	private void goBackBtnListener (ActionEvent e) {
		ClientsMenu.main(new String [] {});
		clientAddWindow.dispose();
	}

public static void main(String[] args) {
	clientAddWindow = new ClientAddForm ();
	clientAddWindow.setVisible(true) ;
	
	}

}
