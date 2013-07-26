package k19.abstractfactory;

import k19.abstractproduct.Emissor;
import k19.abstractproduct.Receptor;

/**
 * <b>Abstract Factory</b>
 * <br>Interface que define as assinaturas dos m�todos respons�veis pela cria��o dos objetos uma
 * fam�lia.
 */
public interface ComunicadorFactory {
	Emissor createEmissor();
	Receptor createReceptor();
}
