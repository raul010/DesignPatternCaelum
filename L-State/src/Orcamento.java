import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Orcamento {
	double valor;
	private List<Item> itens;
	private EstadoDeUmOrcamento estado;
	
	public Orcamento(double valor) {
		this.valor = valor;
		this.itens = new ArrayList<Item>();
		this.estado = new EmAprovacao();
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
	
	public void setEstadoCorrente(EstadoDeUmOrcamento estado) {
		this.estado = estado;
	}
	public void aplicaDescontoExtra() {
		estado.aplicaDesconto(this);
	}
	public void aprova() {
		estado.setEstadoAprovado(this);
	}
	public void reprova() {
		estado.setEstadoReprovado(this);
	}
	public void finaliza() {
		estado.setEstadoFinalizado(this);
	}
}