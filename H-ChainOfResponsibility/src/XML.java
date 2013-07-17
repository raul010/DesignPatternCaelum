
public class XML extends Conta {
	
	@Override
	public String verificaFormato(Formato formato) {
		if(Formato.XML.equals(formato)) {
			return "XML";
		} else {
			return super.proxima.verificaFormato(formato);
		}
	}
}