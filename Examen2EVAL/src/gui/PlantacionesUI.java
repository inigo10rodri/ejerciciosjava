package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.border.EmptyBorder;

import model.GestorPlantacionesBBDD;
import model.GestorPlantacionesFicheros;
import model.IGestorPlantaciones;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ListModel;
import javax.swing.JButton;
import javax.swing.DefaultListModel;
import javax.swing.DropMode;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.awt.event.ActionEvent;
import javax.swing.event.ListSelectionListener;

import datos.GestorBDSQLite;
import datos.Plantacion;

import javax.swing.event.ListSelectionEvent;

public class PlantacionesUI extends JFrame {

	private JPanel contentPane;
	private JTextField txtFechaPlant;
	private JSpinner txtCantPlant;
	private JTextField txtFechaRec;
	private JTextField txtCantRec;
	private JTextField txtEspecie;
	private JTextField txtParcela;
	private JList listPlantaciones;
	private IGestorPlantaciones gp = new GestorPlantacionesBBDD();
	private SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
	private DefaultListModel<Plantacion> dlm = new DefaultListModel<Plantacion>();
	GestorBDSQLite gbd = new GestorBDSQLite();

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
		setBounds(100, 100, 439, 324);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblListado = new JLabel("Listado:");
		lblListado.setBounds(21, 21, 46, 14);
		contentPane.add(lblListado);

