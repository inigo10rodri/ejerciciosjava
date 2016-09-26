import java.util.Scanner;
public class Tienda {

	public static void main(String[] args) {
		//Definicion de las constantes
		//producto de la semana para aplicar el descuento
		final String PROD_SEMANA= "Manzana";
		//descuento a aplicar por producto de la semana
		final double DTO_PROD_SEM=5;
		//Volumen minimo para aplicar descuento
		final double VOL_MIN_DTO=100;
		//descuento a aplicar por volumen de compra
		final double DTO_VOLUMEN=10;
		//Definir las variables
		String producto;
		double precio;
		double cantidad;
		double precioTotal;
		double descuento;		
		//Definir el scanner para leer por consola
		Scanner sc=new Scanner(System.in);
		//Pedir producto
		System.out.print("Producto: ");
		//Leer producto
		producto=sc.nextLine();	
		//Pedir cantidad
		System.out.print("Cantidad: ");
		//leer cantidad
		cantidad=sc.nextDouble();
		//Pedir precio
		System.out.print("Precio: ");
		//Leer precio
		precio=sc.nextDouble();
		//definir una var para calcular el precio total
		precioTotal=precio*cantidad;
		//si el precio total es mayor que el volumen aplicar descuento
		if (precioTotal> VOL_MIN_DTO){
			descuento=precioTotal*DTO_VOLUMEN/VOL_MIN_DTO;
			precioTotal=precioTotal-descuento;
		}
		//Si es el producto de la semana aplicar descuento
		if (producto.equals(PROD_SEMANA)){
			
			descuento=precioTotal*DTO_PROD_SEM/ VOL_MIN_DTO;
			precioTotal=precioTotal-descuento;}
		//escribe tu compra por consola		
		System.out.print("Has comprado "+cantidad +" kg de " +producto +", "+ String.format("%.2f",precioTotal)+" � a pagar! ");
		
		
	}
}