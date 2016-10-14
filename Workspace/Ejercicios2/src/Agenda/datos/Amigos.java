package Agenda.datos;

public class Amigos {
	//ATRIBUTOS
	private String nombre;
	private String email;
	private String telefono;
	//METODOS
	//Metodo constructor
	public Amigos(String nombre){
		this.setNombre(nombre);
	}
	public Amigos(String nombre,String email,String telefono){		
	}
	//Metodos getter y setter
	//Nombre
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	//Email
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	//Telefono
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

}
