package estados;


public class Reprovado implements EstadoDeUmOrcamento {

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		throw new RuntimeException("Orcamento reprovado nao recebem descontos");
	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Orcamento reprovado nao pode ser aprovado");
	}

	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("Orcamento reprovado nao pode ser reprovado novamente");
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		orcamento.estadoDeUmOrcamento = new Finalizado();
		
	}
}
