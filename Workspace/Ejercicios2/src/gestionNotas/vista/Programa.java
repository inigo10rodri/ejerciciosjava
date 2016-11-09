package gestionNotas.vista;

import java.util.Scanner;

import gestionNotas.model.Alumno;
import gestionNotas.model.Asignatura;

public class Programa {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);		
		String nomAlum;
		String nomAsig;
		double notaAsig;
		//Pedir nombre del alumno
		System.out.print("Nombre: ");
		nomAlum=sc.nextLine();
		//Crear un alumno
		Alumno alu1=new Alumno(nomAlum);
		//mientras no deje vacio el nombre de la asignatura pedir asignaturas
			//Pedir nombre de asignatura
			System.out.print("Nombre asignatura: ");
			nomAsig=sc.nextLine();
				
				while(!nomAsig.equals(""));{			
					//Pedir nota de la asignatura
					System.out.print("Nota asignatura: ");
					notaAsig=sc.nextDouble();
					//crear asignatura
					Asignatura asig=new Asignatura(nomAsig);
					asig.setNota(notaAsig);
					//añadir esa asignatura al alumno
					alu1.addAsig(asig);
				
		}
		//mostrar resultado del expediente Juan[LM:4,Prog:5,BBDD:1]
	}

}
