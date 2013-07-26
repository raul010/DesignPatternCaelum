package k19.creator;

import k19.concreteproduct.EmissorEmail;
import k19.concreteproduct.EmissorJMS;
import k19.concreteproduct.EmissorSMS;
import k19.product.Emissor;

/**
 * <b>Creator</b>
 * <br>Intermedi�rio que possui o m�todo respons�vel pela cria��o do produto.
 * <br>
 * <br>Para tornar a classe TestaEmissores menos dependente das classes que 
 * implementam os mecanismos de envio, podemos definir uma classe intermedi�ria 
 * que ser� respons�vel pela cria��o dos emissores.
 */
public class EmissorCreator {

	public static final int SMS = 0;
	public static final int EMAIL = 1;
	public static final int JMS = 2;
	
	/**
	 * factoryMethod()
	 * @param tipoDeEmissor
	 * @return Emissor
	 */
	public Emissor create(int tipoDeEmissor) {
		if (tipoDeEmissor == EmissorCreator.SMS) {
			return new EmissorSMS();
		} else if (tipoDeEmissor == EmissorCreator.EMAIL) {
			return new EmissorEmail();
		} else if (tipoDeEmissor == EmissorCreator.JMS) {
			return new EmissorJMS();
		} else {
			throw new IllegalArgumentException(
					" Tipo de emissor n�o suportado ");
		}
	}

}
