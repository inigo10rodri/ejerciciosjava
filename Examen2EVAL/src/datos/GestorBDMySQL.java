package datos;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

public class GestorBDMySQL {
	private static Connection Conexion;
	
	 public static void main(String[] args) {
		 GestorBDMySQL db = new GestorBDMySQL();
	        try {
				db.MySQLConnection("root", "", "");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
	
	 public void MySQLConnection(String user, String pass, String db_name) throws Exception {
	        try {
	            Class.forName("com.mysql.jdbc.Driver");
	            Conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + db_name, user, pass);
	            JOptionPane.showMessageDialog(null, "Se ha iniciado la conexión con el servidor de forma exitosa");
	        } catch (ClassNotFoundException ex) {
	            Logger.getLogger(GestorBDMySQL.class.getName()).log(Level.SEVERE, null, ex);
	        } catch (SQLException ex) {
	            Logger.getLogger(GestorBDMySQL.class.getName()).log(Level.SEVERE, null, ex);
	        }
	    }

	 public void closeConnection() {
	        try {
	            Conexion.close();
	            JOptionPane.showMessageDialog(null, "Se ha finalizado la conexión con el servidor");
	        } catch (SQLException ex) {
	            Logger.getLogger(GestorBDMySQL.class.getName()).log(Level.SEVERE, null, ex);
	        }
	   }

}
//http://panamahitek.com/los-7-pasos-seguir-para-el-manejo-de-mysql-con-java/