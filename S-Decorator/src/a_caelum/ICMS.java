package a_caelum;

public class ICMS extends Imposto {

	public ICMS(Imposto impostoComposto) {
		super(impostoComposto);
	}
	
	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.01 + calculoDoOutroImposto(orcamento);
	}

}
