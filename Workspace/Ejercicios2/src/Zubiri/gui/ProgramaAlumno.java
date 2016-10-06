package Zubiri.gui;
import java.util.Scanner;

import Zubiri.model.Alumno;
public class ProgramaAlumno {

	public static void main(String[] args) {
		//iniciar scanner
		Scanner sc= new Scanner(System.in);
		//Crear alumno
		Alumno alum1=new Alumno();
		//Pedir nombre del alumno
		System.out.print("Alumno: ");
		String nomAlum=sc.nextLine();
		//Leer nombre
		alum1.setNombre(nomAlum);
		//Pedir aginatura al alumno
		System.out.print("Asignatura: ");
		String asigAlum=sc.nextLine();
		//Leer la asignatura 
		alum1.setAsignatura(asigAlum);
		//Pedir nota del alumno
		System.out.print("Nota: ");
		double notaAlum=sc.nextDouble();
		//Leer la nota
		alum1.setNota(notaAlum);
		//Leer por pantalla el resultado final
		System.out.println(alum1.getNombre()+" en "+alum1.getAsignatura()+" tienes un "+alum1.getCalificacion());
			}//main

}//class
