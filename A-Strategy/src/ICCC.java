
public class ICCC implements Imposto {
	@Override
	public double calcula(Orcamento orcamento) {
		
		double valor = orcamento.getValor();
		
		if(valor  < 1000.0) {
			return valor  * 0.05;
		}
		else if(orcamento.getValor() < 3000.0) {
			return valor  * 0.07;
		} else {
			return 30 + valor * 0.08;
		}
	}

}
