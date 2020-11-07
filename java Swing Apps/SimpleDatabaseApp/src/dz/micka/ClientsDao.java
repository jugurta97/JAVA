package dz.micka;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class ClientsDao {

	public static int deleteClient (String lastName ,String firstName) {
		int status = 0 ; 
		try {
			Connection conDao = DatabaseConnection.getConnection();
			PreparedStatement myStatement = conDao.prepareStatement("DELETE FROM Clients WHERE lastName_Client=? AND FirstName_Client=? ");
			myStatement.setString(1,lastName);
			myStatement.setString(2,firstName);
			
			status = myStatement.executeUpdate();
			
			conDao.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}
			return status ;
		
	}
	
	
	
	public static int addClient (String lastName ,String firstName ,String adress ,String city ,String state ,String zipCode 
																				  	,String country ,String phoneNbr ,String email) {
		int status = 0;
		
		try {
			Connection conDao = DatabaseConnection.getConnection();
			PreparedStatement myStatement = conDao.prepareStatement("INSERT INTO Clients VALUES (?,?,?,?,?,?,?,?,?) ");
			myStatement.setString(1,lastName);
			myStatement.setString(2,firstName);
			myStatement.setString(3, adress);
			myStatement.setString(4, city);
			myStatement.setString(5, state);
			myStatement.setString(6, zipCode);
			myStatement.setString(7, country);
			myStatement.setString(8, phoneNbr);
			myStatement.setString(9, email);
			
			status = myStatement.executeUpdate();
			
			conDao.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		return status;
	}
	
 
}
