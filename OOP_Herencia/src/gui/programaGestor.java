package gui;

import java.util.Scanner;

import model.Alumno;
import model.GestorAlumnos;

public class programaGestor {
	private static GestorAlumnos ga=new GestorAlumnos();
	private static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		int opc=0;
		do{		
		MostrarMenu();
		//leer opcion
		opc=sc.nextInt();
		sc.nextLine();
		//ejecutar opcion, le pasamos el scanner y el gestor como parametro. Tambien se pueden declarar como atributos de la clase.
		//ejecutarOpcion(opc,sc,ga);
		ejecutarOpcion(opc);
		addAlumno();
		}while(opc!=6);
	}
	
	public static void MostrarMenu(){
		System.out.println("***** MENÚ DE ALUMNOS ********");
		System.out.println("1.- Añadir");
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
				addAlumno();
				break;
			case 2:
				//mod alum
				modAlumno();
				break;
			case 3: 
				//Borrar alumno
				delAlumno();
				break;
			case 4:
				//Buscar alumno
				break;
			case 5: 
				//Imprimir alumnos
				getAlumno();
				break;
			case 6: 
				//Salir 
				break;
			default: 
				//error
				System.out.println("Error!! Introduce una opcion valida!");
		}//switch
	}//ejecutarOpcion
	private static void addAlumno() {
		//pedir datos y crear alumno
		Alumno al=pedirDatosAlumno();
		//llamar al metodo del gestor addAlumno()
		ga.addAlumno(al);				
	}//addAlumno
	private static void modAlumno(){
		//pedir indice
		int index=pideIndice();
		//pedir datos y crear alumno
		Alumno al=pedirDatosAlumno();
		//llamar al metodo del gestor modAlumno()
		ga.modAlumno(index,al);
	}
	private static Alumno pedirDatosAlumno(){
		//pedir nombre
		System.out.println("Nombre: ");
		String nombre=sc.nextLine();
		//pedir nota
		System.out.println("Nota: ");
		double nota=sc.nextDouble();
		//crear un objeto alumno con los datos
		Alumno al=new Alumno(nombre,nota);
		return al;
	}
	private static void delAlumno(){
		//pedir indice
		int index=pideIndice();
		//llamar al metodo del gestor para borrar el alumno
		ga.delAlumno(index);
		System.out.println("El alumno "+index+" ha sido eliminado!");
	}
	private static void getAlumno(){
		//pedir indice
		System.out.println("Indice: ");
		int index=sc.nextInt();
		//eliminar alumno
		ga.getAlumno(index);
	}
	private static int pideIndice(){
		//pedir indice
		System.out.println("Indice: ");
		int index=sc.nextInt();
		sc.nextLine();
		return index;		
	}
}
