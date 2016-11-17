package ejercicio4;

public class Cancion {
	//Atributos
	private String titulo;
	private String autor;
	private String estilo;
	private double duracion;
	private boolean escuchada;
	//Metodo constructor
	public Cancion(String titulo){
		this.titulo=titulo;}
	public Cancion(String titulo, String autor, String estilo,int duracion, boolean escuchada){
	}
	//Metodos
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getEstilo() {
		return estilo;
	}
	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}
	public double getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	public boolean isEscuchada() {
		return escuchada;
	}
	public void setEscuchada(boolean escuchada) {
		this.escuchada = escuchada;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return autor + titulo;
	}
}//class

	


