package caelum.exemplo2;

public class Multiplicador implements AcoesAposGerarNota {
	
	private double fator;
	
	public Multiplicador(double fator) {
		this.fator = fator;
	}
	
	@Override
	public void executa(NotaFiscalBuilder nf) {
		double valorBruto = nf.getValorBruto();
		nf.setValorBruto(valorBruto * fator);
	}

}
