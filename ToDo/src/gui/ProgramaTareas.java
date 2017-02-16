package gui;

import java.util.InputMismatchException;
import java.util.Scanner;

import model.GestorTareas;
import model.Tarea;

public class ProgramaTareas {
	private static int OPCION_SALIR=6;
	GestorTareas gt=new GestorTareas();
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		int opc=0;
		do{		
			MostrarMenu();
			//leer opcion
			opc=leerOpcion();
			
		}while(opc!=OPCION_SALIR);
		System.out.println("Has salido del programa!!");
		
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
	private static int leerOpcion(){
		Scanner sc=new Scanner(System.in);
		int opc;
		try{//Tratar la excepcion por si escribe algo que no sea un numero
		opc=sc.nextInt();
		sc.nextLine();
		return opc;
		}catch(InputMismatchException e){
			System.out.println("La opcion ha de ser un numero!!!");
			System.out.println("Pulse intro para continuar...");
			//para saltar lo escrito anteriormente
			sc.nextLine();
			//esperar a que pulse intro
			sc.nextLine();
			return 0;
		}		
	}
}
