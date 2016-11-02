package arrays;

import java.util.Scanner;

public class NotasArrays {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
		//String nombre;
		//String[] TotAsignaturas;
		//int[] TotAlumnos;
		int[] TotNotas=new int [10];
		int suma=0;		
		for(int i=0;i<TotNotas.length;i++){
			System.out.print("Nota "+i+":");
			int nota =sc.nextInt();
			TotNotas[i]= nota;
		}//for
		//calcular la suma de las notas
		for(int j=0;j<TotNotas.length;j++){
			suma+=TotNotas[j];				
		}//for
		System.out.println("La suma de las notas es: "+suma);
		System.out.println("La nota media es: "+(double) suma/TotNotas.length);
	}//main

}//class
