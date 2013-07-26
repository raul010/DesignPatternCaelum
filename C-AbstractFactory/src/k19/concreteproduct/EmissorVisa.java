package k19.concreteproduct;

import k19.abstractproduct.Emissor;
/**
 * <b>Concrete Product</b>
 * <br>Implementação particular de um tipo de produto.
 */
public class EmissorVisa implements Emissor {

	@Override
	public void envia(String mensagem) {
		System.out.println("Enviando a seguinte mensagem para a Visa:");
		System.out.println(mensagem);
	}

}
