
public class TesteDeImposotos {
	public static void main(String[] args) {
		Imposto icms = new ICMS();
		Imposto iss = new ISS();
		
		Orcamento orcamento = new Orcamento(500.0);
		
		CalculadorDeImpostos calculador = new CalculadorDeImpostos();
		calculador.realizaCalculo(orcamento, icms);
		calculador.realizaCalculo(orcamento, iss);
		
		System.out.println("teste PUSH");
	}
}
