package model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class GestorEntrena {
	
	private ArrayList<Entrena> lstEntrenas= new ArrayList<Entrena>();
	private static final String FILENAME = ".\\entrenas.txt";

	public void leerDatos(){
		//metodo que lee del fichero los datos de los entrenamientos
		FileInputStream fin = null;
		ObjectInputStream ois = null;
		try {

			fin = new FileInputStream(FILENAME);
			ois = new ObjectInputStream(fin);
			lstEntrenas = (ArrayList<Entrena>) ois.readObject();
		}catch(FileNotFoundException fnfe){
			//no existe el fichero, porque no se han introducido datos.
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {

			if (fin != null) {
				try {
					fin.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

			if (ois != null) {
				try {
					ois.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}
	}
	public void guardarDatos(){
		//metodo que guarda en un fichero los datos de los entrenamientos
		FileOutputStream fout=null;
		ObjectOutputStream oos=null;
		try {
			fout = new FileOutputStream(FILENAME);
			oos = new ObjectOutputStream(fout);
			oos.writeObject(lstEntrenas);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Fichero no encontrado!");;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Error  de escritura!");;
		}finally {

			if (fout != null) {
				try {
					fout.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

			if (oos != null) {
				try {
					oos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}		
	}
	public void addEntrena(Entrena e){
	//Añadir el entrena
		lstEntrenas.add(e);
		guardarDatos();
	}
	public void delEntrena(int index){
		lstEntrenas.remove(index);
		guardarDatos();
	}
	public void modEntrena(int index,Entrena ent){
		lstEntrenas.set(index,ent);
		guardarDatos();
	}
	public ArrayList<Entrena> getEntrenas(){		
		return lstEntrenas;		
	}
	public double getTotalKm(){
		double totalKms=0;
		for(int i=0;i<lstEntrenas.size();i++){
			Entrena e=lstEntrenas.get(i);
			double kms=e.getKms();
			totalKms=totalKms+kms;
		}
		return totalKms;
		
	}
	public int getTotalMins(){
		int totalMins=0;
		for(int i=0;i<lstEntrenas.size();i++){
			Entrena e=lstEntrenas.get(i);
			int mins=e.getMins();
			totalMins=totalMins+mins;
		}
		return totalMins;
	}


}
