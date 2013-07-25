package a_caelum.testes;

import a_caelum.estados.Orcamento;

public class TestaDescontoExtra {
	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(500.0);
		
		orcamento.aplicaDescontoExtra();
		System.out.println(orcamento.getValor());
		
		orcamento.aprova();
		orcamento.aplicaDescontoExtra();
		System.out.println(orcamento.getValor());
		
		orcamento.reprova();
		orcamento.aplicaDescontoExtra();
		System.out.println(orcamento.getValor());
		
	}
}
