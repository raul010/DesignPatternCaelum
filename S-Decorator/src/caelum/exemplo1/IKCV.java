package caelum.exemplo1;

public class IKCV extends TemplateCondicional {

	private boolean temItemMaiorQue100Reais(Orcamento orcamento) {
		for (Item itens : orcamento.getItens()) {
			if(itens.getValor() > 100) return true;
		}
		return false;
	}

	@Override
	boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() > 500 && temItemMaiorQue100Reais(orcamento);
	}

	@Override
	double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.10;
	}

	@Override
	double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.06;
	}
}
