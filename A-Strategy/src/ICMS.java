
public class ICMS implements Imposto {

	@Override
	public double calcula(Orcamento orcamento) {
		return 50 + (orcamento.getValor() * 0.05);
	}

}
