import java.util.Scanner;
//Pedir dos números y decir si son iguales o no.
public class Ejercicio2 {

	public static void main(String[] args) {
		//Definir las variables
		double numero1;
		double numero2;
		//Inicia scanner
		Scanner sc=new Scanner(System.in);
		//Pedir primer numero
		System.out.print("Introduce el primer numero: ");
		//Leer el primer numero
		numero1=sc.nextDouble();
		//Pedir segundo nombre
		System.out.print("Introduce el segundo numero: ");
		//Leer el segundo numero
		numero2=sc.nextDouble();
		//Decir si son iguales o no
		if (numero1==numero2){
			System.out.print("Los numeros son iguales!");
		}
		else{
			System.out.print("No son iguales!");
		}

	}

}
