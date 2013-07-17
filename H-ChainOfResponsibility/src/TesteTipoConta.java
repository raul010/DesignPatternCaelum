
public class TesteTipoConta {
	
	
	public static void main(String[] args) {
		Requisicao requisicao = new Requisicao(Formato.CSV);
		
		Conta porcentagem = new Porcentagem();
		Conta xml = new XML();
		Conta pontoEVirgula = new SeparadoPorPontoEVirgula();
		Conta formatoDesconhecido = new FormatoDesconhecido();
		
		porcentagem.proximaConta(xml);
		xml.proximaConta(pontoEVirgula);
		pontoEVirgula.proximaConta(formatoDesconhecido);
		
		String imprime = porcentagem.verificaFormato(requisicao.getFormato());
		System.out.println(imprime);
	}

}
