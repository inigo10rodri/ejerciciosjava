package Banco;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CuentaCredito c1= new CuentaCredito("Santander",666);
		c1.reintegro(300);
		System.out.print(c1.getSaldo());
	}

}
