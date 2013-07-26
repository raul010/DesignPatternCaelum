package k19.product;

import java.util.Calendar;
/**
 * <b>Product</b>
 * <br>Define os objetos que devem ser construídos pelos Builders.
 */
public interface Boleto {
	String getSacado();
	String getCedente();
	double getValor();
	Calendar getVencimento();
	int getNossoNumero();
	String toString();
}