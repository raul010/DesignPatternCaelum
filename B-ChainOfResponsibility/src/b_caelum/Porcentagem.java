package b_caelum;

public class Porcentagem extends Conta{
	
	@Override
	public String verificaFormato(Formato formato) {
		if(Formato.PORCENTO.equals(formato)) {
			return "Porcento";
		} else {
			return super.proxima.verificaFormato(formato);
		}
	}
}