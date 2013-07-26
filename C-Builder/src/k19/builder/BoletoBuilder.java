package k19.builder;

import java.util.Calendar;

import k19.product.Boleto;

/**
 *<b>Builder</b>
 *<br>Interface que define os passos para a criação de um produto.
 */
public interface BoletoBuilder {
	void buildSacado(String sacado);
	void buildCedente(String cedente);
	void buildValor( double valor);
	void buildVencimento(Calendar vencimento);
	void buildNossoNumero( int nossoNumero);
	Boleto getBoleto();
}