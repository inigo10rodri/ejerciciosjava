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

public class NuevoUsuarioUI extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsuario;
	private JTextField txtContrase�a;
	GestorEntradas ge = new GestorEntradas();

	public NuevoUsuarioUI() {
		setTitle("Nuevo Usuario");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 409, 202);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setBounds(76, 56, 67, 14);
		contentPane.add(lblUsuario);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a:");
		lblContrasea.setBounds(76, 94, 80, 14);
		contentPane.add(lblContrasea);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(193, 53, 86, 20);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		txtContrase�a = new JTextField();
		txtContrase�a.setBounds(193, 91, 86, 20);
		contentPane.add(txtContrase�a);
		txtContrase�a.setColumns(10);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnAceptarClick();
			}
		});
		btnAceptar.setBounds(135, 130, 89, 23);
		contentPane.add(btnAceptar);
		
		
	}
	public void btnAceptarClick(){
		Usuario u = new Usuario();
		u.setCod(txtUsuario.getText());
		u.setPass(txtContrase�a.getText());
		ge.addUsuario(u);
		this.dispose();
	}
}
