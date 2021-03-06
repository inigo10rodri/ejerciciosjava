package model;

import java.io.Serializable;

public class Alumno extends Persona implements Comparable,Serializable{
	
	public Alumno(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}
	private double nota;
	public Alumno(String nombre,double nota){
		super(nombre);
		this.nota=nota;
	}
	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+", Nota: "+nota;
	}
	@Override
	public int compareTo(Object obj) {
		Alumno alu=(Alumno)obj;
		return ((int)(this.nota*100-alu.nota*100));
	}
	@Override
	public boolean equals(Object obj) {
		//si tienen el mismo nombre y nota es el mismo alumno
		if(obj instanceof Alumno){
			Alumno al=(Alumno) obj;
			if(nota==al.nota && nombre.equals(al.nombre)){
				return true;
			}
		}				
		return false;
	}
	
}
