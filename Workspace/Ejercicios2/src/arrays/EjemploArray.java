package arrays;

public class EjemploArray {
	public static final int MAX_NOTAS=10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//definicion
		int [] notas=new int[MAX_NOTAS];
		//insertar elementos
		notas[0]=5;
		//obtener elementos
		System.out.println(notas[0]);
		//obtener la cantidad de elementos del array
		System.out.println(notas.length);

	}

}
