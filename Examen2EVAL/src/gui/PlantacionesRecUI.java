package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import model.GestorPlantaciones;
import model.Plantacion;

public class PlantacionesRecUI extends JFrame {

	private JPanel contentPane;
	private JTextField txtFechaRec;
	private JTextField txtParcela;
	private JTextField txtCantRec;
	private GestorPlantaciones gp;
	private PlantacionesUI frmPrincipal;
	private SimpleDateFormat sdf=new SimpleDateFormat("YYYY/MM/dd");
	private Plantacion plant_sel;


	/**
	 * Create the frame.
	 */
	public PlantacionesRecUI(PlantacionesUI frmPrincipal, GestorPlantaciones gp, Plantacion plant_sel) {
		//asignar el mismo gestor de plantaciones
			this.plant_sel=plant_sel; // plantacion seleccionada
			this.frmPrincipal=frmPrincipal;	
			this.gp=gp;
			setTitle("Recolectar Plantaciones");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 302, 215);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JLabel lblFechaRecogida = new JLabel("Fecha Recogida:");
			lblFechaRecogida.setBounds(21, 36, 106, 14);
			contentPane.add(lblFechaRecogida);
			
			txtFechaRec = new JTextField(this.sdf.format(plant_sel.getFechaRec()));
			txtFechaRec.setBounds(160, 41, 86, 20);
			contentPane.add(txtFechaRec);
			txtFechaRec.setColumns(10);
			
			JButton btnAceptar = new JButton("Aceptar");
			btnAceptar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					btnAceptarClick();
				}
			});
			btnAceptar.setBounds(21, 125, 89, 23);
			contentPane.add(btnAceptar);
			
			JButton btnCancelar = new JButton("Cancelar");
			btnCancelar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					btnCancelarClick();
				}
			});
			btnCancelar.setBounds(131, 125, 89, 23);
			contentPane.add(btnCancelar);
			
			JLabel lblParcela = new JLabel("Parcela:");
			lblParcela.setBounds(21, 11, 59, 14);
			contentPane.add(lblParcela);
			
			txtParcela = new JTextField(this.plant_sel.getParcela() + "");
			txtParcela.setBounds(160, 12, 86, 20);
			contentPane.add(txtParcela);
			txtParcela.setColumns(10);
			
			JLabel lblCantidadRecogida = new JLabel("Cantidad Recogida:");
			lblCantidadRecogida.setBounds(21, 78, 127, 14);
			contentPane.add(lblCantidadRecogida);
			
			txtCantRec = new JTextField();
			txtCantRec.setBounds(160, 75, 86, 20);
			contentPane.add(txtCantRec);
			txtCantRec.setColumns(10);

		}
		private void btnAceptarClick(){
			//leer los datos introducidos por el usuario
			int parcela=Integer.parseInt(txtParcela.getText());
			int cantRec=Integer.parseInt(txtCantRec.getText());
			Date fechaRec=null;
			try {
				fechaRec=sdf.parse(txtFechaRec.getText());
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			plant_sel.setCantRec(cantRec);
			//devolverle los datos a recolectar
			gp.recolectar(parcela,fechaRec,cantRec);
			//actualizar la lista de la ventana principal
			frmPrincipal.mostrarDatos(plant_sel);
			//descargar la ventana
			this.dispose();
		}
		private void btnCancelarClick(){
			int opcion = JOptionPane.showConfirmDialog(null, "¿Estas seguro que desea salir?","Seleccione una opcion", JOptionPane.YES_NO_OPTION);
			if (opcion == JOptionPane.YES_OPTION) {
				this.dispose();
			}
		}
}
