package c_caelum;

public class Positivo implements EstadoDeUmaConta {

	@Override
	public void saca(Conta conta, double valor) {
		conta.saldo -= valor;
	}

	@Override
	public void deposita(Conta conta, double valor) {
		conta.saldo += valor * 0.98;
	}

	@Override
	public void passaEstadoNegativo(Conta conta) {
		conta.estado = new Negativo();
	}

	@Override
	public void passaEstadoPositivo(Conta conta) {
		throw new RuntimeException("Positivo - Saldo já é positivo");
	}

}
