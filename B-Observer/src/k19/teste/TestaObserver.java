package k19.teste;

import k19.concreteobserver.Corretora;
import k19.concretesubject.Acao;

/**
 * Testa classes Corretora e Acao
 * 
 * @author Raul
 */

public class TestaObserver {
	public static void main(String[] args) {
		
		 Acao acao = new Acao("VALE3", 45.27);
		 
		 Corretora corretora1 = new Corretora("Corretora1"); Corretora
		 corretora2 = new Corretora("Corretora2");
		 
		 acao.registraInteressado(corretora1);
		 acao.registraInteressado(corretora2);
		  
		 acao.setValor(50);
		 
	}
}
