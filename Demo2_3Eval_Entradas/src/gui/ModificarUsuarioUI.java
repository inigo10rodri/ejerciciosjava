package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import datos.Usuario;
import model.GestorEntradas;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ModificarUsuarioUI extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsuario;
	private JTextField txtContraseña;
	GestorEntradas ge = new GestorEntradas();
	private Usuario usuEditar;

	public ModificarUsuarioUI(Usuario u) {
		this.usuEditar = u;
		setTitle("ModificarUsuario");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 395, 242);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblUsuario = new JLabel("Usuario: ");
		lblUsuario.setBounds(71, 63, 75, 14);
		contentPane.add(lblUsuario);

		txtUsuario = new JTextField();
		txtUsuario.setBounds(189, 60, 86, 20);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);
		txtUsuario.setText(usuEditar.getCod());

		JLabel lblContrasea = new JLabel("Contrasena:");
		lblContrasea.setBounds(71, 112, 75, 14);
		contentPane.add(lblContrasea);

		txtContraseña = new JTextField();
		txtContraseña.setBounds(189, 112, 86, 20);
		contentPane.add(txtContraseña);
		txtContraseña.setColumns(10);

		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnAceptarClick();
			}
		});
		btnAceptar.setBounds(151, 175, 89, 23);
		contentPane.add(btnAceptar);

	}

	public void btnAceptarClick() {
		Usuario u = new Usuario();
		u.setCod(txtUsuario.getText());
		u.setPass(txtContraseña.getText());
		ge.modUsuario(u, u.getContVisitas());
		this.dispose();
	}

}
