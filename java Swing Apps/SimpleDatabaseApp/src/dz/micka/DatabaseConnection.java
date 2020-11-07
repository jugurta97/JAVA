package dz.micka;

import java.io.FileReader;
import java.sql.Connection;
import java.util.Properties;
import java.sql.DriverManager;

public class DatabaseConnection {
	
public static Connection getConnection() {
	
	Connection con=null ; 
	Properties props = new Properties();
	String pathPropertyFile = "C:\\Users\\Jugurta\\eclipse-workspace\\SimpleDatabaseApp\\conf.properties" ; 
	
	try (FileReader fileReader = new FileReader(pathPropertyFile) ) {
			
		props.load(fileReader); 
		}catch (Exception e) {
			e.getStackTrace();
		}
								
	String dbConnUrl = props.getProperty("db.conn.url");
	
	String dbUserName = props.getProperty("db.username");
	
	String dbPassword = props.getProperty("db.password"); 
	
		try { con = DriverManager.getConnection(dbConnUrl , dbUserName , dbPassword );
	
		}catch(Exception ex) 
			{
				ex.printStackTrace();
			}	
			
	
	
	return con ;

	}
}