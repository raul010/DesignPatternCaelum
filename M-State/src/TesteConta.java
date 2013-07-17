
public class TesteConta {
	
	public static void main(String[] args) {
		Conta conta = new Conta(500.0);
		
		conta.fazSaque(600);
		conta.fazSaque(100);
		
		conta.fazDeposito(200);
		System.out.println("Saldo -> " + conta.saldo);

		conta.fazSaque(100);
		System.out.println("Saldo -> " + conta.saldo);
	}

}
