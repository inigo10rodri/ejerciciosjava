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
		if(ISBN.length()!=10){
			System.out.println("Tienes que introducir 10 numeros! ");	
		}else{
			//comprobar si todos son digitos
			for(int i=0;i<10;i++){
				char car=ISBN.charAt(i);
				if(car<'0' || car>'9');
					System.out.print("El ISBN solo puede contener digitos");
					return;
			}
			for(int i=1;i<=10;i++){				
			//suma=suma+i*Integer.parseInt(ISBN.substring(i-1,1));
			//suma=suma+i*(ISBN.charAt(i-1)-48;
			//
			suma=suma+i*(ISBN.charAt(i-1)-'0');
			}//for
		System.out.print("El resultado obtenido es: "+suma+"\n");
		//Dividimos entre 11 y si el resto es igual a 0 el ISBN es correcto
		if(suma%11==0){
			System.out.print("ISBN correcto!");
		}else {
			System.out.print("ISBN incorrecto!");
		}//else
		}//else

	}//main

}//class
