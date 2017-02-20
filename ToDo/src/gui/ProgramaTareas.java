package gui;

import java.util.InputMismatchException;
import java.util.Scanner;

import model.GestorTareas;
import model.Tarea;

public class ProgramaTareas {
	private static Scanner sc=new Scanner(System.in);
	private static int OPCION_SALIR=8;
	private static GestorTareas gt=new GestorTareas();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		int opc=0;
		do{		
			MostrarMenu();
			//leer opcion seleccionada
			opc=leerOpcion();
			//ejecutar la opcion seleccionada
			ejecutarOpcion(opc);
		}while(opc!=OPCION_SALIR);
		System.out.println("Has salido del programa!!!");
		
	}
	
	private static void MostrarMenu(){
		System.out.println("***** MENÚ TAREAS ********");
		System.out.println("1.- Añadir Tarea");
		System.out.println("2.- Finalizar Tarea");
		System.out.println("3.- Listar Todas");
		System.out.println("4.- Listar Realizadas");
		System.out.println("5.- Listar NoRealizadas");
		System.out.println("6.- Leer Tareas");
		System.out.println("7.- Guardar Tareas");
		System.out.println("8.- Salir");
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
			finalizarTarea();
			break;
		case 3: 
			//listar tareas
			listarTareas(GestorTareas.LISTAR_TODAS);
			break;
		case 4://listar realizadas
			listarTareas(GestorTareas.LISTAR_REALIZADAS);
			break;
		case 5: 
			//listar no realizadas
			listarTareas(GestorTareas.LISTAR_NO_REALIZADAS);
			break;
		case 6: 
			//leer tareas
			gt.leerTareas();
			break;
		case 7: 
			//guardar tareas
			gt.guardarTareas();
			break;
		case 8: 
			//Salir
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
		//pedir titulo de la tarea 
		//crear tarea
		Tarea t=new Tarea(pedirTitulo());
		//pedir al gestor de tareas que añada esta tarea
		gt.addTarea(t);
	}
	private static void finalizarTarea(){
		//pedir titulo de la tarea 
		//pedir al gestor que finalice tarea
		gt.finTarea(pedirTitulo());
	}
	private static String pedirTitulo(){
		//pedir titulo de la tarea 
		System.out.println("Titulo: ");
		String titulo=sc.nextLine();
		return titulo;
	}
	private static void listarTareas(int tipoListado){
		//pedir al gestor todas las tareas
		Tarea[] lstTareas=gt.getTareas(tipoListado);
		//recorrer el array de tareas e imprimirlas
		for(int i=0;i<lstTareas.length;i++){//=(Tarea t:lstTareas)
			Tarea t=lstTareas[i];
			System.out.println(lstTareas[i]);
		}
	}
	
}//class
