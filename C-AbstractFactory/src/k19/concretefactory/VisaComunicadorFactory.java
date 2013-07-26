package k19.concretefactory;

import k19.abstractfactory.ComunicadorFactory;
import k19.abstractproduct.Emissor;
import k19.abstractproduct.Receptor;
import k19.fmcreator.EmissorCreator;
import k19.fmcreator.ReceptorCreator;

/**
 * <b>Concrete Factory</b>
 * <br>Classe que implementa os métodos de criação dos objetos de uma família.
 */
public class VisaComunicadorFactory implements ComunicadorFactory {
	private EmissorCreator emissorCreator = new EmissorCreator();
	private ReceptorCreator receptorCreator = new ReceptorCreator();

	@Override
	public Emissor createEmissor() {
		return emissorCreator.create(EmissorCreator.VISA);
	}

	@Override
	public Receptor createReceptor() {
		return receptorCreator.create(ReceptorCreator.VISA);
	}

}
