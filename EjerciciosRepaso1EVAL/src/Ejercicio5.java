import java.util.Scanner;

/*Realizar un programa que pregunte al usuario el momento del d�a con una letra 
(m-ma�ana, t-tarde, n-noche), el sexo con otra letra (m-masculino, f-femenino). El
programa dir�: buenos d�as, tardes, o noches (seg�n el momento) se�or o se�ora
seg�n el sexo.*/
public class Ejercicio5 {

	public static void main(String[] args) {
		//Variables
		String momentodelDia;
		String sexo;
		String txtMomento = "";
		String txtSexo="";
		//Iniciar scanner
		Scanner sc=new Scanner(System.in);
		//Pedir momento del  dia
		System.out.println("Introduce el momento del dia:\n ->m-ma�ana\n ->t-tarde\n ->n-noche ");
		momentodelDia=sc.nextLine();
		//Pedir sexo
		System.out.println("Introduce tu sexo:\n ->f-femenino\n ->m-masculino ");
		sexo=sc.nextLine();
		switch(momentodelDia){
		case "m":
			txtMomento="ma�ana";
			if(sexo.equals("m")){
				System.out.print("Buenos dias se�or!");
			}else{
				System.out.print("Buenos dias se�ora!");
			}
			break;
		case "t":
			txtMomento="tarde";
			if(sexo.equals("m")){
				System.out.print("Buenas tardes se�or!");
			}else{
				System.out.print("Buenas tardes se�ora!");
			}
			break;
		case "n":
			txtMomento="noche";
			if(sexo.equals("m")){
				System.out.print("Buenas noches se�or!");
			}else{
				System.out.print("Buenas noches se�ora!");
			}
			break;
		}
	}

}
