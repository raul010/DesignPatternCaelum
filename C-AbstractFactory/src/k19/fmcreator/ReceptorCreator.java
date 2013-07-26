package k19.fmcreator;

import k19.abstractproduct.Receptor;
import k19.concreteproduct.ReceptorMastercard;
import k19.concreteproduct.ReceptorVisa;

/**
 * <b>Creator</b> (emprestado do Factory Method)
 * <br>Intermediário que possui o método responsável pela criação do produto.
 */
public class ReceptorCreator {
	public static final int VISA = 0;
	public static final int MASTERCARD = 1;

	public Receptor create(int tipoDoReceptor) {
		if (tipoDoReceptor == ReceptorCreator.VISA) {
			return new ReceptorVisa();
		} else if (tipoDoReceptor == ReceptorCreator.MASTERCARD) {
			return new ReceptorMastercard();
		} else {
			throw new IllegalArgumentException(
					" Tipo de receptor não suportado . ");
		}
	}
}
