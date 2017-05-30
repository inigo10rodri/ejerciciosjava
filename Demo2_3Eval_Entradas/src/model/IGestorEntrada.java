package model;

import javax.swing.DefaultComboBoxModel;

import datos.Usuario;

public interface IGestorEntrada {
	public boolean compruebaUsuario(Usuario u);
	public DefaultComboBoxModel<Usuario> getUsuarios();
	public void incVisitas(Usuario u);
}
