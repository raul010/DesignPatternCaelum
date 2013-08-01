package k19.subjectsubject;

import k19.subject.Conta;
/**
 * <b>Real Subject</b>
 * <br>Define um tipo de objeto do domínio da aplicação.
 * @author Raul
 */
public class ContaPadrao implements Conta {
	private double saldo;

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public void saca(double valor) {
		this.saldo -= valor;
	}

	public double getSaldo() {
		return this.saldo;
	}
}
