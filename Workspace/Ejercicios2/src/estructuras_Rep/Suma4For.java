package estructuras_Rep;
import java.util.Scanner;
public class Suma4For {

	public static void main(String[] args) {
		//variables
		int num;
		int suma=0;
		//iniciar scanner
		Scanner sc=new Scanner(System.in);	
		//inicializamos i a 1 hasta que sea menor o igual a 4 y vamos incrementandolo de uno en uno
		for (int i=1;i<=4;i++){
			//Pedimos al usuario un numero
			System.out.print("Num: ");
			//Leemos por pantalla
			num=sc.nextInt();
			//suma es igual a la suma mas el numero añadido hasta que se introduzacn 4 numeros
			suma=suma+num;			
		}//for
		//Leemos por pantalla el resultado final
		System.out.print("La suma es: " +suma);

	}//main

}//class
