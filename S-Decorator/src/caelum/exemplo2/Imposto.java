package caelum.exemplo2;
public abstract class Imposto {
	
	private Imposto impostoComposto;
	
	public Imposto(Imposto impostoComposto) {
		this.impostoComposto = impostoComposto;
	}
	
	public Imposto() {
		impostoComposto = null;
	}
	
	abstract double calcula(Orcamento orcamento);
	double calculoDoOutroImposto(Orcamento orcamento) {
		if (impostoComposto == null) return 0;
		return impostoComposto.calcula(orcamento);
	}
}