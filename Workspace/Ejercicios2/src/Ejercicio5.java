import java.util.Scanner;
public class Ejercicio5 {
//Pedir dos números y decir cual es el mayor o si son iguales.
	public static void main(String[] args) {
		// Definir las variables
		double numero1;
		double numero2;
		//Iniciar el scanner
		Scanner sc=new Scanner(System.in);
		//Pedir el primer numero al usuario
		System.out.print("Introduce un numero: ");
		//Leer primer numero
		numero1=sc.nextDouble();
		//Pedir segundo numero
		System.out.print("Introduce otro numero: ");
		//Leer el segundo numero
		numero2=sc.nextDouble();
		//Condicion para decir cula es mayor o menor
		if(numero1==numero2){
			System.out.print("Los numeros son iguales");
							}		
		else 	{
		if(numero1>numero2){
			System.out.print("El numero "+numero1+" es mayor que el numero "+numero2);
							}
		else{
			System.out.print("El numero "+numero2+" es mayor que el numero "+numero1);
			}
				}

	}

}
