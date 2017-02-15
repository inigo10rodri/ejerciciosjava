package model;

public class Tarea {
	
	private String titulo;
	private boolean hecho;
	public Tarea(){
		
	}
	public Tarea(String titulo){
		this.titulo=titulo;
	}
	//getter and setter
	public boolean isHecho() {
		return hecho;
	}
	public void finalizar(){
		hecho=true;
	}
	@Override
	public String toString() {
		return titulo;
	}
	

}
