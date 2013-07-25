package b_caelum;

public class TesteDescontosExtra {
	
	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(500.0);
		
		System.out.println(orcamento.getValor());
		
		orcamento.aplicaDescontoExtra();
		System.out.println(orcamento.getValor());

		orcamento.aprova();
		orcamento.aplicaDescontoExtra();
		System.out.println(orcamento.getValor());

		
		try {
			orcamento.aplicaDescontoExtra();
			System.out.println(orcamento.getValor());
		} catch (RuntimeException e) { e.printStackTrace();}
		
		orcamento.reprova();
		try {
			orcamento.aplicaDescontoExtra();
			System.out.println(orcamento.getValor());
		} catch (RuntimeException e) { e.printStackTrace();}
		
		orcamento.finaliza();
		try {
			orcamento.aplicaDescontoExtra();
			System.out.println(orcamento.getValor());
		} catch (RuntimeException e) { e.printStackTrace();}

		try {
			orcamento.aprova();
			System.out.println(orcamento.getValor());
		} catch (RuntimeException e) { e.printStackTrace();}
		
		
	}
}