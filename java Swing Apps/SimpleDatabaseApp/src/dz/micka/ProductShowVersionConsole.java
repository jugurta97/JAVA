package dz.micka;

import java.awt.BorderLayout;
import java.awt.Color;
import java.sql.Connection;
//import java.sql.PreparedStatement;
import java.sql.ResultSet;
//import java.sql.ResultSetMetaData;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JPanel;
//import javax.swing.JScrollPane;
//import javax.swing.JTable;
import javax.swing.border.LineBorder;

public class ProductShowVersionConsole extends JFrame {
		private static final long serialVersionUID = -207352594475944436L;
	
		private static JFrame productShowWindow ; 
		private JPanel contentPane ; 
	//	private JTable table ;
 
	public ProductShowVersionConsole () {
		super ("Product Show Window"); 
		this.setSize(600,400);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		contentPane = new JPanel (); 
		contentPane.setLayout(new BorderLayout());
		setContentPane(contentPane);
		
	//	String data [] [] = null ; 
	//	String column [] = null ; 
		
	try {
			Connection conDao = DatabaseConnection.getConnection();
		/*	PreparedStatement myStatement = conDao.prepareStatement("SELECT * FROM Products",ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			ResultSet myResultSet = myStatement.executeQuery(); 
			
			ResultSetMetaData resultSetMetaData =myResultSet.getMetaData();
			int cols = resultSetMetaData.getColumnCount();
			column = new String [cols];
			for (int i = 1 ; i <= cols ; i++ ) {
				column [i-1] = resultSetMetaData.getColumnName(i); 
			}
			
			myResultSet.last();
			int rows = myResultSet.getRow();
			myResultSet.beforeFirst();
			
			data = new String [rows] [cols] ;
			int count=0;
			while(myResultSet.next()) {
				for ( int i = 1 ; i <= cols ; i++) {
					data [count] [i-1] = myResultSet.getString(i); 
				}
				count ++ ;
			}
			conDao.close();
	}catch(Exception e) {
		System.out.println(e);
	}
						*/
	Statement statement = conDao.createStatement( 
			ResultSet.TYPE_FORWARD_ONLY, 
			ResultSet.CONCUR_READ_ONLY); 
			String sql = "SELECT * FROM Products"; 
			ResultSet resultat = statement.executeQuery(sql); 
			while(resultat.next()){ 
			int id = resultat.getInt(1); 
			String nom = resultat.getString(2); 
			double prix = resultat.getDouble(3); 
			double prixVente = resultat.getDouble(4);
		//	java.sql.Date date = resultat.getDate(4); 
			int row = resultat.getRow(); 
			System.out.println("Données contenues dans la ligne "+row); 
			System.out.println("id : "+id+" nom : "+nom+ 
			" prix : "+prix+" prixVente : "+prixVente); 
			}
	}catch (Exception e) {
		System.out.println(e);
	}
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new LineBorder(Color.RED));
/*	
		table = new JTable(data,column);
		JScrollPane scrollPane = new JScrollPane(table);
		contentPane.add(scrollPane , BorderLayout.CENTER);
																					*/
		
	}
	
	public static void main(String[] args) {
		productShowWindow = new ProductShowVersionConsole(); 
		productShowWindow.setVisible(true);
	}

}
