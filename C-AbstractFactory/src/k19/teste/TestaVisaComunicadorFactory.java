package k19.teste;

import k19.abstractfactory.ComunicadorFactory;
import k19.abstractproduct.Emissor;
import k19.abstractproduct.Receptor;
import k19.concretefactory.VisaComunicadorFactory;
/**
 * Assim como o Factory Method, pretende-se chegar no produto concreto.
 * A diferen�a � que neste caso, deve-se primeiramente encontrar o objeto de f�brica 
 * correto dentro de uma fam�lia (MastercardComunicadorFactory ou MastercardComunicadorFactory). 
 * Ent�o, atrav�s desde objeto, usa-se Factory Method, para chegar finalmente ao produto
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