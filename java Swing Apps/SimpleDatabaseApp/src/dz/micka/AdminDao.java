/*data access object (DAO) is a pattern that provides an abstract interface to some type of database or other persistence mechanism. 
 * By mapping application calls to the persistence layer, 
 * the DAO provides some specific data operations without exposing details of the database*/
package dz.micka;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AdminDao {
	
	public static boolean validate (String name , String password) {
			boolean status = false;
		try { 
			Connection conDao = DatabaseConnection.getConnection();
			PreparedStatement myStatement = conDao.prepareStatement("SELECT * FROM Admins WHERE Login=? AND Password=?");
			myStatement.setString(1,name);
			myStatement.setString(2,password);
			
			ResultSet myresultSet = myStatement.executeQuery();
			status=myresultSet.next();
			conDao.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
		return status; 
	}

}
