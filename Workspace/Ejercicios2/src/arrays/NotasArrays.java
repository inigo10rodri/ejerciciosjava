package arrays;

import java.util.Scanner;

public class NotasArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String nombre;
		//String[] TotAsignaturas;
		//int[] TotAlumnos;
		int[] TotNotas=new int [10];
		int suma=0;
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<TotNotas.length;i++){
			System.out.print("Nota "+i+":");
			int nota =sc.nextInt();
			TotNotas[i]= nota;
			
			//calcular la suma de las notas
			suma=suma+nota;			
		}//for

		System.out.println("La suma de las notas es: "+suma);
	}//main

}//class
