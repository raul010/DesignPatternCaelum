package k19.component;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * <b>Component</b> <br>
 * Classes que comp�em o subsistema.
 * 
 * @author Raul
 */
public class Estoque {
	public void enviaProduto(String produto, String enderecoDeEntrega, String notaFiscal) {
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DATE, 2);
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(
				"dd/MM/yyyy");
		String format = simpleDateFormat.format(calendar.getTime());
		System.out.println("O produto " + produto
				+ "ser� entregue no endere�o " + enderecoDeEntrega
				+ " at� as 18h do dia " + format
				+ " com NF " + notaFiscal);
	}
}
