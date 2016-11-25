package Ejercicio5;

public class Garaje {
	//atributos
	final int MAX_PLAZAS=100;
	private Vehiculo[] plazas;
	private String nombre;
	private double longitud;
	private double latitud;
	//metodos
	public Garaje(String nombre){
		this.nombre=nombre;
	}
	//introduce el vehiculo en la primera posicion del array
	public void entra(Vehiculo v){
		for(int i=0;i<MAX_PLAZAS;i++){
			if(plazas[i]==null){
				plazas[i]=v;
			}
		}	
	}
	//busca el vehiculo en el array y lo elimina
	public void sale(Vehiculo v){
		for(int i=0;i<MAX_PLAZAS;i++){
			if(plazas[i]==v){
				plazas[i]=null;
			}
		}
	}
	public int getVehiculoPlaza(int numPlaza){
		return MAX_PLAZAS;
		
	}
	public Object getPlazaVehiculo(Vehiculo v){
		return null;
	}
	public int getPlazaLibre(){
		return MAX_PLAZAS;
		
	}
	public int getPlazasLibres(){
		return MAX_PLAZAS;
		
	}
	public int[] getListadoPlazasLibres(){
		return null;
		
	}
}
