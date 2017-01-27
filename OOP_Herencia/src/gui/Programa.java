package gui;
import java.util.Arrays;

import model.Alquilable;
import model.Alumno;
import model.Persona;
import model.Profesor;

public class Programa {

	public static void main(String[] args) {
		//crear un array con 10 alumnos, nombre y nota
		Alumno[] listado =new Alumno[10];
		listado[0]=new Alumno("Juan",2);
		listado[1]=new Alumno("Pedro",6);
		listado[2]=new Alumno("Luis",4);
		listado[3]=new Alumno("Nati",9);
		listado[4]=new Alumno("Paco",7);
		listado[5]=new Alumno("Pepa",8);
		listado[6]=new Alumno("Josune",1);
		listado[7]=new Alumno("Bego",10);
		listado[8]=new Alumno("Maria",6);
		listado[9]=new Alumno("Pablo",3);
		
		//ordenar el array por nota utilizando Arrays.sort()
		Arrays.sort(listado);
		//mostrar el array ordenado por
		for(int i=0;i<listado.length;i++){
			System.out.println(listado[i]);
		}
		System.out.println(listado);
		
		//Creamos un nuevo alumno
			Alumno alum1=new Alumno("Juan",9.0);		
			Alumno al2=alum1;
			System.out.println(alum1);
		
		//Creamos nuevo profesor
		Persona p1=new Persona("Aitor");
		Persona profe1=new Profesor("Igor");
		System.out.println("Persona: "+p1);
		System.out.println("Profesor: "+profe1);
		
		//
		System.out.println(alum1);
		if(profe1 instanceof Profesor){
			Profesor profe2= (Profesor)profe1;
			/*profe2.setPrecioHora(60);
			//No se puede instanciar una interfaz [Alquilable b=new Alquilable();]-> NO SE PUEDE
			Alquilable a=profe2;//->OK
			//Alquilable aluAlqu=new Alumno(); ->NO!!
			Alquilable[] lista=new Alquilable[100];*/
		}
		//pruebas interfaces Alquilable
		

		
		
		
		
		
	}

}
