package gui;

import java.util.InputMismatchException;
import java.util.Scanner;

import model.GestorTareas;
import model.Tarea;

public class ProgramaTareas {
	private static Scanner sc=new Scanner(System.in);
	private static int OPCION_SALIR=6;
	private static GestorTareas gt=new GestorTareas();
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		int opc=0;
		do{		
			MostrarMenu();
			//leer opcion
			opc=leerOpcion();
			//ejecutar la opcion seleccionada
			ejecutarOpcion(opc);
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
		int opc;
		try{//Tratar la excepcion por si escribe algo que no sea un numero
		opc=sc.nextInt();
		sc.nextLine();
		return opc;
		}catch(InputMismatchException e){
			System.out.println("La opcion ha de ser un numero!!!");
			//para saltar lo escrito anteriormente
			sc.nextLine();
			//espera a que el usuario pulse intro
			pulsaIntro();		
			return 0;
		}		
	}
	private static void ejecutarOpcion(int opc){
		switch(opc){
		case 0://es cuando el usuario ha introducido algo no numérico en opc
			break;
		case 1://añadir tarea
			addTarea();
			break;
		case 2:
			//finalizar tarea
			finTarea();
			break;
		case 3: 
			//listar tareas
			//printTareas();
			break;
		case 4://listar realizadas
			//printHechas();
			break;
		case 5: 
			//listar no realizadas
			//printNoHechas();
			break;
		case 6: 
			//Salir
			System.out.println("Has salido del gestor...");
			break;
		default: 
			//error
			System.out.println("La opcion tiene que ser entre 0 y "+OPCION_SALIR);
		}//switch
		
	}
	private static void pulsaIntro(){
		System.out.println("Pulse intro para continuar...");			
		//esperar a que pulse intro
		sc.nextLine();
	}	
	private static void addTarea(){
		//Pedir titulo
		System.out.println("Introduce el nombre de la tarea: ");
		String titulo=sc.nextLine();
		//crear tarea
		Tarea t1=new Tarea(titulo);
		//pedir al gestor de tareas que añada esta tarea
		gt.addTarea(t1);
	}
	private static void finTarea(){
		//finalizar tarea
		
	}
	
}
