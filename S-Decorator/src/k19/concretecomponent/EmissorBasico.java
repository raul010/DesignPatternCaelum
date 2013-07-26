package k19.concretecomponent;

import k19.component.Emissor;

/**
 * <b>Concrete Component</b> <br>
 * Implementação particular do Component.
 * 
 * @author Raul
 */
public class EmissorBasico implements Emissor {
	public void envia(String mensagem) {
		System.out.println("Enviando uma mensagem: ");
		System.out.println(mensagem);
	}
}
