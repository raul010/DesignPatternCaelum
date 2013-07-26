package k19.component;

/**
 * <b>Component</b> <br>
 * Classes que compõem o subsistema.
 * 
 * @author Raul
 */
public class Pedido {
	private String produto;
	private String cliente;
	private String enderecoDeEntrega;
	private String notaFiscal;

	public Pedido(String produto, String cliente, String enderecoDeEntrega,
			String notaFiscal) {
		this.produto = produto;
		this.cliente = cliente;
		this.enderecoDeEntrega = enderecoDeEntrega;
		this.notaFiscal = notaFiscal;
	}

	public String getProduto() {
		return produto;
	}

	public String getCliente() {
		return cliente;
	}

	public String getEnderecoDeEntrega() {
		return enderecoDeEntrega;
	}

	public String getNotaFiscal() {
		return notaFiscal;
	}
}
