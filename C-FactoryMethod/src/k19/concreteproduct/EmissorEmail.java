package k19.concreteproduct;

import k19.product.Emissor;

/**
 * <b>Concrete Product</b>
 * <br>Uma implementação particular do tipo de objeto a ser criado.
 */
public class EmissorEmail implements Emissor {

	@Override
	public void envia(String mensagem) {
		System.out.println("Enviando por email a mensagem:");
		System.out.println(mensagem);

	}

}
