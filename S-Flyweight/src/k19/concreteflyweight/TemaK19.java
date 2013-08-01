package k19.concreteflyweight;

import java.util.Arrays;

import k19.flyweight.TemaFlyweight;

/**
 * <b>Concrete Flyweight</b> <br>
 * Tipo específico de Flyweight.
 * @author Raul
 */
public class TemaK19 implements TemaFlyweight {
	public void imprime(String titulo, String texto) {
		System.out
				.println("########## " + titulo.toUpperCase() + " ##########");
		System.out.println(texto);
		char[] rodapeE = new char[(int) Math.floor((6 + titulo.length()) / 2.0)];
		char[] rodapeD = new char[(int) Math.ceil((6 + titulo.length()) / 2.0)];
		Arrays.fill(rodapeE, '#');
		Arrays.fill(rodapeD, '#');
		System.out.println(new String(rodapeE) + " www.k19.com.br "
				+ new String(rodapeD));
	}
}
