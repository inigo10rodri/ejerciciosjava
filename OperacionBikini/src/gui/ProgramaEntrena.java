package gui;

import java.util.InputMismatchException;
import java.util.Scanner;

import model.GestorEntrena;


public class ProgramaEntrena {
	private static Scanner sc=new Scanner(System.in);
	private static int OPCION_SALIR=6;
	private static GestorEntrena ge=new GestorEntrena();

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
		System.out.println("***** MENÚ ENTRENAS ********");
		System.out.println("1.- Nuevo");
		System.out.println("2.- Eliminar");
		System.out.println("3.- Modificar");
		System.out.println("4.- Listar");
		System.out.println("5.- Totales");
		System.out.println("6.- Salir");
		System.out.print("Opción: ");
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
			case 1://añadir entrena
				addTarea();
				break;
			case 2:
				//eliminar entrena
				
				break;
			case 3: 
				//modificar entrena
				
				break;
			case 4:
				//listar entrenas
				
				break;
			case 5: 
				//totales
				
				break;
			case 6: 
				//salir
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
		
	}

}
