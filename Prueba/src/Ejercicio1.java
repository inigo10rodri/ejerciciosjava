import java.util.Scanner;
public class Ejercicio1 {
//Pida al usuario su a�o de nacimiento y su nombre y muestra como resultado "juan tienes 20 a�os"
	public static void main(String[] args) {
		//iniciar scanner
		Scanner sc=new Scanner(System.in);
		//variables
		String nombre;
		int nacimiento;
		final int anoActual=2016;
		//Pedir nombre
		System.out.print("Nombre: ");
		//Leer nombre
		nombre=sc.nextLine();
		//Pedir nacimiento
		System.out.print("Nacimiento: ");
		//Leemos el nacimiento
		nacimiento=sc.nextInt();		
		//Mostrar el resultado
		System.out.print(nombre+" tienes "+ (anoActual-nacimiento)+ " a�os.");	
	}//main
}//class
