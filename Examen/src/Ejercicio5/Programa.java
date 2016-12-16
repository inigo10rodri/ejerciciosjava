package Ejercicio5;

public class Programa {

	public static void main(String[] args) {
		String matricula = null;
		String nombre = null;
		//Crear un garaje
		Garaje g=new Garaje("Txofre");
		//Crear un vehiculo
		Vehiculo v=new Vehiculo(matricula);	
		v.setMatricula("SS-2425-AN");
		v.setNumRuedas("4");
		g.entra(v);
		//Crear otro vehiculo
		Vehiculo v1=new Vehiculo(matricula);
		v.setMatricula("SS-2325-AN");
		v.setNumRuedas("4");
		g.entra(v1);
		
			
		

	}

}
