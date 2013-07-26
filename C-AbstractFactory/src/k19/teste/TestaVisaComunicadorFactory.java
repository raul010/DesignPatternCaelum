package k19.teste;

import k19.abstractfactory.ComunicadorFactory;
import k19.abstractproduct.Emissor;
import k19.abstractproduct.Receptor;
import k19.concretefactory.VisaComunicadorFactory;
/**
 * Assim como o Factory Method, pretende-se chegar no produto concreto.
 * A diferença é que neste caso, deve-se primeiramente encontrar o objeto de fábrica 
 * correto dentro de uma família (MastercardComunicadorFactory ou MastercardComunicadorFactory). 
 * Então, através desde objeto, usa-se Factory Method, para chegar finalmente ao produto
 * concreto.
 */
public class TestaVisaComunicadorFactory {
	public static void main(String[] args) {
		ComunicadorFactory comunicadorFactory = new VisaComunicadorFactory();
		
		String transacao = "Valor = 560; Senha = 123";
		
		Emissor emissor = comunicadorFactory.createEmissor();
		emissor.envia(transacao);
		
		Receptor receptor = comunicadorFactory.createReceptor();
		String mensagem = receptor.recebe();
		
		System.out.println(mensagem);
	}
}