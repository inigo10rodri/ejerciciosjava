package gui;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import datos.Usuario;
import model.GestorEntradas;
import model.IGestorEntrada;

public class EntradaUI extends JFrame implements IGestorEntrada{

	private JPanel contentPane;
	private JTextField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EntradaUI frame = new EntradaUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public EntradaUI() {
		setTitle("Identificaci\u00F3n");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 364, 241);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setBounds(60, 59, 55, 14);
		contentPane.add(lblUsuario);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(134, 56, 63, 20);
		contentPane.add(comboBox);
		
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(51, 100, 64, 14);
		contentPane.add(lblPassword);
		
		txtPassword = new JTextField();
		txtPassword.setBounds(134, 97, 86, 20);
		contentPane.add(txtPassword);
		txtPassword.setColumns(10);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(40, 155, 89, 23);
		contentPane.add(btnAceptar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnCancelarClick();
			}
		});
		btnCancelar.setBounds(171, 155, 89, 23);
		contentPane.add(btnCancelar);
	}

	@Override
	public boolean compruebaUsuario(Usuario u) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public DefaultComboBoxModel<Usuario> getUsuarios() {
		//IGestorEntrada gestorEntradas = new GestorEntradas();
		return null;
	}
	

	@Override
	public void incVisitas(Usuario u) {
		// TODO Auto-generated method stub
		
	}
	public void btnCancelarClick(){
		this.dispose();
	}
}
