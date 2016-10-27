package ejercicioswhile;
import java.util.Scanner;
public class NumerosPosNeg {

	public static void main(String[] args) {
		//variables
		int cont=0;
		int num=0;
		//iniciar scanner
		Scanner sc=new Scanner(System.in);
		while(num>=0){
			cont++;
		//Pedir numero
		System.out.print("Introduce un numero: ");
		//Leer numero
		num=sc.nextInt();
		}
		System.out.print("Los numeros introducidos han sido: "+cont);
	}

}
