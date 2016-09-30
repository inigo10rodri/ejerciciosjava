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
			notaTxt=("muy deficiente");
			break;
		case 3:
		case 4:
			notaTxt=("insuficiente");
			break;
		case 5:
			notaTxt=("suficiente");
			break;
		case 6:
			notaTxt=("bien");
			break;
		case 7:
			notaTxt=("notable");
			break;
		case 8:
			notaTxt=("notable alto");
			break;
		case 9:
			notaTxt=("sobresaliente");
			break;
		case 10:
			notaTxt=("matricula de honor");
			break;
		default:
			notaTxt=(" nota que no es valida porque debe estar entre 0 y 10!");
			
						}//switch
		//Leer el resultado
		System.out.print("Has sacado un/una "+ notaTxt);

	}

} 
