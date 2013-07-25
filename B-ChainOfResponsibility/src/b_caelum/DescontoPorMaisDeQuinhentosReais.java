package b_caelum;

public class DescontoPorMaisDeQuinhentosReais implements Desconto {
	
	private Desconto proximo;
	
	public double desconta(Orcamento orcamento) {
		if(orcamento.getValor() > 500.0) {
			return orcamento.getValor() * 0.07;
		}
		else {
			return proximo.desconta(orcamento);
		}
	}

	@Override
	public void setProximo(Desconto desconto) {
		proximo = desconto;
	}
}
