package caelum.exemplo2;

public class Imprime implements AcoesAposGerarNota {

	@Override
	public void executa(NotaFiscalBuilder nf) {
		System.out.println("Imprime");
	}

}
