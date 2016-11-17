package ejercicio5;


public class Cancion {
	//Atributos
	private static final int MAX_ESTILOS=4;
	private String titulo;
	private String autor;
	private String[] estilos=new String[MAX_ESTILOS];
	private double duracion;
	private boolean escuchada;
	private int contEstilo=0;
	//Metodo constructor
	public Cancion(String titulo){
		this.titulo=titulo;}
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
		return autor+" - "+titulo;
	}
	public void addEstilo(String estilo){//a�adir la asignatura	
		if(contEstilo<MAX_ESTILOS){
		estilos[contEstilo]=estilo;
		contEstilo++;
		}else{
			System.out.println("No se admiten mas estilos");
		}
	}//addAsig
}//class
