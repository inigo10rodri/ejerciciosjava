package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.GestorPlantaciones;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.DropMode;

public class PlantacionesUI extends JFrame {

	private JPanel contentPane;
	private JTextField txtFechaPlant;
	private JTextField txtCantPlant;
	private JTextField FechaRec;
	private JTextField txtCantRec;
	private JTextField txtEspecie;
	private JTextField txtParcela;
	private GestorPlantaciones gp=new GestorPlantaciones();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PlantacionesUI frame = new PlantacionesUI();
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
	public PlantacionesUI() {
		setTitle("Plantaciones");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 439, 299);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblListado = new JLabel("Listado:");
		lblListado.setBounds(21, 21, 46, 14);
		contentPane.add(lblListado);
		
		JList listPlantaciones = new JList();
		listPlantaciones.setBounds(21, 44, 114, 146);
		contentPane.add(listPlantaciones);
		
		JLabel lblFechaPlantacion = new JLabel("Fecha Plantacion:");
		lblFechaPlantacion.setBounds(140, 39, 85, 14);
		contentPane.add(lblFechaPlantacion);
		
		txtFechaPlant = new JTextField();
		txtFechaPlant.setBounds(235, 44, 86, 20);
		contentPane.add(txtFechaPlant);
		txtFechaPlant.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Cantidad Plantada:");
		lblNewLabel.setBounds(140, 125, 100, 14);
		contentPane.add(lblNewLabel);
		
		txtCantPlant = new JTextField();
		txtCantPlant.setBounds(235, 124, 86, 20);
		contentPane.add(txtCantPlant);
		txtCantPlant.setColumns(10);
		
		JLabel lblFechaRecogida = new JLabel("Fecha Recogida:");
		lblFechaRecogida.setBounds(140, 164, 94, 14);
		contentPane.add(lblFechaRecogida);
		
		FechaRec = new JTextField();
		FechaRec.setBounds(235, 164, 86, 20);
		contentPane.add(FechaRec);
		FechaRec.setColumns(10);
		
		JLabel lblCantidadRecogida = new JLabel("Cantidad Recogida:");
		lblCantidadRecogida.setBounds(140, 201, 100, 14);
		contentPane.add(lblCantidadRecogida);
		
		txtCantRec = new JTextField();
		txtCantRec.setBounds(235, 195, 86, 20);
		contentPane.add(txtCantRec);
		txtCantRec.setColumns(10);
		
		JButton btnNuevo = new JButton("Nuevo");
		btnNuevo.setBounds(21, 227, 89, 23);
		contentPane.add(btnNuevo);
		
		JButton btnRecolectar = new JButton("Recolectar");
		btnRecolectar.setBounds(131, 227, 89, 23);
		contentPane.add(btnRecolectar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setBounds(237, 227, 89, 23);
		contentPane.add(btnSalir);
		
		JLabel lblEspecie = new JLabel("Especie:");
		lblEspecie.setBounds(140, 86, 65, 14);
		contentPane.add(lblEspecie);
		
		txtEspecie = new JTextField();
		txtEspecie.setDropMode(DropMode.ON);
		txtEspecie.setBounds(235, 84, 86, 20);
		contentPane.add(txtEspecie);
		txtEspecie.setColumns(10);
		
		JLabel lblParcela = new JLabel("Parcela:");
		lblParcela.setBounds(140, 14, 46, 14);
		contentPane.add(lblParcela);
		
		txtParcela = new JTextField();
		txtParcela.setBounds(235, 15, 86, 20);
		contentPane.add(txtParcela);
		txtParcela.setColumns(10);
	}
}