		// JList listPlantaciones = new JList(gp.getPlantaciones().toArray());
		listPlantaciones = new JList();
		listPlantaciones.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent arg0) {
				// Para que aparezca solamente una vez el elemento
				if (!arg0.getValueIsAdjusting()) {
					Plantacion p=(Plantacion) listPlantaciones.getSelectedValue();
					if (p!=null){
						mostrarDatos(p);
						// devulelve el elemento
						System.out.println(listPlantaciones.getSelectedValue());
					}
				}
			}
		});
		listPlantaciones.setBounds(21, 44, 148, 153);
		// pedir las plantaciones al gestor de plantaciones
		actualizarListado(gp.getPlantaciones());
		contentPane.add(listPlantaciones);

		JLabel lblFechaPlantacion = new JLabel("Fecha Plantacion:");
		lblFechaPlantacion.setBounds(179, 46, 127, 14);
		contentPane.add(lblFechaPlantacion);

		txtFechaPlant = new JTextField();
		txtFechaPlant.setBounds(327, 44, 86, 20);
		contentPane.add(txtFechaPlant);
		txtFechaPlant.setColumns(10);

		JLabel lblNewLabel = new JLabel("Cantidad Plantada:");
		lblNewLabel.setBounds(179, 132, 127, 14);
		contentPane.add(lblNewLabel);

		txtCantPlant = new JSpinner();
		txtCantPlant.setBounds(327, 124, 86, 20);
		contentPane.add(txtCantPlant);

		JLabel lblFechaRecogida = new JLabel("Fecha Recogida:");
		lblFechaRecogida.setBounds(179, 171, 127, 14);
		contentPane.add(lblFechaRecogida);

		txtFechaRec = new JTextField();
		txtFechaRec.setBounds(327, 164, 86, 20);
		contentPane.add(txtFechaRec);
		txtFechaRec.setColumns(10);

		JLabel lblCantidadRecogida = new JLabel("Cantidad Recogida:");
		lblCantidadRecogida.setBounds(179, 208, 127, 14);
		contentPane.add(lblCantidadRecogida);

		txtCantRec = new JTextField();
		txtCantRec.setBounds(327, 195, 86, 20);
		contentPane.add(txtCantRec);
		txtCantRec.setColumns(10);

		JButton btnNuevo = new JButton("Nuevo");
		btnNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNuevoClick();
			}
		});
		btnNuevo.setBounds(11, 227, 89, 23);
		contentPane.add(btnNuevo);

		JButton btnRecolectar = new JButton("Recolectar");
		btnRecolectar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnRecClick();
			}
		});
		btnRecolectar.setBounds(111, 227, 100, 23);
		contentPane.add(btnRecolectar);

		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int opcion = JOptionPane.showConfirmDialog(null, "¿Estas seguro que desea salir?",
						"Seleccione una opcion", JOptionPane.YES_NO_OPTION);
				if (opcion == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
		});
		btnSalir.setBounds(322, 226, 89, 23);
		contentPane.add(btnSalir);

		JLabel lblEspecie = new JLabel("Especie:");
		lblEspecie.setBounds(179, 87, 127, 14);
		contentPane.add(lblEspecie);

		txtEspecie = new JTextField();
		txtEspecie.setBounds(327, 84, 86, 20);
		contentPane.add(txtEspecie);
		txtEspecie.setColumns(10);

		JLabel lblParcela = new JLabel("Parcela:");
		lblParcela.setBounds(179, 21, 127, 14);
		contentPane.add(lblParcela);

		txtParcela = new JTextField();
		txtParcela.setBounds(327, 15, 86, 20);
		contentPane.add(txtParcela);
		txtParcela.setColumns(10);

		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnEliminarClick();
			}
		});
		btnEliminar.setBounds(222, 227, 89, 23);
		contentPane.add(btnEliminar);
		
		JButton btnActualizar = new JButton("Actualizar");
		btnActualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnActualizarClick();
			}
		});
		btnActualizar.setBounds(168, 261, 106, 23);
		contentPane.add(btnActualizar);

	}

	// Boton nueva plantacion
	private void btnNuevoClick() {
		PlantacionesEditUI frmPlantEdit = new PlantacionesEditUI(this, gp);
		frmPlantEdit.setVisible(true);
	}

	// Boton recolectar plantacion
	private void btnRecClick() {
		int selected_index = listPlantaciones.getSelectedIndex();
		if (selected_index < 0) {
			JOptionPane.showMessageDialog(null, "Debes seleccionar la plantacion que quieres recolectar!");
		} else {
			Plantacion plantacion_seleccionada = (Plantacion) listPlantaciones.getModel().getElementAt(selected_index);
			PlantacionesRecUI frmPlantRec = new PlantacionesRecUI(this, gp, plantacion_seleccionada);
			frmPlantRec.setVisible(true);
		}

	}

	// Boton eliminar plantacion
	private void btnEliminarClick() {
		int selected_index = listPlantaciones.getSelectedIndex();
		if (selected_index < 0) {
			JOptionPane.showMessageDialog(null, "Debes seleccionar la plantacion que quieres eliminar!");
		} else {
			Plantacion plantacion_seleccionada = (Plantacion)dlm.remove(selected_index);
			System.out.println("Plantacion borrada: " + plantacion_seleccionada);
			
			String query;
			query="UPDATE PLANTACIONES WHERE PARCELA ="+plantacion_seleccionada.getParcela()+
					" AND FECHA_PLAN='" + sdf.format(plantacion_seleccionada.getFechaPlan())+"';";
			System.out.println("Query: "+query);
			gbd.updateSQL(query);
		}
	}
	//Boton actualizar plantacion
	private void btnActualizarClick(){
		int selected_index = listPlantaciones.getSelectedIndex();
		if (selected_index < 0) {
			JOptionPane.showMessageDialog(null, "Debes seleccionar la plantacion que quieres eliminar!");
		} else {
			Plantacion plantacion_seleccionada = (Plantacion) listPlantaciones.getModel().getElementAt(selected_index);
			//Cogemos los valores de las cajas de texto
			int parcela= Integer.parseInt(txtParcela.getText());
			try {
				Date FechaPlan=sdf.parse(txtFechaPlant.getText());
				plantacion_seleccionada.setFechaPlan(FechaPlan);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				Date FechaRec=sdf.parse(txtFechaRec.getText());
				plantacion_seleccionada.setFechaRec(FechaRec);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String especie=txtEspecie.getText();
			int cantPlant= (Integer)txtCantPlant.getValue();
			
			/**/
			//Actualizamos los datos de la plantacion
			plantacion_seleccionada.setParcela(parcela);				
			plantacion_seleccionada.setEspecie(especie);
			plantacion_seleccionada.setCantPlant(cantPlant);
			
			/**/
			//Coger los datos de las plantaciones
			String query;
			query="UPDATE PLANTACIONES SET PARCELA=" + plantacion_seleccionada.getParcela() +
					",FECHA_PLAN='" + sdf.format(plantacion_seleccionada.getFechaPlan())
					+ "',FECHA_REC='" + sdf.format(plantacion_seleccionada.getFechaRec()) +
					"',ESPECIE='" + plantacion_seleccionada.getEspecie() +
					"',CANT_PLANT=" + plantacion_seleccionada.getCantPlant()+
					";";
			System.out.println("Query: "+query);
			gbd.updateSQL(query);
		}
	}
	// muestra los datos del parametro en el jList
	public void actualizarListado(ArrayList<Plantacion> lstPlantas) {
		// añadir las plantaciones pasadas como parametro en el ArrayList
		for (Plantacion p : lstPlantas) {
			dlm.addElement(p);
		}
		// pasar el model Jlist
		listPlantaciones.setModel(dlm);
	}

	// cargar la informacion de una plantacion en las cajas de texto
	public void mostrarDatos(Plantacion p) {
		txtParcela.setText(String.valueOf(p.getParcela()));
		txtFechaPlant.setText(sdf.format(p.getFechaPlan()));
		txtEspecie.setText(p.getEspecie());
		txtCantPlant.setValue(p.getCantPlant());
		txtFechaRec.setText(sdf.format(p.getFechaRec()));
		txtCantRec.setText(p.getCantRec() + "");
	}
}
