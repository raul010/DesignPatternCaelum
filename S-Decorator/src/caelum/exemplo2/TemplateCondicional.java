package caelum.exemplo2;

abstract class TemplateCondicional extends Imposto {
	
	public TemplateCondicional() {}
	public TemplateCondicional(Imposto imposto) {
		super(imposto);
	}

	@Override
	public double calcula(Orcamento orcamento) {
		if (deveUsarMaximaTaxacao(orcamento)) {
			return maximaTaxacao(orcamento) + super.calculoDoOutroImposto(orcamento);
		} else {
			return minimaTaxacao(orcamento) + super.calculoDoOutroImposto(orcamento);
		}
	}
	
	abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);
	abstract double maximaTaxacao(Orcamento orcamento);
	abstract double minimaTaxacao(Orcamento orcamento);
}