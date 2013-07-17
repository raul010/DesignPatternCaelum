
public class TesteDeImposotos {
	public static void main(String[] args) {

		//Imposto imposto = new ISS(new ICMS());
		//Imposto imposto = new ImpostoMuitoAlto(new ICMS());
		Imposto imposto = new ICCP(new ISS(new IKCV()));
		
		Orcamento orcamento = new Orcamento(500.0);
		
		CalculadorDeImpostos calculador = new CalculadorDeImpostos();
		calculador.realizaCalculo(orcamento, imposto);
	}
}
