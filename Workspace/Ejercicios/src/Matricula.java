import java.util.Scanner;
public class Matricula {

	public static void main(String[] args) {
		//Definicion de las constantes
		final int MAYORIA_EDAD=18;
		//Define las variables
		String nombre;
		int edad;
		//Años que tine que esprar para matricularse
		int anosEspera;
		//Inicia el scanner
		Scanner sc=new Scanner(System.in);
		//Mostrar mensaje inicial
		System.out.println("Introduce datos para la matricula: ");
		//Pedir nombre al usuario
		System.out.print("Nombre: ");
		//Leer el nombre del usuario y guardarlo en la variable
		nombre=sc.nextLine();
		//Pedir la edad al usuario
		System.out.print("Edad: ");
		//Leer la edad del usuario y guardarlo en la variable
		edad=sc.nextInt();
		//Si es mayor de edad
		if (edad>=MAYORIA_EDAD){
			//Mensaje matricula realizada
			System.out.print(nombre+ ", tu matricula ha sido realizada.");
		}		
		//Si nos es mayor de edad
		else{
			System.out.println(nombre+ ", tienes que ser mayor de Edad!");
			//Calcula los años de espera
			anosEspera=MAYORIA_EDAD-edad;
			//Mensaje años de espera
			System.out.print("Vuelve dentro de "+anosEspera+" año(s).");
		}

	}

}
