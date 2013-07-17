package estados;


public class EmAprovacao implements EstadoDeUmOrcamento {

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		orcamento.valor -= orcamento.valor * 0.05;
	}

	@Override
	public void aprova(Orcamento orcamento) {
		orcamento.estadoDeUmOrcamento = new Aprovado();
	}

	@Override
	public void reprova(Orcamento orcamento) {
		orcamento.estadoDeUmOrcamento = new Reprovado();
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		orcamento.estadoDeUmOrcamento = new Finalizado();
	}

}
