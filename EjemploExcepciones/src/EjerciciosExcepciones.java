import java.util.Scanner;

/*realizar un programa que pida al usuario dos numeros y un operador (+,-,/,*) y controlar que el
 *usuario escriba valores nuemricos y que si divide entre cero mediante excepciones*/
public class EjerciciosExcepciones {
	//Sino de otra manera se puede poner throws NumbForExcep en el main
	public static void main(String[] args) {
		//iniciar scanner
		Scanner sc=new Scanner(System.in);
		try{
			int num=Integer.parseInt("AB");
		}catch(NumberFormatException e){
			System.out.println("error en formato");
		}finally{
		//atributos
		int a=100;
		double b=0;
		double c=a/b;
		System.out.println(c);
		System.out.println(Double.POSITIVE_INFINITY);
		sc.hasNextDouble();
		}
	}
}
