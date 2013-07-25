package a_caelum;

public class TestaNotaFiscal {
	
	public static void main(String[] args) {
		NotaFiscal nf = new NotaFiscalBuilder()
			.adicionaAcao(new Imprime())
			.adicionaAcao(new NotaFiscalDao())
			.comCnpj("123.456.789/0001-12")
			.comItem("Item 1", 100.0)
			.comItem("Item 2", 200.0)
			.comItem("Item 3", 300.0)
			.comRazaoSocial("Razao Social")
			.comObservacao("Observations")
			.naDataAtual()
			.constroiNotaFiscal();
		
		//implementar toString se quiser ver resultado
		System.out.println(nf);
	}
}
