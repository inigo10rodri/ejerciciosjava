package clases;

import javax.swing.JFrame;

public class Ventana extends JFrame {

	private final int ANCHO = 800;
	private final int ALTO = 500;

	private TableroJuego lamina; // crear objeto de la clase, que es un JPanel
	private Hilo hilo; // crea un Thread para redibujar el Jpanel

	public Ventana() {
		setTitle("PONG");
		setSize(ANCHO, ALTO);
		setLocationRelativeTo(null); // poner la ventana en le centro pantalla
		setResizable(false); // para impedir modificar el tama�o de la ventan

		lamina = new TableroJuego();
		add(lamina); // A�ade el JPanel al JFrame

		addKeyListener(new EventoTeclado());

		setVisible(true); // hacer ventana visible
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // para cerrar

		hilo = new Hilo(lamina);
		hilo.start();// comienza a redibujar en la pantalla. Se ve elmovimiento

	}
}
