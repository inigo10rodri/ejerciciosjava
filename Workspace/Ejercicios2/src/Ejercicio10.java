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
		//Leer la nota y el texto
		notaAlum=sc.nextInt();
		notaTxt=sc.nextLine();
		//Si la nota esta entre 0 y 10
		if (notaAlum>=0 && notaAlum<=10){
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
			
						}//switch
		System.out.print("Has sacado un "+ notaTxt);
		
										}//if
		//Sino esta entre 0 y 10
		else{
		//Leer el resultado
		System.out.print("Introduce una nota valida, es decir, entre 0 y 10. ");

			}
	}
} 