package b_caelum;

public abstract class Desconto {
	
	Desconto proximo;
	
	final double desconta(Orcamento orcamento) {
		if(condicaoParaEsteDesconto(orcamento)) {
			return descontaValor(orcamento);
		}
		else {
			return proximo.desconta(orcamento);
		}
	}
	
	public void setProximo(Desconto desconto) {
		proximo = desconto;
	}	
	
	public abstract boolean condicaoParaEsteDesconto(Orcamento orcamento);
	
	public abstract double descontaValor(Orcamento orcamento);
}
