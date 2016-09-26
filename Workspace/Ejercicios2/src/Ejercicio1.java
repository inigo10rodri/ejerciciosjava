import java.util.Scanner;
//Pedir el radio de un círculo y calcular su área. A=PI*r^2
public class Ejercicio1 {

	public static void main(String[] args) {
		//Definir las variables
		double area;
		double radio;
		//Iniciar scanner
		Scanner sc= new Scanner(System.in);
		//Pedir el radio de un circulo
		System.out.print("Radio circulo en centimetros: ");
		//Leer el radio
		radio=sc.nextDouble();
		//Calcular el area del circulo
		area=(Math.PI)*radio*radio; 
		System.out.print("El area es: "+area);

	}

}
