package estructuras_Rep;
import java.util.Scanner;
public class Suma4For {

	public static void main(String[] args) {
		//variables
		int num;
		int suma=0;
		//iniciar scanner
		Scanner sc=new Scanner(System.in);			
		for (int i=1;i<=4;i++){
			System.out.print("Num: ");
			num=sc.nextInt();
			suma=suma+num;			
		}//for
		System.out.print("La suma es: " +suma);

	}//main

}//class
