package b_caelum;

public abstract class Conta {
	
	public Conta proxima;
	
	abstract String verificaFormato(Formato formato);
	
	public void proximaConta(Conta conta) {
		this.proxima = conta;
	}
}
