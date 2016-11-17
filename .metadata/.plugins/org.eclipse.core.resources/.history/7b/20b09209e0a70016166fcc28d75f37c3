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
	public void addAsig(Asignatura asig){//añadir la asignatura	
		if(contAsig<MAX_ASIG){
		asignaturas[contAsig]=asig;
		contAsig++;
		}else{
			System.out.println("No se puede matricular");
		}
	}//addAsig
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String lista=nomAlum+"[";
		for(int i=0;i<contAsig;i++){
			lista=lista+asignaturas[i]+",";
		}
		lista=lista+"]";
		return lista;
	}
	
	
}//class
