package gui;

import java.util.Scanner;

import model.GestorAlumnos;

public class programaGestor {

	public static void main(String[] args) {
		GestorAlumnos ga=new GestorAlumnos();
		Scanner sc=new Scanner(System.in);
		int opc=0;
		do{		
		MostrarMenu();
		//leer opcion
		opc=sc.nextInt();
		//ejecutar opcion
		ejecutarOpcion(opc);	
		}while(opc!=6);

	}
	public static void MostrarMenu(){
		System.out.println("***** MENÚ DE ALUMNOS ********");
		System.out.println("1.-Añadir");
		System.out.println("2.- Modificar");
		System.out.println("3.- Borrar");
		System.out.println("4.- Buscar");
		System.out.println("5.- Imprime");
		System.out.println("6.- Salir");
		System.out.print("Opción:");
	}
	public static void ejecutarOpcion(int opc){
		switch(opc){
		case 1://añadir alumno
			//pedir nombre
			//pedir nota
			//crear un objeto alumno con los datos
			//añadir el alumno
			break;
		case 2:
			//mod alum
			break;
		case 3: 
			//Borrar alumno
			break;
		case 4:
			//Buscar alumno
			break;
		case 5: 
			//Imprimir alumnos
			break;
		case 6: 
			//Salir 
			break;
		default: 
			//error
			System.out.println("Error!! Introduce una opcion valida!");
		}
	}

}
