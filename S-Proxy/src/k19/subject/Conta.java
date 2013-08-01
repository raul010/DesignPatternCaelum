package k19.subject;
/**
 * <b>Subject</b>
 * <br>Interface que padroniza RealSubject e Proxy.
 * @author Raul
 */
public interface Conta {
	void deposita(double valor);
	void saca(double valor);
	double getSaldo();
}
