package Ejercicio5;

public class Programa {

	public static void main(String[] args) {
		String matricula = null;
		String nombre = null;
		//Crear un garaje
		Vehiculo v=new Vehiculo(matricula);	
		v.setMatricula("SS-2425-AN");
		v.setNumRuedas("4");
		//Crear un vehiculo
		Garaje g=new Garaje(nombre);
		g.sale(v);
		g.entra(v);

	}

}