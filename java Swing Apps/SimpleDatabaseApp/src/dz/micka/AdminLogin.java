package dz.micka;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class AdminLogin extends JFrame {
		
	private static final long serialVersionUID = -1852376776095796149L;

	static AdminLogin firstWindow ;
	
	public AdminLogin() {
		super("my first project Window"); 
		this.setSize(600,400);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);	
		
		JPanel contentPane = (JPanel) this.getContentPane();
		
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER , 20 , 40 ));
		
		JLabel nameLabel = new JLabel("UserName :");
		contentPane.add(nameLabel);
		
		JTextField nameTextField = new JTextField() ; 
		nameTextField.setPreferredSize(new Dimension(120 , 20 ));
		contentPane.add(nameTextField);
		
		JLabel passwordLabel = new JLabel("Password :");
		contentPane.add(passwordLabel);
							
		JPasswordField passwordTextField = new JPasswordField() ; 
		passwordTextField.setPreferredSize(new Dimension(120 ,20 )) ;
		contentPane.add(passwordTextField);
		
	
		
		JButton loginBtn = new JButton("Login");
		loginBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			String name = nameTextField.getText();
			String password = String.valueOf(passwordTextField.getPassword());
			//System.out.println(name+"  "+password);
			
			if(AdminDao.validate(name, password)) {
				StoreMenu.main(new String [] {});
			
				firstWindow.dispose();
				
			}else{
				JOptionPane.showMessageDialog(AdminLogin.this, "Sorry, Username or Password Error","Login Error!", JOptionPane.ERROR_MESSAGE);
				nameTextField.setText("");
				passwordTextField.setText("");
			}
		}
	});
		contentPane.add(loginBtn);
		
		JButton quitBtn = new JButton("Quit !");
		quitBtn.setSize(200,30);
		quitBtn.setLocation(230 , 100);
		quitBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				firstWindow.dispose();
			}
		});
		contentPane.add(quitBtn);
		
		
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new LineBorder(Color.RED));
		
	
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					firstWindow = new AdminLogin ();
					firstWindow.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}	
	
	
}	
	
	
/*	public static void main(String[] args) {
		firstWnd = new AdminLogin () ; 
		firstWnd.setVisible(true);
	}


*/