package caelum.exemplo1;

public class TestaNotaFiscal {
	
	public static void main(String[] args) {
		NotaFiscal nf = new NotaFiscalBuilder()
			.comCnpj("123.456.789/0001-12")
			.comItem("Item 1", 100.0)
			.comItem("Item 2", 200.0)
			.comItem("Item 3", 300.0)
			.comRazaoSocial("Razao Social")
			.comObservacao("Observations")
			.naDataAtual()
			.constroiNotaFiscal();
		
		System.out.println(nf.getCnpj());
	}
}
