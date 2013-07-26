package k19.client;

import k19.adapter.ControleDePontoAdapter;
import k19.suport.Funcionario;
import k19.target.ControleDePonto;

public class TesteControleDePonto {
	public static void main(String[] args) throws InterruptedException {
		//Descomentar para Controle de ponto sem adapter
		
//		ControleDePonto controleDePonto = new ControleDePonto();
//		Funcionario funcionario = new Funcionario("Marcelo Martins");
//		controleDePonto.registraEntrada(funcionario);
//		Thread.sleep(3000);
//		controleDePonto.registraSaida(funcionario);
		
		//Controle de ponto com Adapter
		
		ControleDePontoAdapter controleDePonto = new ControleDePontoAdapter();
		Funcionario funcionario = new Funcionario("Marcelo Martins");
		controleDePonto.registraEntrada(funcionario);
		Thread.sleep(3000);
		controleDePonto.registraSaida(funcionario);
		
	}
}
