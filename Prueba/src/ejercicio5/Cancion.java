package ejercicio5;


public class Cancion {
	//Atributos
	private static final int MAX_ESTILOS=5;
	private String titulo;
	private String autor;
	private String[] estilos=new String[MAX_ESTILOS];
	private double duracion;
	private boolean escuchada;
	private int contEstilos=0;
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
	//Devolver estilos separados por un espacio
	public String getEstilos(){		
			//variable sbEstilos para concatenar los estilos
		StringBuilder sbEstilos=new StringBuilder("");
		for(int i=0;i<contEstilos;i++){
			sbEstilos.append(estilos[i]);
			sbEstilos.append(" ");//a�adimos estilo separado por espacio
		}
		return sbEstilos.toString().trim();
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
	public void addEstilo(String estilo){//a�adir el estilo	
		if(contEstilos<MAX_ESTILOS){
			estilos[contEstilos]=estilo;
			contEstilos++;
		}else{
			System.out.println("No se admiten mas estilos");
		}
	}//addEstilo	
	
}//class
