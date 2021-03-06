package a_caelum.testes;

import a_caelum.estados.Orcamento;

public class ICMS extends Imposto {

	public ICMS(Imposto impostoComposto) {
		super(impostoComposto);
	}
	public ICMS(){}
	
	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.01 + calculoDoOutroImposto(orcamento);
	}

}
