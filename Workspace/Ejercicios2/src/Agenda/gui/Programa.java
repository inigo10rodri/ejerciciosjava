package Agenda.gui;
import java.util.Scanner;

import Agenda.datos.Amigos;

public class Programa {

	public static void main(String[] args) {
		//Iniciar scanner
		Scanner sc=new Scanner(System.in);
		//Crear amigo
		Amigos amigo=new Amigos("");
		//Definir las variables para guardar los datos
		String nombre;
		String email;
		String telefono;		
		//Pedir nombre del amigo
		System.out.print("Nombre: ");
		nombre=sc.nextLine();
		//Pedir email del amigo
		System.out.print("Email: ");
		email=sc.nextLine();
		//Pedir telefono del amigo
		System.out.print("Telefono: ");
		telefono=sc.nextLine();
		//Asignarle los datos introducidos por el usuario
		amigo.setNombre(nombre);
		amigo.setEmail(email);
		amigo.setTelefono(telefono);
		//Leer por pantalla el resultado final

	}

}
