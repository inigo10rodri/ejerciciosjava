package ejercicioswhile;
import java.util.Scanner;
public class Notas {

	public static void main(String[] args) {
		//Variables
		double nota;
		int contaprobados=0;
		int contsuspensos=0;
		double suma=0.0;		
		//Iniciar Scanner
		Scanner sc=new Scanner(System.in);
		do{
			//pedir nota
			System.out.println("Introduce una nota: (Ingrese una nota negativa para terminar!)");
			//leer nota
			nota=sc.nextDouble();			
			 //Cuando el numero sea mayor que 10 que introduzca un numero entre 0 y 10
		    if (nota>10){
		    	System.out.print("Introduce un numero entre 0 y 10\n");
		    }//if
		  //Si la nota esta entre 5 y menor o igual que 10 habra aprobado e incrementamos en el contador aprobados
			else if(nota>=5){
		    	contaprobados++;		
		    	suma=nota+suma;
		    	}//else if
		    //Si la nota esta entre 0 y menor que 4 habra suspendido e incrementamos en el contador suspensos
		    else if(nota>=0){
		    	contsuspensos++;
		    	suma=suma+nota;
			}//else if		   
			//Indicamos que ha salido correctamente
			else{
				System.out.print("Ha salido correctamente!\n");
			}//else			
		}while(nota>=0);
		//Mostrar por pantalla el resultado final
		System.out.print("El numero de aprobados son: "+contaprobados+"\n");
		System.out.print("El numero de suspensos son: "+contsuspensos+"\n");
		System.out.print("La media es: "+(suma/(contsuspensos+contaprobados)));

	}//main

}//class
