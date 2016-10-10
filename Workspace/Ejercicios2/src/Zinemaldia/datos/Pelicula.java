package Zinemaldia.datos;

public class Pelicula {
	//atributos
	private String titulo;
	private String director;
	private int duracion;
	private boolean visto;
	//Metodo constructor
		public Pelicula(String titulo){
			this.titulo=titulo;
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
	public String getDirector() {
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
	public boolean isVisto() {
		return visto;
	}
	public void setVisto(boolean visto) {
		this.visto = visto;
	}
	
	
}
