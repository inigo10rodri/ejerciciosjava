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

	private static final String RUTA_BD=".\\plantaciones.sql";
	private static final String CREATE_TABLE="CREATE TABLE "
			+ "'tareas' ('ID' INTEGER PRIMARY KEY  AUTOINCREMENT  NOT NULL , 'Titulo' TEXT, 'Hecho' INTEGER);";
	private Connection cn=null;
	private Statement st=null;
	private static Connection Conexion;
	public GestorBDMySQL() {
	        try {
				this.MySQLConnection("root", "root", "plantaciones");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
	
	public void MySQLConnection(String user, String pass, String db_name) throws Exception {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + db_name, user, pass);
            JOptionPane.showMessageDialog(null, "Se ha iniciado la conexi�n con el servidor de forma exitosa\n");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GestorBDMySQL.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(GestorBDMySQL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

	 
	 //Podemos agregar un m�todo para finalizar la conexi�n con el servidor.
	 public void closeConnection() {
	        try {
	            Conexion.close();
	            JOptionPane.showMessageDialog(null, "Se ha finalizado la conexi�n con el servidor");
	        } catch (SQLException ex) {
	            Logger.getLogger(GestorBDMySQL.class.getName()).log(Level.SEVERE, null, ex);
	        }
	    }
	 //Ahora crearemos otro m�todo, esta vez para crear una base de datos.
	 //Lo llamaremos createDB(). El c�digo es el siguiente:
	 public void createDB(String name) {
	        try {
	            String Query = "CREATE DATABASE " + name;
	            Statement st = Conexion.createStatement();
	            st.executeUpdate(Query);
	            closeConnection();
	            try {
					MySQLConnection("root", "root", name);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	JOptionPane.showMessageDialog(null, "Se ha creado la base de datos " + name + " de forma exitosa");
	        } catch (SQLException ex) {
	            Logger.getLogger(GestorBDMySQL.class.getName()).log(Level.SEVERE, null, ex);
	        }
	    }
	 public void createTable(String name) {
	        try {
	            String Query = "CREATE TABLE " + name + ""
	                    + "(PARCELA int(11) NOT NULL, FECHAPLAN text COLLATE utf8_bin NOT NULL,"
	                    + "FECHAREC text COLLATE utf8_bin,ESPECIE text COLLATE utf8_bin,"
	                    + "CANTPLANT int(11) DEFAULT NULL,CANTREC int(11) DEFAULT NULL)";
	            Statement st = Conexion.createStatement();
	            st.executeUpdate(Query);
	JOptionPane.showMessageDialog(null, "Se ha creado la tabla " + name + " de forma exitosa");
	        } catch (SQLException ex) {
	            Logger.getLogger(GestorBDMySQL.class.getName()).log(Level.SEVERE, null, ex);
	        }
	    }public ResultSet executeSQL(String sql) {
			// TODO Auto-generated method stub
			try {
				Statement st = Conexion.createStatement();
				return st.executeQuery(sql);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			}
		}

		public void updateSQL(String sql) {
			// TODO Auto-generated method stub
			try{
				Statement st = Conexion.createStatement();
				st.executeUpdate(sql);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	 
	 
}
//http://panamahitek.com/los-7-pasos-seguir-para-el-manejo-de-mysql-con-java/