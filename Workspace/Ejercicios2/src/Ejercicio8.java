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
		if (0>numero || numero>9999){
			System.out.print("El numero debe estar entre 0 y 9999");
			numero=sc.nextInt();
									}
		else {
			while (numero!= 0){
				resto = numero % 10;
				numero = numero / 10;
				numeroInv = numeroInv*10 + resto;}
			System.out.print("El numero invertido es: " +numeroInv);
			 }
	}

}
