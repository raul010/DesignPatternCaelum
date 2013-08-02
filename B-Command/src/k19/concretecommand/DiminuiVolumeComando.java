package k19.concretecommand;

import k19.command.Comando;
import k19.receiver.Player;

/**
 * <b>ConcreteCommand</b> <br>
 * Classe que implementa Command e modela uma operação específica do Receiver.
 * 
 * @author Raul
 */
public class DiminuiVolumeComando implements Comando {
	private Player player;
	private int levels;

	public DiminuiVolumeComando(Player player, int levels) {
		this.player = player;
		this.levels = levels;
	}

	public void executa() {
		this.player.decreaseVolume(this.levels);
	}
}
