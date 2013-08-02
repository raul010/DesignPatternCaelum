package k19.concretecommand;

import k19.command.Comando;
import k19.receiver.Player;

/**
 * <b>ConcreteCommand</b> <br>
 * Classe que implementa Command e modela uma operação específica do Receiver.
 * 
 * @author Raul
 */
public class TocaMusicaComando implements Comando {
	private Player player;
	private String file;

	public TocaMusicaComando(Player player, String file) {
		this.player = player;
		this.file = file;
	}

	public void executa() {
		try {
			this.player.play(this.file);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
