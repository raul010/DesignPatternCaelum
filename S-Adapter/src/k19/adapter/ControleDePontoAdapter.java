package k19.adapter;

import k19.adaptee.ControleDePontoNovo;
import k19.suport.Funcionario;
import k19.target.ControleDePonto;

public class ControleDePontoAdapter extends ControleDePonto {

	private ControleDePontoNovo controleDePontoNovo;

	public ControleDePontoAdapter() {
		this.controleDePontoNovo = new ControleDePontoNovo();
	}

	public void registraEntrada(Funcionario f) {
		this.controleDePontoNovo.registra(f, true);
	}

	public void registraSaida(Funcionario f) {
		this.controleDePontoNovo.registra(f, false);
	}

}
