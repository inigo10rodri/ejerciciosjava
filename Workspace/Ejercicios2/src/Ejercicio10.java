import java.util.Scanner;
public class Ejercicio10 {
//Pedir una nota de 0 a 10 y mostrarla de la forma: Insuficiente, Suficiente, Bien...
	public static void main(String[] args) {
		//Definir las variables
		int notaAlum;
		String notaTxt;
		//iniciar scanner
		Scanner sc=new Scanner(System.in);
		//Pedir nota del alumno 
		System.out.print("Introduce la nota del alumno: ");
		//Leer la nota
		notaAlum=sc.nextInt();
		switch(notaAlum){
		case 0:
		case 1:
		case 2:
			notaTxt=("Muy deficiente");
			break;
		case 3:
		case 4:
			notaTxt=("Insuficiente");
			break;
		case 5:
			notaTxt=("Suficiente");
			break;
		case 6:
			notaTxt=("Bien");
			break;
		case 7:
			notaTxt=("Notable");
			break;
		case 8:
			notaTxt=("Notable alto");
			break;
		case 9:
			notaTxt=("Sobresaliente");
			break;
		case 10:
			notaTxt=("Matricula de honor");
			break;
		default:
			notaTxt=("ERROR! La nota tiene que ser de 0 a 10");
			
						}//switch
		System.out.print("Has sacado un "+ notaTxt);

	}

}
