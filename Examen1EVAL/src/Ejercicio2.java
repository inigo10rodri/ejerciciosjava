import java.util.Scanner;
public class Ejercicio2 {

	public static void main(String[] args) {
		//variables
		String codAsignatura;
		String asignatura="";
		//Iniciar scanner
		Scanner sc=new Scanner(System.in);
		//Pedir codigo de una asignatura
		System.out.print("Codigo: ");
		//Leer codigo de la asignatura
		codAsignatura=sc.nextLine();
			//Para que cuando el codAsignatura coincida con PR,BD,LM,SI,ED muestre lo indicado en asignatura
			switch(codAsignatura){
				case "PR": asignatura="PROGRAMACION";
				break;
				case "ED": asignatura="ENTORNOS DE DESARROLLO";
				break;
				case "BD": asignatura="BASES DE DATOS";
				break;
				case "LM": asignatura="LENGUAJES DE MARCAS";
				break;
				case "SI": asignatura="SISTEMAS INFORMATICOS";
				break;
				default: System.out.print("LA ASIGNATURA NO EXISTE!!");
			}//switch
			//Mostrar resultado por pantalla
			System.out.print(asignatura);
	}//main

}//class