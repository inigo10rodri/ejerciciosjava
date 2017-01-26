
public class Alumno extends Persona {
	
	public Alumno(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}
	private double nota;
	public Alumno(String nombre,double nota){
		super(nombre);
		this.nota=nota;
	}
	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+", Nota: "+nota;
	}

}
