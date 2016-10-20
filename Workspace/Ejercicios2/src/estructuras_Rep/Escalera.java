package estructuras_Rep;
import java.util.Scanner;
public class Escalera {

	public static void main(String[] args) {
	    //variable
		int altura;
		//iniciar scanner
		Scanner sc=new Scanner(System.in);
		System.out.print("Altura: ");
		altura=sc.nextInt();
        for(int i=1;i<=altura;i++) {
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }//main

}//class

