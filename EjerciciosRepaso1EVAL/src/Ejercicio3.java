import java.util.Scanner;

/*Realizar un programa que pida al usuario 10 n�meros y los muestra por consola en 
el orden inverso al introducido.*/
public class Ejercicio3 {

	public static void main(String[] args) {
		//Iniciar scanner
		Scanner sc=new Scanner(System.in);
		//Variables
		final int MAX_LENGHT=10;
		int Numeros[]=new int [MAX_LENGHT];
		
		for(int i=MAX_LENGHT-1;i>=0;i--){
			System.out.println("Introduce un numero: ");
			Numeros[i]=sc.nextInt();
		}//for
		for(int i=0;i<MAX_LENGHT;i++){
			System.out.print(Numeros[i]+" ");
		}//for	
	}//main
}//class

