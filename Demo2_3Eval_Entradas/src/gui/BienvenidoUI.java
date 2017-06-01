package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import datos.Usuario;
import model.GestorEntradas;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class BienvenidoUI extends JFrame {

	private JPanel contentPane;
	GestorEntradas ge = new GestorEntradas();
	private JLabel lblBienvenido;
	private JLabel lblNumVisitas;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BienvenidoUI frame = new BienvenidoUI();
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
	public BienvenidoUI() {
		setTitle("Bienvenido");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 342, 274);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnSalirClick();
			}
		});
		btnSalir.setBounds(98, 167, 89, 23);
		contentPane.add(btnSalir);

		lblBienvenido = new JLabel("");
		lblBienvenido.setBounds(69, 33, 219, 14);
		contentPane.add(lblBienvenido);
		lblBienvenido.setText("Bienvenido " + ge.getUsuarios().getSelectedItem());

		lblNumVisitas = new JLabel("");
		lblNumVisitas.setBounds(69, 77, 219, 14);
		contentPane.add(lblNumVisitas);
		lblNumVisitas.setText("Nos has visitado " + " veces.");
	}

	public void btnSalirClick() {
		this.dispose();
	}
}
