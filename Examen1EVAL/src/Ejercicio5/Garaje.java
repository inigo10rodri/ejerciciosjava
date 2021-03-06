package Ejercicio5;

public class Garaje {
	//atributos
	private final int MAX_PLAZAS=100;
	private Vehiculo[] plazas=new Vehiculo[MAX_PLAZAS];
	private String nombre;
	private double longitud;
	private double latitud;
	private int numPlazasOcupadas=0;
	//metodo constructor
	public Garaje(String nombre){
		this.nombre=nombre;
	}
	//introduce el vehiculo en la primera posicion del array
	public void entra(Vehiculo v){
		for(int i=0;i<MAX_PLAZAS;i++){
			if(plazas[i]==null){
				plazas[i]=v;
				return;//te saca de la funcion entera y si pones break te saca del for.
			}
		}	
	}
	//busca el vehiculo en el array y lo elimina
	public void sale(Vehiculo v){
		for(int i=0;i<MAX_PLAZAS;i++){
			if(plazas[i]!=null){
				if(plazas[i].equals(v)){
					plazas[i]=null;
					return;//te saca de la funcion entera y si pones break te saca del for.
				}//if
			}//if
		}//for
	}
	//devuelve el vehiculo que se encuentre en dicha plaza
	public Vehiculo getVehiculoPlaza(int numPlaza){
		return plazas[numPlaza];
		
	}
	//devuelve la plaza en la que se encuentra el vehiculo
	public int getPlazaVehiculo(Vehiculo v){
		for(int i=0;i<MAX_PLAZAS;i++){
			if(plazas[i]!=null){
				if(plazas[i].equals(v)){
					return i;
				}//if
			}//if
		}//for
		return -1;
	}
	public int getPlazaLibre(){
		return MAX_PLAZAS;
		
	}
	public int getPlazasLibres(){
		return (MAX_PLAZAS-numPlazasOcupadas);		
	}
	public int[] getListadoPlazasLibres(){
		//creamos un arra donde introducir las plazas libres
		int[] lista=new int[getPlazasLibres()];
		//contador para saber donde meter el indice de la plaza libre
		int contLista=0;
		//Recoorre todas las plazas del garaje
		for(int i=0;i<MAX_PLAZAS;i++){
			//Si la plaza del garaje contiene null 
			if(plazas[i]==null){
				//Va a guardar el indice de la plaza libre
				lista[contLista]=i;
				//Incrementa el contador
				contLista++;
			}//if
		}//for
		//Devuelve un array lista con el numero de plazas libres
		return lista;
		
	}
}
