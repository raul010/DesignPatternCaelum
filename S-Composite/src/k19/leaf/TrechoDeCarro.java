package k19.leaf;

import k19.component.Trecho;

/**
 * <b>Leaf</b> <br>
 * Define os elementos b�sicos da composi��o, isto �, aqueles que n�o s�o
 * formados por outros Components.
 * 
 * @author Raul
 */
public class TrechoDeCarro implements Trecho {
	private String direcao;
	private double distancia;

	public TrechoDeCarro(String direcao, double distancia) {
		this.direcao = direcao;
		this.distancia = distancia;
	}

	public void imprime() {
		System.out.println("V� de carro: ");
		System.out.println(this.direcao);
		System.out.println("A dist�ncia percorrida ser� de: "
				+ this.distancia + " metros.");
	}
}
