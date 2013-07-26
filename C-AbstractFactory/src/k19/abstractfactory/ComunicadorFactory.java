package k19.abstractfactory;

import k19.abstractproduct.Emissor;
import k19.abstractproduct.Receptor;

/**
 * <b>Abstract Factory</b>
 * <br>Interface que define as assinaturas dos métodos responsáveis pela criação dos objetos uma
 * família.
 */
public interface ComunicadorFactory {
	Emissor createEmissor();
	Receptor createReceptor();
}
