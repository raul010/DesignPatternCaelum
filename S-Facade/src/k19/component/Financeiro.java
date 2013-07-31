package k19.component;

/**
 * <b>Component</b> <br>
 * Classes que comp�em o subsistema.
 * 
 * @author Raul
 */
public class Financeiro {
	public void fatura(String cliente, String produto) {
		System.out.println("Fatura: ");
		System.out.println("Cliente: " + cliente);
		System.out.println("NF: " + produto);
	}
}
