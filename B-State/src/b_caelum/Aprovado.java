package b_caelum;

public class Aprovado implements EstadoDeUmOrcamento {
	
	private boolean descontaJaConcedido;
	
	@Override
	public void aplicaDesconto(Orcamento orcamento) {
		if(!descontaJaConcedido) { 
			orcamento.valor -= orcamento.valor * 0.02;
			descontaJaConcedido = true;
		} else {
			throw new RuntimeException("Aprovado - Desconto já concedido!");
		}
	}

	@Override
	public void setEstadoAprovado(Orcamento orcamento) {
		throw new RuntimeException("Aprovado - Já está em estado aprovado");
	}

	@Override
	public void setEstadoReprovado(Orcamento orcamento) {
		orcamento.setEstadoCorrente(new Reprovado());
	}

	@Override
	public void setEstadoFinalizado(Orcamento orcamento) {
		orcamento.setEstadoCorrente(new Finalizado());
	}
}
