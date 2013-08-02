package k19.client;

import k19.concretecommand.AumentaVolumeComando;
import k19.concretecommand.DiminuiVolumeComando;
import k19.concretecommand.TocaMusicaComando;
import k19.invoker.ListaDeComandos;
import k19.receiver.Player;

/**
 * <b>Client</b> <br>
 * Instancia os Commands associando-os ao Receiver e armazena-os no Invoker.
 * 
 * @author Raul
 */
public class TestaListaDeComandos {
	public static void main(String[] args) {
		Player player = new Player();
		
		ListaDeComandos listaDeComandos = new ListaDeComandos();
		
		listaDeComandos.adiciona(new TocaMusicaComando(player, "musica1.mp3"));
		listaDeComandos.adiciona(new AumentaVolumeComando(player, 3));
		listaDeComandos.adiciona(new TocaMusicaComando(player, "musica2.mp3"));
		listaDeComandos.adiciona(new DiminuiVolumeComando(player, 3));
		listaDeComandos.adiciona(new TocaMusicaComando(player, "musica3.mp3"));
		
		listaDeComandos.executa();
	}
}
