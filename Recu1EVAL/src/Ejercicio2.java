import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		//Iniciar scanner
		Scanner sc=new Scanner(System.in);
		//Variables
		String color;
		String trainera;
		//Pedir color
		System.out.print("Color: ");
		color=sc.nextLine();
		switch(color){
		case "verde":
			trainera="Hondarribi";
			break;
		case "morado":
			trainera="San Pedro";
			break;
		case "amarillo":
			trainera="Orio";
			break;
		case "rosa":
			trainera="San Juan";
			break;
		default: trainera="Esa trainera no esta inscrita";
		}
		System.out.print("Trainera: "+trainera);

	}

}
