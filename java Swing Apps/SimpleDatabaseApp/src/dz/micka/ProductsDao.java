package dz.micka;

import java.sql.Connection;
import java.sql.PreparedStatement;


public class ProductsDao {

	public static int deleteProduct (String name) {
		int status = 0;
		try {	Connection conDao = DatabaseConnection.getConnection();
				PreparedStatement myStatement = conDao.prepareStatement("DELETE FROM Products WHERE Desc_Produit = ?");
				myStatement.setString(1,name);
				status = myStatement.executeUpdate();
				conDao.close();

		
	}catch (Exception e) {
		System.out.println(e);
		
	}
		return status;
}	
	
	public static int addProduct (String name , Float buyPrice , Float sellPrice , int stockProduct) {
			int status= 0;

 try {   	Connection conDao = DatabaseConnection.getConnection();
			PreparedStatement myStatement = conDao.prepareStatement("INSERT INTO Products VALUES (?,?,?,?)");
			myStatement.setString(1,name);
			myStatement.setFloat(2,buyPrice);
			myStatement.setFloat(3,sellPrice);
			myStatement.setInt(4,stockProduct);
			
			status= myStatement.executeUpdate();
		
			conDao.close();
	}catch (Exception e){
		System.out.println(e);
	}
		return status;
	}	
	
}
