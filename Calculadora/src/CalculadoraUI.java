import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class CalculadoraUI extends JFrame implements ItemListener {

	private JPanel contentPane;
	private JTextField txtNumero1;
	private JTextField txtNumero2;
	private JTextField txtResultado;
	//Definimos a nivel de la clase para poder tener acceso a ellos desde cualquier metodo
	private JCheckBox chkPositivo;
	private JCheckBox chkNegativo;
	private JCheckBox chkNeutro;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraUI frame = new CalculadoraUI();
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
	public CalculadoraUI() {
		setTitle("SuperCalculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 530, 245);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnOperaciones = new JMenu("Operaciones");
		menuBar.add(mnOperaciones);
		
		JMenuItem mntmSuma = new JMenuItem("Suma");
		mntmSuma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				calcularResultado("+");
			}
		});
		mnOperaciones.add(mntmSuma);
		
		JMenuItem mntmResta = new JMenuItem("Resta");
		mnOperaciones.add(mntmResta);
		
		JMenuItem mntmProducto = new JMenuItem("Producto");
		mnOperaciones.add(mntmProducto);
		
		JMenuItem mntmDivision = new JMenuItem("Division");
		mnOperaciones.add(mntmDivision);
		
		JMenu mnOtros = new JMenu("Otros");
		mnOperaciones.add(mnOtros);
		
		JMenuItem mntmOpcion = new JMenuItem("Opcion1");
		mnOtros.add(mntmOpcion);
		
		JMenuItem mntmOpcion_1 = new JMenuItem("Opcion2");
		mnOtros.add(mntmOpcion_1);
		
		JMenuItem mntmSalir = new JMenuItem("Salir");
		mntmSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int opcion = JOptionPane.showConfirmDialog(null, "�Estas seguro que desea salir?","Seleccione una opcion", JOptionPane.YES_NO_OPTION);
				if (opcion == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
		});
		menuBar.add(mntmSalir);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNumero = new JLabel("Numero1:");
		lblNumero.setBounds(52, 14, 65, 14);
		contentPane.add(lblNumero);

		JLabel lblNumero_1 = new JLabel("Numero 2:");
		lblNumero_1.setBounds(52, 39, 65, 14);
		contentPane.add(lblNumero_1);

		JLabel lblResultado = new JLabel("Resultado: ");
		lblResultado.setBounds(52, 64, 65, 14);
		contentPane.add(lblResultado);

		txtNumero1 = new JTextField();
		txtNumero1.setBounds(120, 11, 86, 20);
		contentPane.add(txtNumero1);
		txtNumero1.setColumns(10);

		txtNumero2 = new JTextField();
		txtNumero2.setBounds(120, 39, 86, 20);
		contentPane.add(txtNumero2);
		txtNumero2.setColumns(10);

		txtResultado = new JTextField();
		txtResultado.setBounds(120, 61, 86, 20);
		contentPane.add(txtResultado);
		txtResultado.setColumns(10);

		JButton btnSuma = new JButton("+");
		btnSuma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				calcularResultado("+");
			}
		});
		btnSuma.setBounds(10, 129, 41, 23);
		contentPane.add(btnSuma);

		JButton btnResta = new JButton("-");
		btnResta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				calcularResultado("-");
			}
		});
		btnResta.setBounds(60, 129, 41, 23);
		contentPane.add(btnResta);

		JButton btnMultiplicacion = new JButton("*");
		btnMultiplicacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				calcularResultado("*");
			}
		});
		btnMultiplicacion.setBounds(110, 129, 41, 23);
		contentPane.add(btnMultiplicacion);

		JButton btnDivision = new JButton("/");
		btnDivision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				calcularResultado("/");
			}
		});
		btnDivision.setBounds(160, 129, 37, 23);
		contentPane.add(btnDivision);

		JButton btnCE = new JButton("CE");
		btnCE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				calcularResultado("CE");
			}
		});
		btnCE.setBounds(206, 129, 52, 23);
		contentPane.add(btnCE);
		
		chkPositivo = new JCheckBox("Positivo");
		chkPositivo.setBackground(Color.green);
		chkPositivo.setBounds(231, 10, 97, 23);
		contentPane.add(chkPositivo);
		
		chkNegativo = new JCheckBox("Negativo");
		chkNegativo.setBackground(Color.red);
		chkNegativo.setBounds(231, 35, 97, 23);
		contentPane.add(chkNegativo);
		
		chkNeutro = new JCheckBox("Neutro");
		chkNeutro.setBackground(Color.gray);
		chkNeutro.setBounds(231, 60, 97, 23);
		contentPane.add(chkNeutro);
		
		JRadioButton rdbtnSuma = new JRadioButton("+");
		rdbtnSuma.addItemListener(this);
		buttonGroup.add(rdbtnSuma);
		rdbtnSuma.setBounds(345, 15, 52, 23);
		contentPane.add(rdbtnSuma);
		
		JRadioButton rdbtnResta = new JRadioButton("-");
		rdbtnResta.addItemListener(this);
		buttonGroup.add(rdbtnResta);
		rdbtnResta.setBounds(345, 53, 52, 23);
		contentPane.add(rdbtnResta);
		
		JRadioButton rdbtnProd = new JRadioButton("*");
		rdbtnProd.addItemListener(this);
		buttonGroup.add(rdbtnProd);
		rdbtnProd.setBounds(345, 91, 52, 23);
		contentPane.add(rdbtnProd);
		
		JRadioButton rdbtnDiv = new JRadioButton("/");
		rdbtnDiv.addItemListener(this);
		buttonGroup.add(rdbtnDiv);
		rdbtnDiv.setBounds(345, 129, 52, 23);
		contentPane.add(rdbtnDiv);
		
		JComboBox cmbOperaciones = new JComboBox();
		cmbOperaciones.setModel(new DefaultComboBoxModel(new String[] {"(selecciona)", "+", "-", "*", "/"}));
		cmbOperaciones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(cmbOperaciones.getSelectedIndex()>0){
					calcularResultado((String)cmbOperaciones.getSelectedItem());
				}
			}
		});
		
		cmbOperaciones.setBounds(120, 92, 97, 20);
		contentPane.add(cmbOperaciones);
		
		JLabel lblOperacion = new JLabel("Operacion:");
		lblOperacion.setBounds(52, 89, 65, 14);
		contentPane.add(lblOperacion);
	}
	
	private void calcularResultado(String op) {
		double resul = 0;
		double num1 = 0;
		double num2 = 0;
		// coger valor num1
		try {
			num1 = Double.parseDouble(txtNumero1.getText());
		}catch (NumberFormatException nfe) {
			JOptionPane.showMessageDialog(null, "Debes introducir un entero");
			txtNumero1.requestFocus();
			txtNumero1.selectAll();
			return;
		}
		// coger valor num2
		try {
			num2 = Double.parseDouble(txtNumero2.getText());
		} catch (NumberFormatException nfe) {
			JOptionPane.showMessageDialog(null, "Debes introducir un entero");
			txtNumero2.requestFocus();
			txtNumero2.selectAll();
			return;
		}
		switch (op) {
		case "+":
			resul = num1 + num2;
			break;
		case "-":
			resul = num1 - num2;
			break;
		case "*":
			resul = num1 * num2;
			break;
		case "/":
			resul = num1 / num2;
			break;
		case "CE":
			// mostrar en todos vacio
			txtNumero1.setText("");
			txtNumero2.setText("");
			txtResultado.setText("");
			txtNumero1.requestFocus();
			break;
		}
		//Mostrar en txtResultado el resultado de las operaciones
		txtResultado.setText(String.valueOf(resul));
		//actualizar la informacion de los checkBox
		actualizarCheckBox(resul);
	}

	private void actualizarCheckBox(double resul) {
		chkPositivo.setSelected(false);
		chkNegativo.setSelected(false);
		chkNeutro.setSelected(false);
		if (resul > 0) {
			chkPositivo.setSelected(true);
		} else if (resul < 0) {
			chkNegativo.setSelected(true);
		} else {
			chkNeutro.setSelected(true);
		}		
	}
	public void itemStateChanged(ItemEvent arg0) {
		// arg0-->devuelve el elemento que ha creado ese evento
		JRadioButton rdbtnSel = (JRadioButton) arg0.getSource();
		if (rdbtnSel.isSelected()) {
			calcularResultado(rdbtnSel.getText());
		}
	}
}
