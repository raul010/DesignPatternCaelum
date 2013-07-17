package estados;


public class Aprovado implements EstadoDeUmOrcamento {
	//Metodo de negócio
	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		orcamento.valor -= orcamento.valor * 0.02;
	}
	//Métodos de
	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException ("Orcamento ja esta em estado de aprovacao");
	}

	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException ("Orcamento nao pode ser reprovado, ja esta em estado Aprovado");
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		orcamento.estadoDeUmOrcamento = new Finalizado();
	}

}
