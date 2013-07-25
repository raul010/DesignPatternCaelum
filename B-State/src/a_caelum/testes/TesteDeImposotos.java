package a_caelum.testes;

import a_caelum.estados.Orcamento;

public class TesteDeImposotos {
	public static void main(String[] args) {

		Imposto imposto = new ISS(new ICMS());
		
		Orcamento orcamento = new Orcamento(500.0);
		
		CalculadorDeImpostos calculador = new CalculadorDeImpostos();
		calculador.realizaCalculo(orcamento, imposto);
	}
}
