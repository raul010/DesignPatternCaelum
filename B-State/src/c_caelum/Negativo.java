package c_caelum;

public class Negativo implements EstadoDeUmaConta {

	@Override
	public void saca(Conta conta, double valor) {
		throw new RuntimeException("NEGATIVO - Não pode sacar, o saldo encontra-se em estado negativo -> " + conta.saldo);
	}

	@Override
	public void deposita(Conta conta, double valor) {
		conta.saldo += (valor * 0.95);
	}

	@Override
	public void passaEstadoNegativo(Conta conta) {
		throw new RuntimeException("Negativo - O saldo já é negativo");
	}

	@Override
	public void passaEstadoPositivo(Conta conta) {
		conta.estado = new Positivo();
	}

}
