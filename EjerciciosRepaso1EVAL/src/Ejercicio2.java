import java.util.Scanner;

/*Realizar un programa que pida al usuario un n�mero y presente los n�meros del 1 al
n�mero que introdujo el usuario.*/
public class Ejercicio2 {

	public static void main(String[] args) {
		//Variables
		int num;
		//Iniciar scanner
		Scanner sc=new Scanner(System.in);
		System.out.print("Introduce un numero: ");
		num=sc.nextInt();
		for(int i=1;i<=num;i++){
			System.out.print(i);
			System.out.print(" ");
		}
	}

}