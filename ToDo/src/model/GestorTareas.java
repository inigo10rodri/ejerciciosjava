package model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class GestorTareas {
	
	public final static int LISTAR_TODAS=0;
	public final static int LISTAR_REALIZADAS=1;
	public final static int LISTAR_NO_REALIZADAS=2;
	
	private ArrayList<Tarea> lstTareas=new ArrayList<Tarea>();
	private static final String FILENAME = ".\\tareas.txt";
	public void leerTareas(){
		BufferedReader br = null;
		FileReader fr = null;

		try {
			fr = new FileReader(FILENAME);
			br = new BufferedReader(fr);
			String linea;
			br = new BufferedReader(new FileReader(FILENAME));
			while ((linea = br.readLine()) != null) {
				//trozear la linea
				linea.split("");
			}

		} catch (IOException e) {

			e.printStackTrace();

		} finally {

			try {

				if (br != null)
					br.close();

				if (fr != null)
					fr.close();

			} catch (IOException ex) {

				ex.printStackTrace();

			}

		}
	}
	public void guardarTareas(){
		BufferedWriter bw = null;
		FileWriter fw = null;

		try {

			fw = new FileWriter(FILENAME);
			bw = new BufferedWriter(fw);
			//Recorremos el array de las tareas
			for(Tarea t:lstTareas){
				bw.write(t.toString()+", "+t.isHecho()+"\r\n");
			}
					

			System.out.println("");

		} catch (IOException e) {

			e.printStackTrace();

		} finally {
			try {
				if (bw != null)
					bw.close();
				if (fw != null)
					fw.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}
	
	public void addTarea(Tarea t){
		lstTareas.add(t);
		guardarTareas();
	}
	public void finTarea(String titulo){
		Tarea tarea;
		for(int i=0;i<lstTareas.size();i++){
			tarea =lstTareas.get(i);//recorre todos los elementos del arraylist
			if(tarea.toString().toUpperCase().equals(titulo.toUpperCase())){
				tarea.finalizar();
			}
		}
		guardarTareas();
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
