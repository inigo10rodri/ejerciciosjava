package ejercicio5;

import ejercicio4.Cancion;

public class Programa {

	public static void main(String[] args) {
		//Crear primera cancion
		Cancion cancion1=new Cancion("Donde ta mi carro");
		cancion1.setAutor("Manolo");
		cancion1.setEstilo("Ca�i");
		cancion1.setDuracion(180);
		
		//Crear segunda cancion
		Cancion cancion2=new Cancion("Porompompero");
		cancion2.setAutor("Pepe");
		cancion2.setEstilo("Patxanga");
		cancion2.setEstilo("Bachata");
		cancion2.setDuracion(190);
		
		
		//imprimir las canciones
		System.out.println(cancion1);
		System.out.println(cancion2);
		System.out.print("Estilos: "+cancion1.getEstilo()+" "+cancion2.getEstilo());
	}
	

}