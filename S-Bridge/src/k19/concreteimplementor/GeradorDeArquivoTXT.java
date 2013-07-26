package k19.concreteimplementor;

import java.io.FileNotFoundException;
import java.io.PrintStream;

import k19.implementor.GeradorDeArquivo;

/**
 * <b>Concrete Implementor</b>
 * <br>(GeradorDeArquivoTXT, GeradorDeArquivoHTML) uma implementação específica do Implementor
 * @author Raul
 */
public class GeradorDeArquivoTXT implements GeradorDeArquivo{
	public void gera(String conteudo) {
		PrintStream saida;
		try {
			saida = new PrintStream("arquivo.txt");
			saida.println(conteudo);
			saida.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}