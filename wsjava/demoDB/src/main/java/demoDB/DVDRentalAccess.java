package demoDB;

import java.sql.Connection;
import java.sql.DriverManager;

public class DVDRentalAccess {

	public static void main(String[] args) {
		try {
			String jdbcUrl = "jdbc:postgresql://localhost:5432/DVDRental";
	        String username = "postgres";
	        String password = "654321";
	        
	        Class.forName("org.postgresql.Driver");
	        
	        Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
	        
	        connection.close();
			System.out.println("Conexión exitosa");
		}
		catch(Exception e) {
			System.out.println("Conexión fallida");
			
		}

	}

}
