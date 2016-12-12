package Ejercicio5;

public class Vehiculo {
	//atributos
	private String matricula;
	private int numRuedas;
	private boolean socio;
	//Metodo constructor
	public Vehiculo( String matricula){
		this.matricula=matricula;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public int getNumRuedas() {
		return numRuedas;
	}
	public void setNumRuedas(int numRuedas) {
		this.numRuedas = numRuedas;
	}
	public boolean isSocio() {
		return socio;
	}
	public void setSocio(boolean socio) {
		this.socio = socio;
	}
	public boolean equals(Vehiculo v){
		//dos vehiculos son iguales si tienen la misma matricula
		if(this.matricula.equals(v.matricula)){
			return true;
		}else{
		return false;
		}//else	
		
	}//boolean equals
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return matricula;
	}
	public void setNumRuedas(String string) {
		// TODO Auto-generated method stub
		
	}
}
