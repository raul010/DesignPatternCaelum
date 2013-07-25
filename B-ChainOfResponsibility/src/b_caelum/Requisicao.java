package b_caelum;
enum Formato {
	XML, CSV, PORCENTO, ERRO
}

public class Requisicao {
	private Formato formato;

	public Requisicao(Formato formato) {
		this.formato = formato;
	}

	public Formato getFormato() {
		return formato;
	}
}