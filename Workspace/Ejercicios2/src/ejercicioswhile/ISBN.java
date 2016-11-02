package ejercicioswhile;

import java.util.Scanner;

public class ISBN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//variables
		String ISBN;
		int suma=0;
		System.out.print("ISBN: ");
		ISBN=sc.nextLine();
		for(int i=1;i<=10;i++){
			suma=suma+i*(int)ISBN.charAt(i);
		}

	}

}
