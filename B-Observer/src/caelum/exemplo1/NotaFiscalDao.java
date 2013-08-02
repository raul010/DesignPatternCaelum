package caelum.exemplo1;

public class NotaFiscalDao implements AcoesAposGerarNota {

	@Override
	public void executa() {
		System.out.println("Salva na Base");
	}

}
