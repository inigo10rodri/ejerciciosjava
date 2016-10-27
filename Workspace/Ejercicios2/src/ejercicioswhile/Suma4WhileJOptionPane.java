package ejercicioswhile;
import javax.swing.JOptionPane;

import javax.swing.JOptionPane;
public class Suma4WhileJOptionPane {

	public static void main(String[] args) {
		//Variables
		int suma=0;
		int contador=0;
		while(contador<4){
			contador++;
			String num=JOptionPane.showInputDialog("Introduce un numero");
			int numero=Integer.parseInt(num);
			suma+=numero;
		}//while
		System.out.print("La suma es: "+suma);
	}//main

}//class
