
public interface EstadoDeUmaConta {
	
	void saca(Conta conta, double valor);
	void deposita(Conta conta, double valor);
	
	void passaEstadoNegativo(Conta conta);
	void passaEstadoPositivo(Conta conta);
}
