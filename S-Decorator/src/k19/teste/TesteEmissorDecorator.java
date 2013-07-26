package k19.teste;

import k19.component.Emissor;
import k19.concretecomponent.EmissorBasico;
import k19.concretedecorator.EmissorDecoratorComCompressao;
import k19.concretedecorator.EmissorDecoratorComCriptografia;

public class TesteEmissorDecorator {
	public static void main(String[] args) {
		String mensagem = " ";
		Emissor emissorCript = new EmissorDecoratorComCriptografia(new EmissorBasico());
		emissorCript.envia(mensagem);
		
		Emissor emissorCompr = new EmissorDecoratorComCompressao(new EmissorBasico());
		emissorCompr.envia(mensagem);
		
		Emissor emissorCriptCompr = new EmissorDecoratorComCriptografia(
				new EmissorDecoratorComCompressao(new EmissorBasico()));
		emissorCriptCompr.envia(mensagem);
	}
}
