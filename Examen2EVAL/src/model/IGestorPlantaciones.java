package model;

import java.util.ArrayList;
import java.util.Date;

import datos.Plantacion;

public interface IGestorPlantaciones {
	public void plantar(Plantacion p);
	public void recolectar(int parcela,Date fechaRec,int cantRec);
	public Plantacion getPlantacion(int parcela,Date fechaPlan);
	public ArrayList<Plantacion> getPlantaciones();
	public ArrayList<Plantacion> getPlanRecoger();
	public String[] getParcelas();
	public String[] getEspecies();
}
