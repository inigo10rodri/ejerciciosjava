import java.util.Scanner;
public class Ejercicio9 {
//Pedir un n�mero de cuatro cifras y decir si es capic�a.
	public static void main(String[] args) {
		/*Adem�s del n�mero necesitamos otras variables, 
		 numero Invertido que almacenar� el n�mero dado la vuelta, resto, 
		 donde dejaremos los restos de las divisiones y falta, que es la variable
		 con los n�meros que faltan para dar la vuelta.*/
		int numero, falta, numInvertido, resto;
		//iniciar el scanner
		Scanner sc=new Scanner(System.in);
		//Pedimos un numero al usuario
		System.out.print("Introduce un numero de 4 cifras");
		numero=sc.nextInt();
		//Condicion para que el numero sea de 4 cifras
		if(numero>1000 && numero<9999){
		//Inicializamos las tres variables
		while(numero<=0);{
		  falta=numero;
		  numInvertido=0;
		  resto=0;}
		/*Para obtener el �ltimo d�gito del n�mero lo haremos
		con el resto de una divisi�n entre diez.*/
		//4224%10 = 4
		resto=falta%10;
		/*Del n�mero original hay que quitarle el �ltimo d�gito.*/
		//4224/10=422
		falta=falta/10;
		/*Habr� que guardar el n�mero substra�do. Para ello simplemente lo sumaremos al n�mero que tengamos, multiplicado por 10.*/
		/*0*10+4=4
		4*10+2=42
		42*10+2=422
		422*10+4=4224*/
		numInvertido=numInvertido*10+resto;
		//mientras el numero sea mayor que 0
		while(falta!=0)
		{
		 resto=falta%10;
		 numInvertido=numInvertido*10+resto;
		 falta=falta/10;
		}
		//Si el numero es igual que el numero invertido sera capicua sino no es capicua
		if(numInvertido==numero){
			 System.out.println("\nEl numero es capicua\n");}
		else{
			 System.out.println("\nEl numero no es capicua\n");}
		//El numero debe estar entre 1000 y 9999							}
		else {
			System.out.print("El numero debe estar entre 1000 y 9999");
		}
	}

}
