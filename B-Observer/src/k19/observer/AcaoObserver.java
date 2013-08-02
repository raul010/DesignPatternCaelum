package k19.observer;

import k19.concretesubject.Acao;

/**
 * <b>Observer</b> <br>
 * Interface dos objetos interessados no estado dos Subjects.
 * 
 * @author Raul
 */
public interface AcaoObserver {
	void notificaAlteracao(Acao acao);
}
