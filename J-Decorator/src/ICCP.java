
public class ICCP extends TemplateCondicional{
	
	public ICCP() {}
	public ICCP(Imposto imposto) {
		super(imposto);
	}
	
	@Override
	boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() > 500;
	}

	@Override
	double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.07;
	}

	@Override
	double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.05;
	}
}