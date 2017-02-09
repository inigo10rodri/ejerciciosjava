package model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class GestorAlumnos {
	private static final String FICHERO_LISTADO=".\\listado.ser";
	private ArrayList<Alumno> lstAlumnos=new ArrayList<Alumno>();
	
	public GestorAlumnos(){
		leerListado();
	}
	public void leerListado(){

		//metodo que lee del fichero los datos de los alumnos
			FileInputStream fin = null;
			ObjectInputStream ois = null;
			try {

				fin = new FileInputStream(FICHERO_LISTADO);
				ois = new ObjectInputStream(fin);
				lstAlumnos = (ArrayList<Alumno>) ois.readObject();
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
	public void guardarListado(){
		//metodo que guarda en un fichero los datos de los alumnos
			FileOutputStream fout=null;
			ObjectOutputStream oos=null;
			try {
				fout = new FileOutputStream(FICHERO_LISTADO);
				oos = new ObjectOutputStream(fout);
				oos.writeObject(lstAlumnos);
				
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
	public void addAlumno(Alumno a){
		lstAlumnos.add(a);		
	}
	//eliminar el alumno en el indice que le pasamos
	public void delAlumno(int index){
		lstAlumnos.remove(index);
	}	
	public void delAlumno(Alumno al){
		lstAlumnos.remove(al);
	}
	//modificar el alumno
	public void modAlumno(int index,Alumno al){
		lstAlumnos.set(index,al);
	}
	//devuelve el numero de alumnos que hay
	public int getSize(){
		return lstAlumnos.size();
	}
	//Devuelve el primer alumno que tenga el string que le pasamos
	Alumno getAlumno(String nombre){
		for(int i=0;i<lstAlumnos.size();i++){
			Alumno a=lstAlumnos.get(i);
			if(a.getNombre().toUpperCase().equals(nombre.toUpperCase())){
				return a;
			}
		}
		return null;		
	}
	//Devuelve el objeto de esa posicion
	Alumno getAlumno(int index){
		return lstAlumnos.get(index);		
	}
}

