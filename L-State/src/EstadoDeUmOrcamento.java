
public interface EstadoDeUmOrcamento {
	
	void aplicaDesconto(Orcamento orcamento);
	
	void setEstadoAprovado(Orcamento orcamento);
	void setEstadoReprovado	(Orcamento orcamento);
	void setEstadoFinalizado(Orcamento orcamento);
	
}
