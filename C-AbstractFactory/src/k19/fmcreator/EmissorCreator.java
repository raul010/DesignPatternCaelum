package k19.fmcreator;

import k19.abstractproduct.Emissor;
import k19.concreteproduct.EmissorMastercard;
import k19.concreteproduct.EmissorVisa;

/**
 * <b>Creator</b> (emprestado do Factory Method)
 * <br>Intermedi�rio que possui o m�todo respons�vel pela cria��o do produto.
 */
public class EmissorCreator {
	public static final int VISA = 0;
	public static final int MASTERCARD = 1;
	
	public Emissor create(int tipoDoEmissor) {
		if (tipoDoEmissor == EmissorCreator.VISA) {
			return new EmissorVisa();
		} else if (tipoDoEmissor == EmissorCreator.MASTERCARD) {
			return new EmissorMastercard();
		} else {
			throw new IllegalArgumentException(
					" Tipo de emissor n�o suportado ");
		}
	}

}
