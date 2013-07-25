package b_caelum;

public class DescontoPorMaisDeQuinhentosReais extends Desconto {

	@Override
	public boolean condicaoParaEsteDesconto(Orcamento orcamento) {
		return orcamento.getValor() > 500.0;
	}

	@Override
	public double descontaValor(Orcamento orcamento) {
		return orcamento.getValor() * 0.07;
	}
}
