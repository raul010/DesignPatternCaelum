package k19.decorator;

import k19.component.Emissor;

/**
 * <b>Decorator</b> <br>
 * Classe abstrata que mant�m uma refer�ncia para um Component e ser� utilizada
 * para padronizar os objetos decoradores.
 * 
 * @author Raul
 */
public abstract class EmissorDecorator implements Emissor {
	private Emissor emissor;

	public EmissorDecorator(Emissor emissor) {
		this.emissor = emissor;
	}

	public abstract void envia(String mensagem);

	public Emissor getEmissor() {
		return this.emissor;
	}
}
