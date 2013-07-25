package a_caelum;

public class TesteDeImposotos {
	public static void main(String[] args) {

		Imposto imposto = new ISS(new ICMS(new ISS()));
		
		Orcamento orcamento = new Orcamento(500.0);
		
		CalculadorDeImpostos calculador = new CalculadorDeImpostos();
		calculador.realizaCalculo(orcamento, imposto);
	}
}
