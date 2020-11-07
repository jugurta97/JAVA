package dz.micka;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ClientDeleteForm extends JFrame {
	private static final long serialVersionUID = -899934489234320228L;

	private JPanel contentPane;
	private static JFrame clientDeleteWindow ;
	private JTextField lastNameTextField ;
	private JTextField firstNameTextField ;
	
	
	public ClientDeleteForm () {
	super("Delete Client Window"); 
	this.setSize(600 , 400);
	this.setLocationRelativeTo(null);
	this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel textLabel = new JLabel("Client Information:");
		textLabel.setFont(new Font("Tahoma", Font.PLAIN,18));
		
		JLabel lastNameLabel = new JLabel("Last Name : ");
		JLabel firstNameLabel = new JLabel("First Name : "); 
		
		lastNameTextField = new JTextField();
		firstNameTextField = new JTextField();
		
		JButton deleteClientBtn = new JButton("Delete Client");
		deleteClientBtn.addActionListener((e) -> deleteClientBtnListener(e));
		JButton goBackBtn = new JButton("Go Back");
		goBackBtn.addActionListener((e) -> goBackbtnListener(e));
		
		
		GroupLayout myLayout = new GroupLayout (contentPane);
		myLayout.setHorizontalGroup(
				myLayout.createParallelGroup(Alignment.TRAILING)
					.addGroup(myLayout.createSequentialGroup()
							.addGroup(myLayout.createParallelGroup(Alignment.LEADING)
									.addGroup(myLayout.createSequentialGroup()
											.addGap(230)
											.addComponent(textLabel))
									.addGroup(myLayout.createSequentialGroup()
											.addGap(80)
										.addGroup(myLayout.createParallelGroup(Alignment.LEADING ,false)
											.addComponent(lastNameLabel,GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
											.addComponent(firstNameLabel,GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE) )
										.addGap(80)
									.addGroup(myLayout.createParallelGroup(Alignment.LEADING)
											.addComponent(lastNameTextField,GroupLayout.PREFERRED_SIZE,167,GroupLayout.PREFERRED_SIZE)
											.addComponent(firstNameTextField,GroupLayout.PREFERRED_SIZE,167,GroupLayout.PREFERRED_SIZE)	
									)	)	)
							.addContainerGap(125 , Short.MAX_VALUE)	)
					.addGroup(Alignment.LEADING, myLayout.createSequentialGroup()
							.addGap(220)
							.addComponent(deleteClientBtn,GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE))
					.addGroup(Alignment.LEADING, myLayout.createSequentialGroup()
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
								.addComponent(lastNameTextField , GroupLayout.PREFERRED_SIZE , GroupLayout.DEFAULT_SIZE , GroupLayout.PREFERRED_SIZE))
						.addGap(18)
						.addGroup(myLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(firstNameLabel)
								.addComponent(firstNameTextField ,GroupLayout.PREFERRED_SIZE , GroupLayout.DEFAULT_SIZE , GroupLayout.PREFERRED_SIZE))
						.addGap(100)
						.addComponent(deleteClientBtn, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addComponent(goBackBtn, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						
						.addContainerGap(53, Short.MAX_VALUE) )
				
						
				);
		contentPane.setLayout(myLayout);
		
		contentPane.setBorder(new LineBorder(Color.RED));
		contentPane.setBackground(Color.LIGHT_GRAY);
		
	}
	private void deleteClientBtnListener (ActionEvent e) {
		String lastName = lastNameTextField.getText();
		String firstName = firstNameTextField.getText();
		
		int i = ClientsDao.deleteClient(lastName , firstName);
		
		if (i>0) {
			JOptionPane.showMessageDialog(ClientDeleteForm.this,"Client Succesfuly Deleted !");
			ClientsMenu.main(new String [] {});
			clientDeleteWindow.dispose();
		}else {
			JOptionPane.showMessageDialog(ClientDeleteForm.this,"Unable to delete the client " , "EROR ! 404",JOptionPane.ERROR_MESSAGE);
		}
		
	}
	
	
	private void goBackbtnListener (ActionEvent e) {
		ClientsMenu.main(new String [] {});
		clientDeleteWindow.dispose();
	}
	
	public static void main(String[] args) {
		clientDeleteWindow = new  ClientDeleteForm () ; 
		clientDeleteWindow.setVisible(true);
	}

}
