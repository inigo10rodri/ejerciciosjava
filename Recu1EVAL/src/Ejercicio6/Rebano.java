package Ejercicio6;

import Ejercicio4.Oveja;

public class Rebano {
	//Atributos
	private final int MAX_OVEJAS=100;
	private Oveja[] ovejas=new Oveja[MAX_OVEJAS];
	private String pastor;
	private String raza;
	private int cantOvejas;
	//metodos
	public Rebano(){
		
	}
	//añade la i¡oveja al rebaño
	public void addOveja(Oveja o){
		for(int i=0;i<MAX_OVEJAS;i++){
			if(ovejas[i]==null){
				ovejas[i]=o;
				return;
			}
		}	
	}
	//elimina la oveja del rebaño
	public void delOveja(Oveja o){
		for(int i=0;i<MAX_OVEJAS;i++){
			if(ovejas[i]!=null){
				if(ovejas[i].equals(o)){
					ovejas[i]=null;
					return;
				}//if
			}//if
		}//for
	}
	//devuelve la oveja que mas litros da del rebaño
	public Oveja getMejorOveja(){
		
		return null ;
		
	}
	public String getPastor() {
		return pastor;
	}
	public void setPastor(String pastor) {
		this.pastor = pastor;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public int getCantOvejas() {
		return cantOvejas;
	}
	public void setCantOvejas(int cantOvejas) {
		this.cantOvejas = cantOvejas;
	}
	
	
}
