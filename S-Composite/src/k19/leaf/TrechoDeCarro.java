package k19.leaf;

import k19.component.Trecho;

/**
 * <b>Leaf</b> <br>
 * Define os elementos básicos da composição, isto é, aqueles que não são
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
		System.out.println("Vá de carro: ");
		System.out.println(this.direcao);
		System.out.println("A distância percorrida será de: "
				+ this.distancia + " metros.");
	}
}
