
public class Reprovado implements EstadoDeUmOrcamento {

	@Override
	public void aplicaDesconto(Orcamento orcamento) {
		throw new RuntimeException("Reprovado - Sem Descontos!");
	}

	@Override
	public void setEstadoAprovado(Orcamento orcamento) {
		throw new RuntimeException("Reprovado - Não pode aprovar!");
	}

	@Override
	public void setEstadoReprovado(Orcamento orcamento) {
		throw new RuntimeException("Reprovado - Não pode reprovar novamente!");

	}

	@Override
	public void setEstadoFinalizado(Orcamento orcamento) {
		orcamento.setEstadoCorrente(new Finalizado());
	}

}
