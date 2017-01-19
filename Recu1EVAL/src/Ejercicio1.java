import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		//Variables
		int num1,num2,aux=0;
		//Iniciar scanner
		Scanner sc=new Scanner(System.in);
		//Pedir numeros
		System.out.print("Num1: ");
		num1=sc.nextInt();
		//Otro numero
		System.out.print("Num2: ");
		num2=sc.nextInt();
		//Cambiamos los numeros
		aux=num1;
		num1=num2;
		num2=aux;
		//Mostrar por pantalla
		System.out.print("Tras intercambiar, Num1: "+num1+" y Num2: "+num2);
		
		

	}

}
