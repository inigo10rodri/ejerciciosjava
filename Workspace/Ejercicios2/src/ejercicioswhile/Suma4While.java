package ejercicioswhile;
import java.util.Scanner;
public class Suma4While {

	public static void main(String[] args) {
		//Variables
		int suma=0;
		int num=0;
		int contador=0;
		//Iniciar scanner
		Scanner sc=new Scanner(System.in);
		while(contador<4){
			contador++;
			System.out.print("Introduce un numero: ");
			num=sc.nextInt();
			suma=suma+num;
		}//while
		System.out.print("La suma es: "+suma);
	}//main

}//class
