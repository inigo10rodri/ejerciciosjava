import java.util.Scanner;

/*Realizar un programa que pida las notas de 10 alumnos por pantalla y muestre un
men� de opciones: 1. Listar notas, 2.Calcular la media, 3.Calcular el menor, calcular
el mayor.*/ 
public class Ejercicio7 {

	public static void main(String[] args) {
		//Variables
		final int MAX_NOTAS=10;
		int nota[]=new int [MAX_NOTAS];
		int notaMenor=10;
		int notaMayor=0;
		int cont = 0;
		double suma = 0;
		int Menu;
		double media;
		//Iniciar scanner
		Scanner sc=new Scanner(System.in);
			for(int i=0 ; i<10 ; i++){
				System.out.print("Introduce una nota "+i+":");
				nota[i]=sc.nextInt();
					while(nota[i]<0 || nota[i]>10){
						System.out.println("Nota no valida, introduce una nota valida!");
						System.out.print("Introduce la nota "+i+":");
						nota[i]=sc.nextInt();
					}//while
			}//for
			System.out.println("Men� de opciones:\n -->1.Listar notas\n -->2.Calcular la media\n -->3.Calcular el menor\n -->4.Calcular el mayor");
			Menu=sc.nextInt();
			switch(Menu){
				case 1:
					System.out.print("Las notas son las siguientes:\n");
					for(int i=0 ; i<MAX_NOTAS ; i++){
						System.out.println(nota[i]);
					}
				break;			
				case 2: 
					for(int i=0 ; i<MAX_NOTAS ; i++){
						suma+=nota[i];
					}
					System.out.print("La media es: "+(suma/MAX_NOTAS));
				break;
				case 3: 	
					for(int i=0 ; i<MAX_NOTAS ; i++){
						if(nota[i]<notaMenor){
							notaMenor=nota[i];
						}//if
					}
					System.out.print("La nota menor es: "+notaMenor);
				break;
				case 4:
					for(int i=0 ; i<MAX_NOTAS ; i++){
						if(nota[i]>notaMayor){
							notaMayor= nota[i];
						}//if
					}
					System.out.print("La nota mayor es: "+notaMayor);
				break;
			}//switch
		}//main
	}//class


