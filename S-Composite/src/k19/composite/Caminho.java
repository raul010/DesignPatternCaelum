package k19.composite;

import java.util.ArrayList;
import java.util.List;

import k19.component.Trecho;

/**
 * <b>Compiste</b> <br>
 * Define os Components que são formados por outros Components.
 * @author Raul
 */
public class Caminho implements Trecho {
	private List<Trecho> trechos;

	public Caminho() {
		this.trechos = new ArrayList<Trecho>();
	}

	public void adiciona(Trecho trecho) {
		this.trechos.add(trecho);
	}

	public void remove(Trecho trecho) {
		this.trechos.remove(trecho);
	}

	public void imprime() {
		for (Trecho trecho : this.trechos) {
			trecho.imprime();
		}
	}
}
