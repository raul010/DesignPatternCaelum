package k19.teste;

import k19.builder.BoletoBuilder;
import k19.concretebuilder.ItauBoletoBuilder;
import k19.director.GeradorDeBoleto;
import k19.product.Boleto;

public class TesteGeradorDeBoleto {
	public static void main(String[] args) {
		BoletoBuilder boletoBuilder = new ItauBoletoBuilder();
		GeradorDeBoleto geradorDeBoleto = new GeradorDeBoleto(boletoBuilder);
		Boleto boleto = geradorDeBoleto.geraBoleto();
		System.out.println(boleto);
	}
}
