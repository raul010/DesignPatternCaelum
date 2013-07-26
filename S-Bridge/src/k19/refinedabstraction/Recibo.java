package k19.refinedabstraction;

import k19.abstraction.Documento;
import k19.implementor.GeradorDeArquivo;

/**
 * <b>Refined Abstraction</b> <br>
 * Uma implementação particular do Abstraction que delega a um Implementor a
 * realização de determindas tarefas.
 * 
 * @author Raul
 * 
 */
public class Recibo implements Documento {
	private String emissor;
	private String favorecido;
	private double valor;
	private GeradorDeArquivo geradorDeArquivo;

	public Recibo(String emissor, String favorecido, double valor,
			GeradorDeArquivo geradorDeArquivo) {
		this.emissor = emissor;
		this.favorecido = favorecido;
		this.valor = valor;
		this.geradorDeArquivo = geradorDeArquivo;
	}

	public void geraArquivo() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("Recibo: ");
		buffer.append("\n");
		buffer.append("Empresa: " + this.emissor);
		buffer.append("\n");
		buffer.append("Cliente: " + this.favorecido);
		buffer.append("\n");
		buffer.append("Valor: " + this.valor);
		buffer.append("\n");
		this.geradorDeArquivo.gera(buffer.toString());
	}
	
	// ANTES DE APLICAR BRIDGE PARA TRABALHAR COM OUTROS FORMATOS ALÉM DE TXT
	
	// private String emissor;
	// private String favorecido;
	// private double valor;
	//
	// public Recibo(String emissor, String favorecido, double valor) {
	// this.emissor = emissor;
	// this.favorecido = favorecido;
	// this.valor = valor;
	// }
	//
	// public void geraArquivo() {
	// try {
	// PrintStream saida = new PrintStream("recibo.txt");
	// saida.println("Recibo: ");
	// saida.println("Empresa: " + this.emissor);
	// saida.println("Cliente: " + this.favorecido);
	// saida.println("Valor: " + this.valor);
	// } catch (FileNotFoundException e) {
	// e.printStackTrace();
	// }
	// }
}
