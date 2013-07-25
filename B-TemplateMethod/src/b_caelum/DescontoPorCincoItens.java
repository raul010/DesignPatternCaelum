package b_caelum;

public class DescontoPorCincoItens extends Desconto{
	
	@Override
	public boolean condicaoParaEsteDesconto(Orcamento orcamento) {
		return orcamento.getItens().size() > 5;
	}

	@Override
	public double descontaValor(Orcamento orcamento) {
		return orcamento.getValor() * 0.01;
	}

}
