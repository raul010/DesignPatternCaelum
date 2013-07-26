package k19.client;

import k19.concreteimplementor.GeradorDeArquivoTXT;
import k19.implementor.GeradorDeArquivo;
import k19.refinedabstraction.Recibo;

public class TesteRecibo {
	public static void main(String[] args) {
		GeradorDeArquivo geradorDeArquivoTXT = new GeradorDeArquivoTXT();
		Recibo recibo = new Recibo("K19 Treinamentos", "Marcelo Martins", 1000,
				geradorDeArquivoTXT);
		recibo.geraArquivo();

		// ANTES DE APLICAR BRIDGE PARA TRABALHAR COM OUTROS FORMATOS ALÉM DE
		// TXT

		// Recibo recibo = new Recibo("K19 Treinamentos", "Marcelo Martins",
		// 1000);
		// recibo.geraArquivo();

	}
}
