package k19.client;

import k19.component.Estoque;
import k19.component.Financeiro;
import k19.component.Pedido;
import k19.component.PosVenda;
import k19.facade.PedidoFacade;

/**
 * <b>Client</b> <br>
 * Classe que usa os Component de forma indireta através do Facade.
 * 
 * @author Raul
 */
public class TestePedidoFacade {
	public static void main(String[] args) {
		Estoque estoque = new Estoque();
		Financeiro financeiro = new Financeiro();
		PosVenda posVenda = new PosVenda();
		PedidoFacade facade = new PedidoFacade(estoque, financeiro, posVenda);
		Pedido pedido = new Pedido("Notebook", "Rafael Cosentino",
				"Av Brigadeiro Faria Lima , 1571, São Paulo , SP", "007");
		facade.registraPedido(pedido);
	}
}
