package a_caelum;

public class TesteDeImposotos {
	public static void main(String[] args) {
		CalculadorDeDescontos calculador = new CalculadorDeDescontos();
		
		Orcamento orcamento = new Orcamento(501.0);
		orcamento.adicionaItem(new Item("Caneta", 250.0));
		orcamento.adicionaItem(new Item("Caneta", 250.0));
		
		double desconto = calculador.calcula(orcamento);
		
		System.out.println(desconto);
	}
}