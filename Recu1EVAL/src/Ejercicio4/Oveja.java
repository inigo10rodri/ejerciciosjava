package Ejercicio4;

public class Oveja{
	//Variables
	private String nombre;
	private long crotal;
	private double litros;
	private Oveja padre;
	private Oveja madre;
	//Constructoras
	public Oveja(){
		
	}
	public Oveja(long crotal){
		this.crotal=crotal;
	}
	public Oveja(Oveja o){
		
	}
	//Metodos getter y setter
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public long getCrotal() {
		return crotal;
	}
	public void setCrotal(long crotal) {
		this.crotal = crotal;
	}
	public double getLitros() {
		return litros;
	}
	public void setLitros(double litros) {
		this.litros = litros;
	}
	public Oveja getPadre() {
		return padre;
	}
	public void setPadre(Oveja padre) {
		this.padre = padre;
	}
	public Oveja getMadre() {
		return madre;
	}
	public void setMadre(Oveja madre) {
		this.madre = madre;
	}
	//Metodo toString
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nombre: "+nombre+" Crotal: "+crotal;
	}
	//Metodo equals
	public boolean equals(Oveja o){
		if(this.crotal==(o.crotal)){
			return true;
		}else{
			return false;
		}		
	}	
}
