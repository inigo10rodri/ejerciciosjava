package gestionNotas.model;

public class Asignatura {
	//ATRIBUTOS
	private String nombre;
	private double nota;
	//METODOS
	//Metodo constructor
	public Asignatura(String nombre){
		this.nombre=nombre;
	}//asignatura
	//Metodos getter y setter
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
}//class
