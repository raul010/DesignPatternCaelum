package k19.concretedecorator;

import k19.component.Emissor;
import k19.decorator.EmissorDecorator;

/**
 * <b>ConcreteDecorator</b> <br>
 * Implementa��o de um Decorator.
 * 
 * @author Raul
 */
public class EmissorDecoratorComCriptografia extends EmissorDecorator {
	
	public EmissorDecoratorComCriptografia(Emissor emissor) {
		super(emissor);
	}

	public void envia(String mensagem) {
		System.out.println("Enviando mensagem criptografada: ");
		this.getEmissor().envia(criptografa(mensagem));
	}

	private String criptografa(String mensagem) {
		String mensagemCriptografada = new StringBuilder(mensagem).reverse()
				.toString();
		return mensagemCriptografada;
	}
}
