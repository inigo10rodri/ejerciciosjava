package ejercicioswhile;
import java.util.Scanner;
import java.time.LocalTime;
import java.time.LocalDate;
public class EjercicioMenu {

	public static void main(String[] args) {
		//Variable para guardar la opcion seleccionada
		int opcionSel=0;
		//Para mostrar la hora 
		LocalTime hora=LocalTime.now();
		//Para mostrar la fecha
		LocalDate fecha=LocalDate.now();
		//Iniciar scanner
		Scanner sc=new Scanner(System.in);
		//Mostrar menu
		System.out.print("**Menu**\n1.Saludo:\n2.Hora:\n3.Fecha:\n4.Salir:\n");
		do{
			//Leer opcion seleccionada
			opcionSel=sc.nextInt();
			//ejecutar la opcion seleccionada
			switch(opcionSel){
			case 1: //mostrar saludo
				System.out.println("Bienvenido a nuestro restaurante!");
				break;
			case 2://mostrar la hora
				System.out.println("La hora es: "+hora);				
				break;
			case 3://mostrar la fecha				
				System.out.println("La fecha es: "+fecha);
				break;
			case 4: //salir
				System.out.print("Saliendo del sistema...\n");
				break;
			default: System.out.println("Introduce un numero correcto!");
			
			}
		}/*do*/ /*Cuando el usuario introduce 4 salimos*/while(opcionSel!=4);		
		System.out.print("Ha salido correctamente");
	}//main

}//class
