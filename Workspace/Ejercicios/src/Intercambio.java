import java.util.Scanner;
public class Intercambio {

	public static void main(String[] args) {
		//Definir las variables
		String nom1;
		String nom2;
		String aux;
		//Iniciar scanner
		Scanner sc= new Scanner(System.in);
		//Pedir primer nombre al usuario
		System.out.println("�Quien eres? ");
		//Leer el primer nombre
		nom1=sc.nextLine();
		//Pedir segundo nombre al usuario
		System.out.println("�Con quien quieres intercambiarte? ");
		//Leer el segundo nombre
		nom2=sc.nextLine();
		//Realizar el cambia del contenido de variables
		aux=nom1;
		nom1=nom2;		
		nom2=aux;
		//Mostrar mensaje final
		System.out.print("OK! Ahora tu eres "+nom1+" y el otro es "+nom2+".");
	}
}
