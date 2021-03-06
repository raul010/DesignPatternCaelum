package k19.leaf;

import k19.component.Trecho;

/**
 * <b>Leaf</b> <br>
 * Define os elementos b�sicos da composi��o, isto �, aqueles que n�o s�o
 * formados por outros Components.
 * 
 * @author Raul
 */
public class TrechoAndando implements Trecho {
	private String direcao;
	private double distancia;

	public TrechoAndando(String direcao, double distancia) {
		this.direcao = direcao;
		this.distancia = distancia;
	}

	public void imprime() {
		System.out.println("V� Andando: ");
		System.out.println(this.direcao);
		System.out.println("A dist�ncia percorrida ser� de: "
				+ this.distancia + " metros.");
	}

}
