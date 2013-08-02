package k19.concreteobserver;

import k19.concretesubject.Acao;
import k19.observer.AcaoObserver;

/**
 * <b>ConcreteObserver</b> <br>
 * Implementação particular de um Observer.
 * 
 * @author Raul
 */
public class Corretora implements AcaoObserver {
	private String nome;

	public Corretora(String nome) {
		this.nome = nome;
	}

	public void notificaAlteracao(Acao acao) {
		System.out.println("Corretora " + this.nome + " sendo notificada: ");
		System.out.println("A ação " + acao.getCodigo()
				+ " teve o seu valor alterado para " + acao.getValor());
	}
}
