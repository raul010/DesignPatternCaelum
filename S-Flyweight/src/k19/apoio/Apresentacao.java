package k19.apoio;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe que apenas modela uma Apresenta��o.
 * @author Raul
 */
public class Apresentacao {
	private List<Slide> slides = new ArrayList<Slide>();

	public void adicionaSlide(Slide slide) {
		slides.add(slide);
	}

	public void imprime() {
		for (Slide slide : this.slides) {
			slide.imprime();
			System.out.println();
		}
	}
}
