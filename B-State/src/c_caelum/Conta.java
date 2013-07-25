package c_caelum;

public class Conta {
	
	double saldo;
	EstadoDeUmaConta estado;
	
	public Conta(double valor) {
		this.saldo = valor;
		estado = new Positivo();
		verificaEAlteraEstado(valor);
	}
	
	public void fazSaque(double valor) {
		try {estado.saca(this, valor);} catch (RuntimeException e) {e.printStackTrace();}
		verificaEAlteraEstado(saldo);
	}

	public void fazDeposito(double valor) {
		try {estado.deposita(this, valor);} catch (RuntimeException e) {e.printStackTrace();}
		verificaEAlteraEstado(saldo);
	}

	private void verificaEAlteraEstado(double saldo) {
		if (saldo < 0 && !(estado instanceof Negativo)) {
			estado.passaEstadoNegativo(this);
		} else if (saldo >= 0 && !(estado instanceof Positivo)) {
			estado.passaEstadoPositivo(this);
		}
	}

	public double getSaldo() {
		return saldo;
	}

}
