package Temperatura;

import java.util.Scanner;

/*Crear una funci�n que calcule la temperatura media de un d�a a partir de la temperatura
m�xima y m�nima. Crear un programa principal, que utilizando la funci�n anterior, vaya pidiendo
la temperatura m�xima y m�nima de cada d�a y vaya mostrando la media.*/
public class Programa {

	public static void main(String[] args) {
		//Variables
		double tempMin;
		double tempMax;
		//Creamos una temperatura
		Temperatura t=new Temperatura();
		//Iniciar scanner
		Scanner sc=new Scanner (System.in);
		//Pedir temperatura minima
		System.out.print("Introduce la temperatura minima: ");
		tempMin=sc.nextDouble();
		//Pedir temperatura maxima
		System.out.print("Introduce la temperatura maxima: ");
		tempMax=sc.nextDouble();
		System.out.print("La media es: " + Temperatura.setTemperaturaMedia);

	}

}
