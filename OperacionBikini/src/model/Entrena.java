package model;

import java.util.Date;

public class Entrena {
	private double kms;
	private int mins;
	private String lugar;
	private Date fecha;
	public Entrena(){
		 
	}
	public double getKms() {
		return kms;
	}
	public void setKms(double kms) {
		this.kms = kms;
	}
	public int getMins() {
		return mins;
	}
	public void setMins(int mins) {
		this.mins = mins;
	}
	public String getLugar() {
		return lugar;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return fecha+lugar+kms;
	}
	@Override
	public boolean equals(Object obj) {
		//si tienen la misma fecha y lugar es el mismo entrena
			if(obj instanceof Entrena){
				Entrena ent=(Entrena) obj;
				if(fecha==ent.fecha && lugar.equals(ent.lugar)){
					return true;
				}
			}				
			return false;
	}
		
	
}
