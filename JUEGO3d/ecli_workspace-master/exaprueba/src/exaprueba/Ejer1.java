package exaprueba;

import java.util.Scanner;

public class Ejer1 {

	public static void main(String[] args) {
		int nacimiento;
		String nombre;
		int a�oActual = 2016;

		Scanner sc = new Scanner(System.in);

		System.out.println("Como te llamas?");
		nombre = sc.nextLine();
		System.out.println("En que a�o nacistes?");
		nacimiento = sc.nextInt();
		System.out.println(nombre + " tienes " + (a�oActual - nacimiento) + " a�os");

	}

}
