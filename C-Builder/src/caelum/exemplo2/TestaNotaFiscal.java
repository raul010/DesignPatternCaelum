package caelum.exemplo2;

public class TestaNotaFiscal {
	
	public static void main(String[] args) {
		ItemNovo item1 = new ItemBuilder()
		.comNome("Item 1")
		.comValor(100.0)
		.constroiItem();

		ItemNovo item2 = new ItemBuilder()
		.comNome("Item 2")
		.comValor(200.0)
		.constroiItem();

		ItemNovo item3 = new ItemBuilder()
		.comNome("Item 3")
		.comValor(300.0)
		.constroiItem();
		
		NotaFiscal nf = new NotaFiscalBuilder()
			.comCnpj("123.456.789/0001-12")
			.com(item1)
			.com(item2)
			.com(item3)
			.comRazaoSocial("Razao Social")
			.comObservacao("Observations")
			.naData(10,10,2009)
			.constroiNotaFiscal();
		
		System.out.println(nf.getDataDeEmissao());
	}
}
