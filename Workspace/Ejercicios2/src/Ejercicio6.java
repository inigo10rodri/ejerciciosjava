import java.util.Scanner;
public class Ejercicio6 {
//Pedir dos números y mostrarlos ordenados de mayor a menor
	public static void main(String[] args) {
		//Definir las variables
		double numero1;
		double numero2;
		//Iniciar el scanner
		Scanner sc=new Scanner(System.in);
		//Pedir primer numero al usuario
		System.out.print("Introduce el primer numero: ");
		//Leer primer numero
		numero1=sc.nextDouble();
		//Pedir sgundo numero
		System.out.print("Introduce el segundo numero: ");
		//Leer segundo numero
		numero2=sc.nextDouble();
		//Poner en orden los numeros de mayor a menor
		if(numero1>numero2){
			System.out.print(numero1+ ">"+ numero2);
		}
		else {
			System.out.print(numero2+">"+numero1);
		}

	}

}
