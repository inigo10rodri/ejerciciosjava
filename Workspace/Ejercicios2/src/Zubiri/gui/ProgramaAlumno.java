package Zubiri.gui;
import java.util.Scanner;

import Zubiri.model.Alumno;
public class ProgramaAlumno {

	public static void main(String[] args) {
		//iniciar scanner
		Scanner sc= new Scanner(System.in);
		//Crear alumno
		Alumno alum1=new Alumno();
		//Definir las variables para guardar los datos
		String nombre;
		String asignatura;
		double nota;		
		//Pedir nombre del alumno
		System.out.print("Alumno: ");
		//Leer nombre
		nombre=sc.nextLine();		
		//Pedir aginatura al alumno
		System.out.print("Asignatura: ");
		//Leer la asignatura 
		asignatura=sc.nextLine();		
		//Pedir nota del alumno
		System.out.print("Nota: ");
		//Leer la nota
		nota=sc.nextDouble();
		//Asignarle los datos introducidos por usuario
		alum1.setNombre(nombre);
		alum1.setAsignatura(asignatura);
		alum1.setNota(nota);
		//Mostrar por pantalla el resultado final
		System.out.println(alum1.getNombre()+" has "+alum1.getCalificacion()+" "+alum1.getAsignatura());
			}//main

}//class
