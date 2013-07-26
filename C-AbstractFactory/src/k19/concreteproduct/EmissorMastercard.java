package k19.concreteproduct;

import k19.abstractproduct.Emissor;
/**
 * <b>Concrete Product</b>
 * <br>Implementação particular de um tipo de produto.
 */
public class EmissorMastercard implements Emissor {

	@Override
	public void envia(String mensagem) {
		System.out.println("Enviando mensagem para a Mastercard:");
		System.out.println(mensagem);
	}
}
