package b_caelum;

public class SemDesconto extends Desconto {

	@Override
	public boolean condicaoParaEsteDesconto(Orcamento orcamento) {
		return true;
	}
	@Override
	public double descontaValor(Orcamento orcamento) {
		return 0;
	}
	
}
