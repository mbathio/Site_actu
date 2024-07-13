package gestionUser;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class Bdd  {
	public static Connection con=null;
	public static void loadConnexion() {
		String url="jdbc:mysql://localhost:3306/gestionuser";
		String root="root";
		String pass="";
		
		 try {
	            // Create the connection
	            con = DriverManager.getConnection(url, url, pass);
	            
	            System.out.println("Connection established successfully!");
	            if (con != null) {
	                
	                    JOptionPane.showMessageDialog(null, "La base de donnees s'est connecte avec succees...");
	                    }
	        } catch (SQLException e) {
	            System.err.println("Error connecting to the database.");
	            e.printStackTrace();
	        }
	}
}


