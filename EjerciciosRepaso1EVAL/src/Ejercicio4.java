import java.util.Scanner;

/*Realizar un programa que pida al usuario dos n�meros y diga cu�l es el mayor y
cu�l el menor.*/
public class Ejercicio4 {

	public static void main(String[] args) {
		//Variables
		int num1;
		int num2;
		//Iniciar scanner
		Scanner sc=new Scanner(System.in);
		//Pedir numeros
		System.out.print("Introduce un numero: ");
		num1=sc.nextInt();
		//Pedir otro numero
		System.out.print("Introduce otro numero: ");
		num2=sc.nextInt();
		if(num1>num2){
			System.out.print("El numero mayor es "+num1+" y el menor "+num2);
		}else{
			System.out.print("El numero mayor es "+num2+" y el menor "+num1);
		}

	}

}