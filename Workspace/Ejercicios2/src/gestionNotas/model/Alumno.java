package gestionNotas.model;

public class Alumno {
	//ATRIBUTOS
	private static final int MAX_ASIG=10;
	private String nomAlum;
	private Asignatura[] asignaturas=new Asignatura[MAX_ASIG];
	private int contAsig=0;
	
	//METODOS
	//Metodo constructor
	public Alumno(String nomAlum){
		this.nomAlum = nomAlum;
	}
	//Metodos getter y setter
	public String getNomAlum() {
		return nomAlum;
	}
	public void setNomAlum(String nomAlum) {
		this.nomAlum = nomAlum;
	}
	public void addAsig(Asignatura asig){//a�adir la asignatura	
		if(contAsig<MAX_ASIG){
		asignaturas[contAsig]=asig;
		contAsig++;
		}else{
			System.out.println("No se puede matricular");
		}
	}//addAsig
	public void addAsig(String nomAsig, double nota){
		//comprobar si no se puede matricular de mas asignaturas
		if(contAsig<MAX_ASIG){
			//crear una asignatura con los datos de los parametros
			Asignatura asig1=new Asignatura(nomAsig);
			asig1.setNota(nota);
			//a�adir la asignatura creada al array de asignaturas
			asignaturas[contAsig]=asig1;
			//incrementar el numero de asign
			contAsig++;
		}else{
			System.out.println("No se puede matricular");
		}
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String lista=nomAlum+"[";
		for(int i=0;i<contAsig;i++){
			lista=lista+asignaturas[i]+",";
		}//for
		lista=lista+"]";
		return lista;
	}//public String toString
	//Comprueba si el alumno es el mismo
	public boolean equals(Alumno al) {
		// TODO Auto-generated method stub
		if(this.nomAlum.equals(al.nomAlum)){
			return true;
	}else
		return false;	
	}//else
	//devuelve la media del alumno
	public double getMedia(){
		double suma=0;
		double media=0;
		for(int i=0;i<asignaturas.length;i++){		
		suma=suma+asignaturas[i].getNota();			
		}
		media=suma/asignaturas.length;
		return media;
	}
	//Devuelve la asignatura con mejor nota
	public Asignatura getMejorAsignatura(){
		return null;
			
		}
	//Elimina todas las asignaturas
	public void delExpediente(){
	Asignatura asignaturas[]=null;
	}		
	//Devuelve un array de Asignaturas
	public Asignatura[] getAsignaturas(){
		return asignaturas;
		
	}
}//class