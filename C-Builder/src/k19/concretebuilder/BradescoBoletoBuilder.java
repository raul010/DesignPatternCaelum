package k19.concretebuilder;

import java.util.Calendar;

import k19.builder.BoletoBuilder;
import k19.concreteproduct.BradescoBoleto;
import k19.product.Boleto;

/**
 * <b>Concrete Builder</b>
 * <p>Constr�i um produto espec�fico implementando a interface Builder.
 */
public class BradescoBoletoBuilder implements BoletoBuilder {
	
	private String sacado;
	private String cedente;
	private double valor;
	private Calendar vencimento;
	private int nossoNumero;

	@Override
	public void buildSacado(String sacado) {
		this.sacado = sacado;
	}

	@Override
	public void buildCedente(String cedente) {
		this.cedente = cedente;
	}

	@Override
	public void buildValor(double valor) {
		this.valor = valor;
	}

	@Override
	public void buildVencimento(Calendar vencimento) {
		this.vencimento = vencimento;
	}

	@Override
	public void buildNossoNumero(int nossoNumero) {
		this.nossoNumero = nossoNumero;
	}

	@Override
	public Boleto getBoleto() {
		return new BradescoBoleto(sacado, cedente, valor, vencimento, nossoNumero);
	}
}
