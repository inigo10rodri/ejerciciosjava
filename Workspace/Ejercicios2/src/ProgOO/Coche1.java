package ProgOO;

public class Coche1 {
	//Atributos
	private String nBastidor;
	private String matricula;
	private String marca;
	
	public String getnBastidor() {
		return nBastidor;
	}
	public void setnBastidor(String nBastidor) {
		this.nBastidor = nBastidor;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	//Metodos
	public void arrancar(){
		System.out.println("En marcha");
	}
	public void girar(String sentido){
		
	}
	public void pitar(int miliSeg){
		
	}
	

}
