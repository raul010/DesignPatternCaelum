package b_caelum;

public class ImpostoMuitoAlto extends Imposto {
	
	public ImpostoMuitoAlto(Imposto imposto) {
		super(imposto);
	}
	public ImpostoMuitoAlto() {}
	
	@Override
	double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.20 + calculoDoOutroImposto(orcamento);
	}
}
