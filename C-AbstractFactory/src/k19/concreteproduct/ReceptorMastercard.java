package k19.concreteproduct;

import k19.abstractproduct.Receptor;

/**
 * <b>Concrete Product</b>
 * <br>Implementação particular de um tipo de produto.
 */
public class ReceptorMastercard implements Receptor {

	@Override
	public String recebe() {
		System.out.println("Recebendo mensagem da Mastercard.");
		String mensagem = "Mensagem da Mastercard";
		return mensagem;
	}

}
