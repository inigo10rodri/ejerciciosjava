package Zinemaldia.gui;
import java.util.Scanner;

import Zinemaldia.datos.Pelicula;
public class ProgramaPelicula {

	public static void main(String[] args) {
		//Iniciar scanner
		Scanner sc=new Scanner(System.in);
		//Crear pelicula
		Pelicula pelicula=new Pelicula("Mascotas");
		//Definir las variables para guardar los datos
		String titulo;
		String director;
		int duracion;
		String visto;
		String msg="";
		//Titulo
		System.out.print("Titulo: ");
		titulo=sc.nextLine();
		//Director
		System.out.print("Director: ");
		director=sc.nextLine();
		//Duracion
		System.out.print("Duracion: ");
		duracion=sc.nextInt();
		//Visto
		System.out.print("Visto: ");
		sc.nextLine();
		visto=sc.nextLine();				
		//
		if(visto.toLowerCase().equals("si")){
			pelicula.setVisto(true);}
		else
			{pelicula.setVisto(false);}
		//Asignarle los datos introducidos por los usuarios
				pelicula.setTitulo(titulo);
				pelicula.setDirector(director);
				pelicula.setDuracion(duracion);
		///
			if(pelicula.isVisto()==true){
				msg=" Ha sido vista";
			}
			else { msg=" No ha sido vista";}
		//Leer por pantalla el resultado final
		System.out.println("La pelicula "+pelicula.getTitulo()+" del director "+pelicula.getDirector()+" y tiene una duracion de "+pelicula.getDuracion()+" minutos.");	
		System.out.print("¿La has visto?"+msg);
	}
}
