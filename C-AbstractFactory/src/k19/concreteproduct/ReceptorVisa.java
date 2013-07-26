package k19.concreteproduct;

import k19.abstractproduct.Receptor;

/**
 * <b>Concrete Product</b>
 * <br>Implementação particular de um tipo de produto.
 */
public class ReceptorVisa implements Receptor {

	@Override
	public String recebe() {
		System.out.println("Recebendo mensagem da Visa.");
		String mensagem = "Mensagem da Visa";
		return mensagem;
	}

}
