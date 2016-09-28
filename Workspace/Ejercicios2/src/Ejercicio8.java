import java.util.*;
public class Ejercicio8 {
//Pedir un número entre 0 y 9.999 y mostrarlo con las cifras al revés.
	public static void main(String[] args) {
		// Definimos las variables
		int numero,numeroInv=0, resto;
		//Iniciar scanner
		Scanner sc=new Scanner(System.in);
		//Pedir numero al usuario
		System.out.print("Introduce un numero entre 0 y 9999: ");
		//Leer numero
		numero=sc.nextInt();
		/*Ponemos la condicion de que debe ser si es un numero menor que 0 o mayor que 9999 te diga que
		tiene que ser un numero entre 0 y 9999*/
		if (0>numero || numero>9999){
			System.out.print("El numero debe estar entre 0 y 9999");
			//Metemos otra vez el numero por teclado
			numero=sc.nextInt();
									}
		// sino que mientras sea mayor que 0 
		else {
			while (numero!= 0){
				//Coger el resto de la division
				resto = numero % 10;
				//Coger el numero de la division
				numero = numero / 10;
				//El numero invertido que sea igual al numeroInv por 10 mas el resto
				numeroInv = numeroInv*10 + resto;}
			//Leer el resultado
			System.out.print("El numero invertido es: " +numeroInv);
			 }
	}

}
