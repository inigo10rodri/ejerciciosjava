import java.util.Scanner;
public class Ejercicio3 {

	public static void main(String[] args) {
		//Iniciar scanner
		Scanner sc=new Scanner(System.in);
		//variables
		double nota;
		double suma=0;
		int cont=0;
		double notaMedia=0;
		do{
			//Introduce una nota
			System.out.print("Introducir nota(negativa para terminar): ");
			//Leer nota
			nota=sc.nextDouble();
			if(nota>10){
				System.out.println("Introduce un numero entre 0 y 10");
			}//if
			else if (nota>=0 && nota<=10){
				cont++;
				suma=nota+suma;	
				notaMedia=suma/cont;
			}
			else if(notaMedia>=5 && notaMedia<6){
				System.out.print("Tienes un SUFICIENTE ("+notaMedia+")");
			}
			else if(notaMedia>=6 && notaMedia<7){
				System.out.print("Tienes un BIEN ("+notaMedia+")");
			}
			else if(notaMedia>=7 && notaMedia<=8){
				System.out.print("Tienes un NOTABLE ("+notaMedia+")");
			}
			else if(notaMedia>=9 && notaMedia<=10){
				System.out.print("Tienes un SOBRESALIENTE ("+notaMedia+")");
			}
			else if(notaMedia<5){
				System.out.print("Tienes un INSUFICIENTE ("+notaMedia+")");
			}
			else{
				System.out.print("ERROR!");
			}
		}while(nota>=0);		
	}//main
}//class


