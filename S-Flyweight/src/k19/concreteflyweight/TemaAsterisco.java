package k19.concreteflyweight;

import java.util.Arrays;

import k19.flyweight.TemaFlyweight;

/**
 * <b>Concrete Flyweight</b> <br>
 * Tipo espec�fico de Flyweight.
 * @author Raul
 */
public class TemaAsterisco implements TemaFlyweight {
	public void imprime(String titulo, String texto) {
		System.out.println("********** " + titulo + " **********");
		System.out.println(texto);
		char[] rodape = new char[22 + titulo.length()];
		Arrays.fill(rodape, '*');
		System.out.println(rodape);
	}
}
