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

public class EntradaUI extends JFrame {

	private JPanel contentPane;
	private JTextField txtPassword;
	GestorEntradas ge = new GestorEntradas();
	JComboBox comboBox;

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
		setBounds(100, 100, 420, 271);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setBounds(60, 59, 55, 14);
		contentPane.add(lblUsuario);

		comboBox = new JComboBox();
		comboBox.setBounds(134, 56, 86, 20);
		contentPane.add(comboBox);
		comboBox.setModel(ge.getUsuarios());

		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(51, 100, 64, 14);
		contentPane.add(lblPassword);

		txtPassword = new JTextField();
		txtPassword.setBounds(134, 97, 86, 20);
		contentPane.add(txtPassword);
		txtPassword.setColumns(10);

		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnAceptarClick();
			}
		});
		btnAceptar.setBounds(60, 176, 89, 23);
		contentPane.add(btnAceptar);

		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnCancelarClick();
			}
		});
		btnCancelar.setBounds(195, 176, 89, 23);
		contentPane.add(btnCancelar);

		JButton btnNuevo = new JButton("Nuevo");
		btnNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNuevoClick();
			}
		});
		btnNuevo.setBounds(33, 142, 89, 23);
		contentPane.add(btnNuevo);

		JButton btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnModificarClick();
			}
		});
		btnModificar.setBounds(134, 142, 89, 23);
		contentPane.add(btnModificar);

		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnEliminarUsuario();
			}
		});
		btnEliminar.setBounds(230, 142, 89, 23);
		contentPane.add(btnEliminar);
	}

	public void btnCancelarClick() {
		this.dispose();
	}

	public void btnAceptarClick() {
		BienvenidoUI frmBienvenido = new BienvenidoUI();
		frmBienvenido.setVisible(true);
	}

	public void btnNuevoClick() {
		NuevoUsuarioUI nu = new NuevoUsuarioUI();
		nu.setVisible(true);
	}

	public void btnModificarClick() {
		ModificarUsuarioUI mu = new ModificarUsuarioUI((Usuario) comboBox.getSelectedItem());
		mu.setVisible(true);
	}

	public void btnEliminarUsuario() {
		ge.delUsuario((Usuario) comboBox.getSelectedItem());
	}

}
