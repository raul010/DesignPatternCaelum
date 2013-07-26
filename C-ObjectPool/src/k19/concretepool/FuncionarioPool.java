package k19.concretepool;

import java.util.ArrayList;
import java.util.List;

import k19.pool.Pool;
import k19.product.Funcionario;

/**
 * Implementação particular de um Pool que gerencia um Produto específico
 * @author Raul
 */
public class FuncionarioPool implements Pool<Funcionario> {
	private List<Funcionario> funcionarios;

	public FuncionarioPool() {
		this.funcionarios = new ArrayList<Funcionario>();
		this.funcionarios.add(new Funcionario("Marcelo Martins"));
		this.funcionarios.add(new Funcionario("Rafael Cosentino"));
		this.funcionarios.add(new Funcionario("Jonas Hirata"));
	}

	public Funcionario adquirir() {
		if (this.funcionarios.size() > 0) {
			return this.funcionarios.remove(0);
		} else {
			return null;
		}
	}

	public void liberar(Funcionario funcionario) {
		this.funcionarios.add(funcionario);
	}
}
