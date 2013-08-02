package caelum.exemplo2;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;


public class NotaFiscalBuilder {
	
	private String razaoSocial;
	private String cnpj;
	private List<ItemDaNota> itens = new ArrayList<ItemDaNota>();
	private Calendar dataDeEmissao;
	private double valorBruto;
	private double impostos;
	private String observacao;
	
	List<AcoesAposGerarNota> acoes;
	
	public NotaFiscalBuilder() {
		acoes = new ArrayList<AcoesAposGerarNota>();
	}
	public NotaFiscalBuilder comRazaoSocial(String razao) {
		this.razaoSocial = razao;
		return this;
	}
	public NotaFiscalBuilder comCnpj(String cnpj) {
		this.cnpj = cnpj;
		return this;
	}
	public NotaFiscalBuilder comItem(String nome, double valor) {
		this.itens.add(new ItemDaNota(nome, valor));
		valorBruto += valor;
		impostos += valor * 0.05;
		return this;
	}
	public NotaFiscalBuilder naDataAtual(){
		this.dataDeEmissao = Calendar.getInstance();
		return this;
	}
	public NotaFiscalBuilder comObservacao(String observacao){
		this.observacao = observacao;
		return this;
	}
	
	public NotaFiscalBuilder adicionaAcao(List<AcoesAposGerarNota> acoes) {
		this.acoes = acoes;
		return this;
	}
	
	
	public NotaFiscal constroiNotaFiscal() {
		for(AcoesAposGerarNota acao : acoes) {
			acao.executa(this);
		}
		return new NotaFiscal(razaoSocial, cnpj, itens, dataDeEmissao, valorBruto, impostos, observacao);
	}
	
	public double getValorBruto() {
		return valorBruto;
	}

	public void setValorBruto(double valor) {
		this.valorBruto = valor;
	}
}
