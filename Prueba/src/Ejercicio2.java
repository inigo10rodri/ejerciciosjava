import java.util.Scanner;
public class Ejercicio2 {
//Pide al usuario el dia de la semana(numerico) y muestrale en texto el dia de la semana.
	public static void main(String[] args) {
		//Variables
		int numDia;
		String diaSemana="";
		//Iniciar scanner
		Scanner sc=new Scanner(System.in);
		//Pedir dia semana
		System.out.print("Introducir dia (Entre 1 y 7): ");
		//Leer dia semana
		numDia=sc.nextInt();
		//Ponemos la condicion que debe estar entre el 1 y el 7 porque la semana tiene 7 dias
		if(numDia<=7 && numDia>=1){
		//Creamos un switch para que en los siguientes casos se vea el dia de la semana
			switch(numDia){
				case 1: diaSemana="lunes";
				break;
				case 2: diaSemana="martes";
				break;
				case 3: diaSemana="miercoles";
				break;
				case 4: diaSemana="jueves";
				break;
				case 5: diaSemana="viernes";
				break;
				case 6: diaSemana="sábado";
				break;
				case 7: diaSemana="domingo";
				break;		
			}//switch
		//Muestra por pantalla el dia de la semana
		System.out.print("Hoy es "+diaSemana);
		//Sino que diga que el dia introducido no existe
		}else{
			//Nos dice que no existe ese dia de la semana ya que debe estar entre 1 y 7
		 	System.out.print("El dia introducido no existe!");
		}//else
		

	}//main

}//class
