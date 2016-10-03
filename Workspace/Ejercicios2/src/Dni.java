import java.util.Scanner;
public class Dni {
//Introducir numero del DNI y decir que letra tienes
	public static void main(String[] args) {
		//Definir las variables que vamos a utilizar
		String letra;
		int numeroDni;
		int resto;
		//iniciamos scanner
		Scanner sc=new Scanner(System.in);
		//Pedimos el numero del DNI al usuario
		System.out.print("Introduce el numero del DNI: ");
		//Leemos el numero del DNI y la letra
		numeroDni=sc.nextInt();
		letra=sc.nextLine();
		//Hacemos la operacion de dividir el numero entre 23 para saber el resto
		resto=numeroDni%23;	
		//Si el resto esta entre 0 y 22 tendra una de estas letras
		if(resto>=0 && resto<=22){
		//En los diferentes casos tendra una letra 
		switch(resto){
		case 0:
			letra=("T");
			break;
		case 1:
			letra=("R");
			break;
		case 2:
			letra=("W");
			break;
		case 3:
			letra=("A");
			break;
		case 4:
			letra=("G");
			break;
		case 5:
			letra=("M");
			break;
		case 6:
			letra=("Y");
			break;
		case 7:
			letra=("F");
			break;
		case 8:
			letra=("P");
			break;
		case 9:
			letra=("D");
			break;
		case 10:
			letra=("X");
			break;
		case 11:
			letra=("B");
			break;
		case 12:
			letra=("N");
			break;
		case 13:
			letra=("J");
			break;
		case 14:
			letra=("Z");
			break;
		case 15:
			letra=("S");
			break;
		case 16:
			letra=("Q");
			break;
		case 17:
			letra=("V");
			break;
		case 18:
			letra=("H");
			break;
		case 19:
			letra=("L");
			break;
		case 20:
			letra=("C");
			break;
		case 21:
			letra=("K");
			break;
		case 22:
			letra=("E");
			break;
		}//switch
		//Leemos por pantalla la letra de tu DNI
		System.out.print("Tu letra del DNI es: "+ letra);
		}//if
		else {
			System.out.print("Ese numero de DNI no existe");	
			 }//else		
	}//main

}//class
