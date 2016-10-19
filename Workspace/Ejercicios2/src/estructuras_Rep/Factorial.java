package estructuras_Rep;
import java.util.Scanner;
//Pide un numero y muestra el factorial
public class Factorial {

	public static void main(String[] args) {
		//variables
		int numero;
		int factorial=1;
		//iniciar scanner
		Scanner sc=new Scanner(System.in);
		System.out.print("Numero:");
		numero=sc.nextInt();
		//bucle	i es igual al numero, mientras el numero sea mayor o igual que 1 vaya restando de uno en uno	
		for(int i=numero;numero>=1;numero--){
			factorial=factorial*numero;
											}
		System.out.println(factorial);

	}//main

}//class
