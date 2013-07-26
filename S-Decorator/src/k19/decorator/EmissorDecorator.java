package k19.decorator;

import k19.component.Emissor;

/**
 * <b>Decorator</b> <br>
 * Classe abstrata que mantém uma referência para um Component e será utilizada
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
