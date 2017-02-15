import java.util.Scanner;
public class Ejercicio3 {

	public static void main(String[] args) {
		//Iniciar scanner
		Scanner sc=new Scanner(System.in);
		//variables
		double nota =0;
		double notaMenor=10;
		double notaMayor=0;
		int cont=0;
		double suma=0;
		double notaMedia=0;
		String mediaTexto = "";
		for(int i=1;i<=10;i++){
			//Introduce una nota
			System.out.print("Introducir nota "+i+":");
			//Leer nota
			nota=sc.nextDouble();
			 if (nota>=0 && nota<=10){
				suma=nota+suma;
				cont++;
				if(nota>notaMayor){
					notaMayor=nota;
				}//if
				if(nota<notaMenor){
					notaMenor=nota;
				}//if								
			}//if	
		}//for
			notaMedia=suma/cont;
			if(notaMedia>=5 && notaMedia<6){
				mediaTexto = "SUFICIENTE" ;
			}
			else if(notaMedia>=6 && notaMedia<7){
				mediaTexto = "BIEN" ;
			}
			else if(notaMedia>=7 && notaMedia<=8){
				mediaTexto = "NOTABLE" ;
			}
			else if(notaMedia>=9 && notaMedia<=10){
				mediaTexto = "SOBRESALIENTE" ;
			}
			else if(notaMedia<5){
				mediaTexto = "INSUFICIENTE" ;
			}	
		//Mostrar resultados por pantalla
		System.out.println("Mejor nota: "+notaMayor);
		System.out.println("Peor nota: "+notaMenor);
		System.out.println("Nota media: "+mediaTexto+"("+notaMedia+")");
	}//main
}//class