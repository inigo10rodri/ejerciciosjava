import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		//Variables
		int num;
		int cont=0;
		int suma=0;
		int numMayor=0;
		//Iniciar scanner
		Scanner sc=new Scanner(System.in);
		//Pedir numeros enteros al usuario hasta que introduzca 0
		do{
			System.out.print("Numero: ");
			num=sc.nextInt();
			cont++;
			suma=suma+num;
			if(num>numMayor){
				numMayor=num;
			}
		}while(num!=0);
		System.out.print("Cantidad: "+(cont-1)+"\nSuma: "+suma+"\nMayor: "+numMayor);
		
		

	}

}
