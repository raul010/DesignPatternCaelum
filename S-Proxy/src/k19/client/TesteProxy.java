package k19.client;

import k19.proxy.ContaProxy;
import k19.subject.Conta;
import k19.subjectsubject.ContaPadrao;
/**
 * <b>Client</b>
 * <br>Cliente que usa o RealSubject por meio do Proxy.
 * @author Raul
 */
public class TesteProxy {
	public static void main(String[] args) {
		Conta contaPadrao = new ContaPadrao();
		Conta contaProxy = new ContaProxy(contaPadrao);
		contaProxy.deposita(100);
		contaProxy.saca(59);
		System.out.println("Saldo : " + contaProxy.getSaldo());
	}
}
