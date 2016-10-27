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
		/*Mientras contador sea menor que 4, vamos ampliando el contador y vamos introduciendo los numeros.
		Despues que haga la suma de los numeros y lo guarde en la variable suma*/
		while(contador<4){
			contador++;
			System.out.print("Introduce un numero: ");
			num=sc.nextInt();
			suma=suma+num;
		}//while
		//Leer el resultado por pantalla
		System.out.print("La suma es: "+suma);
	}//main

}//class
