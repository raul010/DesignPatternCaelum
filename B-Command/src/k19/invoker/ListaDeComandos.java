package k19.invoker;

import java.util.ArrayList;
import java.util.List;

import k19.command.Comando;

/**
 * <b>Invoker</b> <br>
 * Classe que armazena os Commands que devem ser executados.
 * 
 * @author Raul
 */
public class ListaDeComandos {
	private List<Comando> comandos = new ArrayList<Comando>();

	public void adiciona(Comando comando) {
		this.comandos.add(comando);
	}

	public void executa() {
		for (Comando comando : this.comandos) {
			comando.executa();
		}
	}
}
