
public class FormatoDesconhecido extends Conta{

	@Override
	String verificaFormato(Formato formato) {
		throw new RuntimeException("Formato Inexistente");
	}

}
