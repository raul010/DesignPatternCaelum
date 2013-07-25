package b_caelum;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;


public class NotaFiscalBuilder {
	
	private String razaoSocial;
	private String cnpj;
	private List<ItemNovo> itens = new ArrayList<ItemNovo>();
	private Date dataDeEmissao;
	private double valorBruto;
	private double impostos;
	private String observacao;
	
	public NotaFiscalBuilder comRazaoSocial(String razao) {
		this.razaoSocial = razao;
		this.dataDeEmissao = Calendar.getInstance().getTime();
		return this;
	}
	public NotaFiscalBuilder comCnpj(String cnpj) {
		this.cnpj = cnpj;
		return this;
	}
	public NotaFiscalBuilder com(ItemNovo itemNovo) {
		this.itens.add(itemNovo);
		valorBruto += itemNovo.getValor();
		impostos += itemNovo.getValor() * 0.05;
		return this;
	}
	public NotaFiscalBuilder naData(int dia, int mes, int ano){
		Calendar c =  Calendar.getInstance();
		c.set(ano, mes, dia);
		this.dataDeEmissao = c.getTime();
		return this;
	}
	public NotaFiscalBuilder comObservacao(String observacao){
		this.observacao = observacao;
		return this;
	}
	public NotaFiscal constroiNotaFiscal() {
		return new NotaFiscal(razaoSocial, cnpj, itens, dataDeEmissao, valorBruto, impostos, observacao);
	}
}
