package b_caelum;

public class Finalizado implements EstadoDeUmOrcamento {

	@Override
	public void aplicaDesconto(Orcamento orcamento) {
		throw new RuntimeException("Finalizado - Não recebe desconto");
	}

	@Override
	public void setEstadoAprovado(Orcamento orcamento) {
		throw new RuntimeException("Finalizado - Não pode ser aprovado");
	}

	@Override
	public void setEstadoReprovado(Orcamento orcamento) {
		throw new RuntimeException("Finalizado - Não pode ser reprovado");
	}

	@Override
	public void setEstadoFinalizado(Orcamento orcamento) {
		throw new RuntimeException("Finalizado - Já está em estado Finalizado");
	}

}
