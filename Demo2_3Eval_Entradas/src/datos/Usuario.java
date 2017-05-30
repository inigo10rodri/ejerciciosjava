package datos;

public class Usuario {
	private String cod;
	private String pass;
	private int contVisitas;
	
	//constructora
	public Usuario(){
		
	}
	
	//getters and setters
	
	public String getCod() {
		return cod;
	}
	public void setCod(String cod) {
		this.cod = cod;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public int getContVisitas() {
		return contVisitas;
	}
	public void incContVisitas(int contVisitas) {
		contVisitas++;
		this.contVisitas = contVisitas;
	}

	@Override
	public String toString() {
		return "Usuario [cod=" + cod + ", pass=" + pass + ", contVisitas=" + contVisitas + "]";
	}
	
	
}
