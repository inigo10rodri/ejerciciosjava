package clases;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class EventoTeclado extends KeyAdapter {

	static boolean w, s, up, down;

	public void keyPressed(KeyEvent e) {
		int id = e.getKeyCode();

		if (id == KeyEvent.VK_W) {
			w = true;
		}
		if (id == KeyEvent.VK_S) {
			s = true;
		}
		if (id == KeyEvent.VK_UP) {
			up = true;
		}
		if (id == KeyEvent.VK_DOWN) {
			down = true;
		}
	}

	public void keyReleased(KeyEvent e) {
		int id = e.getKeyCode();

		if (id == KeyEvent.VK_W) {
			w = false;
		}
		if (id == KeyEvent.VK_S) {
			s = false;
		}
		if (id == KeyEvent.VK_UP) {
			up = false;
		}
		if (id == KeyEvent.VK_DOWN) {
			down = false;
		}
	}

}
