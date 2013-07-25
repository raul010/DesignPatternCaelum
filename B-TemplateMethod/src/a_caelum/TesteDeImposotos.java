package a_caelum;

public class TesteDeImposotos {
	public static void main(String[] args) {
		Imposto icms = new ICMS();
		Imposto iss = new ISS();
		Imposto iccp = new ICCP();
		Imposto ikcv = new IKCV();
		
		
		
		Orcamento orcamento = new Orcamento(500.0);
		
		CalculadorDeImpostos calculador = new CalculadorDeImpostos();
		calculador.realizaCalculo(orcamento, icms);
		calculador.realizaCalculo(orcamento, iss);
		calculador.realizaCalculo(orcamento, iccp);
		calculador.realizaCalculo(orcamento, ikcv);
	}
}
