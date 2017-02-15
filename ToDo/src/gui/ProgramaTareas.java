package gui;

import java.util.Scanner;

import model.GestorTareas;
import model.Tarea;

public class ProgramaTareas {
	private static int OPCION_SALIR=6;
	GestorTareas gt=new GestorTareas();
	private static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		int opc=0;
		do{		
			MostrarMenu();
			//leer opcion
			opc=sc.nextInt();
			sc.nextLine();
			//ejecutar opcion, le pasamos el scanner y el gestor como parametro. 
			//ejecutarOpcion(opc,sc,ga);
			//Tambien se pueden declarar como atributos de la clase(ga,sc).		
			
		}while(opc!=OPCION_SALIR);
		
	}
	
	private static void MostrarMenu(){
		System.out.println("***** MENÚ TAREAS ********");
		System.out.println("1.- Añadir Tarea");
		System.out.println("2.- Finalizar Tarea");
		System.out.println("3.- Listar Todas");
		System.out.println("4.- Listar Realizadas");
		System.out.println("5.- Listar NoRealizadas");
		System.out.println("6.- Salir");
		System.out.print("Opción:");
	}

}
