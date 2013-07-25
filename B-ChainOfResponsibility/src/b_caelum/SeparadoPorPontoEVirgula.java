package b_caelum;

public class SeparadoPorPontoEVirgula extends Conta {

	@Override
	public String verificaFormato(Formato formato) {
		if(Formato.CSV.equals(formato)) {
			return "SeparadoPorPontoEVirgula";
		} else {
			return super.proxima.verificaFormato(formato);
		}
	}
}
