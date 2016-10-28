package ejercicioswhile;
import java.util.Scanner;
public class Notas {

	public static void main(String[] args) {
		//Variables
		double nota=0;
		int contador=0;
		//Iniciar Scanner
		Scanner sc=new Scanner(System.in);
		do{
			contador++;
			System.out.print("Introduce una nota: ");			
			nota=sc.nextInt();
			if(nota<=10 & nota>=0){
			if(nota>=5 && nota<=10){
				contador++;
				System.out.print("El numero de aprobados son: "+contador);
			}
			if(nota<=4 && nota>=0){
				contador++;
				System.out.print("El numero de suspensos son: "+contador);
			}}
			
			
			
			
		}while(nota>=0);
		

	}

}
