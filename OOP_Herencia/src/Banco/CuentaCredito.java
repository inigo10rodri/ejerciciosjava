package Banco;

public class CuentaCredito extends Cuenta {

	 public CuentaCredito(String titular, double saldo) {
		super(titular, saldo);
		// TODO Auto-generated constructor stub
	}

	private static final double MAX_NEGATIVO=-100;
	private static final double INTERES=0.01;
	private double saldoNegativo;
	@Override
	public void reintegro(double cant) {
		
		if(saldo>=cant){
			saldo=saldo-cant;
		}else if(saldoNegativo=saldo-cant){
			
		}
	}
	

}
