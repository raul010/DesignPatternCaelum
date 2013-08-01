package k19.proxy;

import k19.subject.Conta;
/**
 * <b>Proxy</b>
 * <br>Define os objetos que controlam o acesso aos RealSubjects
 * @author Raul
 */
public class ContaProxy implements Conta {
	private Conta conta;

	public ContaProxy(Conta conta) {
		this.conta = conta;
	}

	public void deposita(double valor) {
		System.out.println("Efetuando o depósito de R$ " + valor + "...");
		this.conta.deposita(valor);
		System.out.println("Depósito de R$ " + valor + " efetuado...");
	}

	public void saca(double valor) {
		System.out.println("Efetuando o saque de R$ " + valor);
		this.conta.saca(valor);
		System.out.println("Saque de R$ " + valor + " efetuado. ");
	}

	public double getSaldo() {
		System.out.println("Verificando o saldo... ");
		return this.conta.getSaldo();
	}
}
