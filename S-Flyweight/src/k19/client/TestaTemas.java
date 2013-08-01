package k19.client;

import k19.apoio.Apresentacao;
import k19.apoio.Slide;
import k19.flyweightfactory.TemaFlyweightFactory;

/**
 * <b>Client</b> <br>
 * Utiliza FlyweightFactory para recuperar os Flyweights.
 * 
 * @author Raul
 */
public class TestaTemas {
	public static void main(String[] args) {
		Apresentacao a = new Apresentacao();
		a.adicionaSlide(new Slide(TemaFlyweightFactory
				.getTema(TemaFlyweightFactory.K19),
				"K11 - Orienta��o a Objetos em Java ",
				"Com este curso voc� vai obter uma base \n "
						+ " s�lida de conhecimentos de Java \n "
						+ " e de Orienta��o a Objetos . "));
		a.adicionaSlide(new Slide(TemaFlyweightFactory
				.getTema(TemaFlyweightFactory.ASTERISCO),
				"K12 - Desenvolvimento Web com JSF2 e JPA2 ",
				"Depois deste curso , voc� estar� apto a \n "
						+ "desenvolver aplica��es Web com \n "
						+ "os padr�es da plataforma Java . "));
		a.adicionaSlide(new Slide(TemaFlyweightFactory
				.getTema(TemaFlyweightFactory.HIFEN),
				"K21 - Persist�ncia com JPA2 e Hibernate ",
				"Neste curso de Java Avan�ado , abordamos de \n "
						+ "maneira profunda os recursos de persist�ncia \n "
						+ "do JPA2 e do Hibernate . "));
		a.imprime();
	}
}
