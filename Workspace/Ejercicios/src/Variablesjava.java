import java.util.Scanner;
public class Variablesjava {

	public static void main(String[] args) {
		//Define una var con el numero de asignaturas
		final int NUM_ASIG_ALUM=3;
		//crear un scanner para leer por consola
		Scanner sc=new Scanner(System.in);
		//definir una var para guardar el nombre del usuario
		String nombre;
		//definir una var para guardar la nota de prog
		int notaProg;
		//definir una var para guardar la nota de bbdd
		int notaBD;
		//definir una var para guardar la nota de leng marcas
		int notaLM;
		//Pedir un nombre al usuario
		System.out.print("Nombre:");
		nombre=sc.nextLine();		
		//Pedir las notas al usuario
		System.out.println("Introduce tus notas...");
		//Introduce la nota de Programación
		System.out.print("Programción:");
		notaProg=sc.nextInt();
		//Introduce la nota de BD
		System.out.print("Bases de Datos:");
		notaBD=sc.nextInt();
		//Introduce la nota de LM
		System.out.print("Lenguaje de Marcas:");
		notaLM=sc.nextInt();		
		//definir una var para calcular la media
		double notaMedia=(double)(notaProg+notaBD+notaLM)/NUM_ASIG_ALUM;
		//escribe tu media por consola
		System.out.print(nombre+" tu nota media es: "+String.format("%.2f",notaMedia));
	}
}

		/*/Define una var con el numero de asignaturas
		final int NUM_ASIG_ALUM=3;
		//definir una var para guardar la nota de prog
		int notaProg;
		//definir una var para guardar la nota de bbdd	
		int notaBD;		
		//definir una var para guardar la nota de leng marcas
		int notaLM;		
		//inicializa las vars con las notas q vas a sacar
		notaProg=3;
		notaBD=9;
		notaLM=5;
		//definir una var para calcular la media
		double notaMedia=(double)(notaProg+notaBD+notaLM)/NUM_ASIG_ALUM;
		//escribe tu media por consola
		System.out.print("Nota media: "+String.format("%.2f",notaMedia));
	
	}
	static void calcularEdad(){
		//definir una variable ano e inicializarla a
				//2016
				int ano=2016;
				//definir una variable anoNac e iniciarlizarla a 
				//<el que quieras>
				int anoNac=1996;
				//definir una variable nombre e inicializarla a
				//tu nombre
				String nombre="Iñigo";
				//muestra el mensaje: xxx tienes yy años		
				int edad= ano-anoNac;
				System.out.print(nombre+" tienes "+edad+" años");
	}*/
