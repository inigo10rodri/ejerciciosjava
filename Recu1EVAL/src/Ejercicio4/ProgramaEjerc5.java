package Ejercicio4;

public class ProgramaEjerc5 {

	public static void main(String[] args) {
		//Oveja padre y madre
		Oveja padre=new Oveja(864);
		padre.setNombre("Jack");
		Oveja madre=new Oveja(765);
		madre.setNombre("Sue");
		//Oveja hijo
		Oveja ovejaHijo=new Oveja(523);
		ovejaHijo.setNombre("Dolly");//nombre
		ovejaHijo.setLitros(9.4);//litros
		ovejaHijo.setCrotal(23651886);//crotal
		ovejaHijo.setPadre(padre);//Le damos un padre al hijo
		ovejaHijo.setMadre(madre);//Le damos una madre al hijo
		//Mostramos todos los datos del hijo por consola
		System.out.print(ovejaHijo.toString()+", su madre es "+ madre.getNombre()+" y su padre "+padre.getNombre()+".");
	}//main
}//class
