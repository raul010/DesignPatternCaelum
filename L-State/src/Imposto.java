public abstract class Imposto {
	
	Imposto impostoComposto;
	
	public Imposto(Imposto impostoComposto) {
		this.impostoComposto = impostoComposto;
	}
	
	public Imposto() {}
	
	abstract double calcula(Orcamento orcamento);
	double calculoDoOutroImposto(Orcamento orcamento) {
		if (impostoComposto == null) return 0;
		return impostoComposto.calcula(orcamento);
	}
}