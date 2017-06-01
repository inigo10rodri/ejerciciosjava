package model;

import javax.swing.DefaultComboBoxModel;

import datos.Usuario;

public interface IGestorEntrada {
	public boolean compruebaUsuario(Usuario u);
	public DefaultComboBoxModel<Usuario> getUsuarios();
	public void incVisitas(Usuario u);
	public void addUsuario(Usuario u);
	public void modUsuario(Usuario u, int conVisitas);
	public void delUsuario(Usuario u);
}
