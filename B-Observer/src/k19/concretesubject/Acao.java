package k19.concretesubject;

import java.util.HashSet;
import java.util.Set;

import k19.observer.AcaoObserver;

/**
 * <b>ConcreteSubject</b> <br>
 * Implementação de um Subject.
 * 
 * @author Raul
 */
public class Acao {
	private String codigo;
	private double valor;

	private Set<AcaoObserver> interessados = new HashSet<AcaoObserver>();

	public Acao(String codigo, double valor) {
		this.codigo = codigo;
		this.valor = valor;
	}

	public void registraInteressado(AcaoObserver interessado) {
		this.interessados.add(interessado);
	}

	public void cancelaInteresse(AcaoObserver interessado) {
		this.interessados.remove(interessado);
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
		for (AcaoObserver interessado : interessados) {
			interessado.notificaAlteracao(this);
		}
	}

	public String getCodigo() {
		return codigo;
	}
}
