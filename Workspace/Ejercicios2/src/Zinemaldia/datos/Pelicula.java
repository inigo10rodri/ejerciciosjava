package Zinemaldia.datos;

public class Pelicula {
	//atributos
	private String titulo;
	private String director;
	private int duracion;
	private boolean visto;
	
	//Metodo constructor
	public Pelicula(){
		titulo="";
		duracion=0;
		visto=false;
	}
	public Pelicula(String titulo){
		this.titulo=titulo;}
	public Pelicula(String titulo,String director,int duracion,boolean visto){		
	}
	//metodos getter y setter
	//titulo
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	//Director
	}
	public String getDirector(){
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	//Duracion
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;	
	//Visto
	}
	public void setVisto(boolean visto) {
		this.visto = visto;
	}
	public boolean isVisto(){
		return visto;		
	}
}
