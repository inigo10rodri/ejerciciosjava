package estructuras_Rep;
import java.util.Scanner;
//Cada casilla elevado a 2 en 64 casillas que tiene la tabla de ajedrez
public class JuegoAjedrez {

	public static void main(String[] args) {
		//variables
		double numero=1;
		//iniciar scanner
		Scanner sc=new Scanner(System.in);
		System.out.print("Numero:");
		numero=sc.nextDouble();
		//bucle	i es igual al numero, mientras el numero sea mayor o igual que 1 vaya restando de uno en uno	
		for(double i=1;i<=64;i++){
			double resultado=(double)Math.pow(numero,  i);
			System.out.println(resultado);}

	}//main

}//class