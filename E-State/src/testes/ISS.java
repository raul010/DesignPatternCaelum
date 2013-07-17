package testes;

import estados.Orcamento;

public class ISS extends Imposto {
	
	public ISS(Imposto impostoComposto) {
		super(impostoComposto);
	}
	public ISS(){}
	
	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.06 + calculoDoOutroImposto(orcamento);
	}

}
