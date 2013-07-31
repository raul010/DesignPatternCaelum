package k19.component;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * <b>Component</b> <br>
 * Classes que comp�em o subsistema.
 * 
 * @author Raul
 */
public class PosVenda {
	public void agendaContato(String cliente, String produto) {
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DATE, 30);
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		String format = simpleDateFormat.format(calendar.getTime());
		System.out.println("Entrar em contato com " + cliente
				+ " sobre o produto " + produto + " no dia " + format);
	}
}
