package estados;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Orcamento {
	
	protected EstadoDeUmOrcamento estadoDeUmOrcamento;
	double valor;
	private List<Item> itens;
	
	public Orcamento(double valor) {
		this.valor = valor;
		this.itens = new ArrayList<Item>();
		estadoDeUmOrcamento = new EmAprovacao();
	}

	public double getValor() {
		return valor;
	}
	
	public void adicionaItem(Item item) {
		itens.add(item);
	}
	
	public List<Item> getItens() {
		return Collections.unmodifiableList(itens);
	}
	
	public void aplicaDescontoExtra() {
		estadoDeUmOrcamento.aplicaDescontoExtra(this);
	}
	public void aprova() {
		estadoDeUmOrcamento.aprova(this);
	}
	public void reprova() {
		estadoDeUmOrcamento.reprova(this);
	}
	public void finaliza() {
		estadoDeUmOrcamento.finaliza(this);
	}
}