import java.util.Scanner;

/*Realizar un programa que pida al usuario dos n�meros y presente los n�meros 
impares que hay desde el primer n�mero al segundo que introdujo el usuario. */
public class Ejercicio6 {

	public static void main(String[] args) {
		//Variables
		int num1;
		int num2;
		//Iniciar scanenr
		Scanner sc=new Scanner(System.in);
		//Pedir primer numero
		System.out.print("Introduce un numero: ");
		num1=sc.nextInt();
		//Pedir otro numero
		System.out.print("Introduce otro numero: ");
		num2=sc.nextInt();
		for(int i=num1;i<=num2;i++){
			if (i%2 != 0) {
				System.out.println(" -> "+i);
			}//if		
		}//for
	}//main
}//class
