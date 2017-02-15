package model;

import java.util.ArrayList;

public class GestorTareas {
	
	public final int LISTAR_TODAS=0;
	public final int LISTAR_REALIZADAS=1;
	public final int LISTAR_NO_REALIZADAS=2;
	
	private ArrayList<Tarea> lstTareas=new ArrayList<Tarea>();
	
	public void addTarea(Tarea t){
		lstTareas.add(t);
		
	}
	public void finTarea(String titulo){
		Tarea tarea;
		for(int i=0;i<lstTareas.size();i++){
			tarea =lstTareas.get(i);//recorre todos los elementos del arraylist
			if(tarea.toString().toUpperCase().equals(titulo.toUpperCase())){
				tarea.finalizar();
			}
		}
	}
	public int getTareasSinHacer(){
		for(int i=0;i<lstTareas.size();i++){
			Tarea t=lstTareas.get(i);
			if(t.isHecho()==false){
				lstTareas.add(t);
			}else{
				t.isHecho();
			}
		}
		return LISTAR_NO_REALIZADAS;
	}
	public Tarea[] getTareas(int tipo){
		
		if(tipo==LISTAR_TODAS){
			return lstTareas.toArray(new Tarea[0]);
		}else{
			ArrayList<Tarea> lstAux=new ArrayList<Tarea>();
			for(Tarea t:lstTareas){    //<==  for(int=0;i<lstTareas.size();i++){Tarea t=lstTareas.get(i);}
				if((tipo==LISTAR_REALIZADAS && t.isHecho()) ||(tipo==LISTAR_NO_REALIZADAS && !t.isHecho())){
					lstAux.add(t);
				}
			}
			return lstAux.toArray(new Tarea[0]);
		}	
	}
}
