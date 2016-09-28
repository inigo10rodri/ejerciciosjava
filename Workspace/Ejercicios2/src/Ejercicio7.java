import java.util.Scanner;
public class Ejercicio7 {
//Pedir un número entre 0 y 9.999 y decir cuántas cifras tiene.
	public static void main(String[] args) {
		//Definir las variables
		int numero;	
		int cifras=0;
		//Iniciar scanner
		Scanner sc=new Scanner(System.in);
		//Pedir un numero
		System.out.print("Introduce un numero entre 0 y 9999: ");
		//Leer numero
		numero=sc.nextInt();
		//Definimos una variable contador que sea igual al numero
		int contador=numero;
		/*Ponemos la condicion de que debe ser si es un numero menor que 0 o mayor que 9999 te diga que
		tiene que ser un numero entre 0 y 9999*/
		if (0>numero || numero>9999){
			System.out.print("El numero debe estar entre 0 y 9999");
			//Metemos otra vez el numero por teclado
			numero=sc.nextInt();
									}
		/* sino que haga la operacion de dividir entre 10 el numero hasta que se quede en 0*/
		else {
			while (contador>0){
				contador=contador/10;
				cifras++;			
			
			 }
			//Leer el resultado 
			System.out.println(numero + " tiene " + cifras + " dígitos");
		}

	}

}
