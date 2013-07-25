package b_caelum;
import java.util.Date;
import java.util.List;


public class NotaFiscal {
	
	private String razaoSocial;
	private String cnpj;
	private List<ItemNovo> itens;
	private Date dataDeEmissao;
	private double valorBruto;
	private double impostos;
	private String observacao;
	
	public NotaFiscal(String razaoSocial, String cnpj, List<ItemNovo> itens,
			Date dataDeEmissao, double valorBruto, double impostos,
			String observacao) {
		super();
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
		this.itens = itens;
		this.dataDeEmissao = dataDeEmissao;
		this.valorBruto = valorBruto;
		this.impostos = impostos;
		this.observacao = observacao;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}

	public List<ItemNovo> getItens() {
		return itens;
	}

	public Date getDataDeEmissao() {
		return dataDeEmissao;
	}

	public double getValorBruto() {
		return valorBruto;
	}

	public double getImpostos() {
		return impostos;
	}

	public String getObservacao() {
		return observacao;
	}
	
}
