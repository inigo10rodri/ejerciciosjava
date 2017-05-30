package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.Date;

import javax.swing.DefaultComboBoxModel;

import datos.GestorBDSQLite;
import datos.Usuario;

public class GestorEntradas{
	private GestorBDSQLite gbd = new GestorBDSQLite();

	public GestorEntradas(){
		
	}
	public boolean compruebaUsuario(Usuario u){
		String sql = "SELECT * FROM USUARIOS WHERE COD='"+u.getCod()+"',AND PASS= '"+ u.getPass()+"'";
		// pedir a la base de datos todas las plantaciones.
				ResultSet rs = gbd.executeSQL(sql);
				
				try {
					while (rs.next()) {
						String cod = rs.getString("COD");						
						String pass = rs.getString("PASS");
						int contVisitas = rs.getInt("CONTVISITAS");
						u.setCod(cod);
						u.setPass(pass);
						u.incContVisitas(contVisitas);
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		return true;
		
	}
	public DefaultComboBoxModel<Usuario> getUsuarios(){
		String sql = "SELECT * FROM USUARIOS";
		DefaultComboBoxModel<Usuario> combobox= new DefaultComboBoxModel();
		ResultSet rs = gbd.executeSQL(sql);
		try {
			while (rs.next()) {
				String cod = rs.getString("COD");						
				String pass = rs.getString("PASS");
				int contVisitas = rs.getInt("CONTVISITAS");
				Usuario u=new Usuario();
				u.setCod(cod);
				u.setPass(pass);
				u.incContVisitas(contVisitas);
				combobox.addElement(u);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return combobox;
		
	}
	public void incVisitas(Usuario u){
		u.incContVisitas(0);
	}
}
