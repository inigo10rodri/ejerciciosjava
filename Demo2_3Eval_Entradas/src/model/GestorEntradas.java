package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.Date;

import javax.swing.DefaultComboBoxModel;

import datos.GestorBDSQLite;
import datos.Usuario;

public class GestorEntradas implements IGestorEntrada {
	private GestorBDSQLite gbd = new GestorBDSQLite();
	private DefaultComboBoxModel<Usuario> combobox = new DefaultComboBoxModel();

	public GestorEntradas() {

	}

	public boolean compruebaUsuario(Usuario u) {
		String sql = "SELECT * FROM USUARIOS WHERE COD='" + u.getCod() + "',AND PASS= '" + u.getPass() + "'";
		// pedir a la base de datos todas las entradas.
		ResultSet rs = gbd.executeSQL(sql);
		try {
			if (rs.next()) {
				return true;
			} else {
				return false;
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;

	}

	public DefaultComboBoxModel<Usuario> getUsuarios() {
		String sql = "SELECT * FROM USUARIOS";
		combobox.removeAllElements();
		ResultSet rs = gbd.executeSQL(sql);
		try {
			while (rs.next()) {
				String cod = rs.getString("COD");
				String pass = rs.getString("PASS");
				int contVisitas = rs.getInt("CONTVISITAS");
				Usuario u = new Usuario();
				u.setCod(cod);
				u.setPass(pass);
				u.setContVisitas(contVisitas);
				combobox.addElement(u);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return combobox;

	}

	public void incVisitas(Usuario u) {
		u.setContVisitas(u.getContVisitas() + 1);
		String sql = "UPDATE USUARIOS SET CONTVISITAS =" + u.getContVisitas() + ");";
		gbd.updateSQL(sql);

	}

	public void addUsuario(Usuario u) {
		// memoria
		combobox.addElement(u);
		// bbdd
		String sql = "INSERT INTO USUARIOS VALUES('" + u.getCod() + "','" + u.getPass() + "'," + u.getContVisitas()
				+ ");";
		gbd.updateSQL(sql);
	}

	public void modUsuario(Usuario u, int conVisitas) {
		// modifica el usuario en la bbdd
		String sql = "UPDATE USUARIOS SET COD='" + u.getCod() + "', PASS='" + u.getPass() + "', CONTVISITAS="
				+ u.getContVisitas() + ";";
		gbd.updateSQL(sql);

	}

	public void delUsuario(Usuario u) {
		// elimina el contacto que se encuentra en ese índice de la bbdd
		String sql = "DELETE FROM USUARIOS WHERE COD =" + u.getCod() + " ;";
		gbd.updateSQL(sql);

	}

}
