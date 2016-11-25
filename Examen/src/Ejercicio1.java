import java.time.Year;
import java.util.Scanner;
public class Ejercicio1 {

	public static void main(String[] args) {
		//variables
		final int anoActual=2016;
		int edad;
		String nombre;
		//Iniciar scanner
		Scanner sc=new Scanner(System.in);
		//Pedir la edad al usuario
		System.out.print("Edad: ");
		//Leer edad
		edad=sc.nextInt();
		sc.nextLine();
		//Pedir nombre al suusario
		System.out.print("Nombre: ");
		//Leer nombre
		nombre=sc.nextLine();
		//Mostrar resultado
		System.out.print(nombre+" naciste el año "+(anoActual-edad));
		System.out.print(nombre+" naciste el año "+(Year.now().getValue()-edad));

	}

}
