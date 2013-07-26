package k19.teste;

import k19.concretepool.FuncionarioPool;
import k19.pool.Pool;
import k19.product.Funcionario;

public class TestaFuncionarioPool {
	public static void main(String[] args) {
		Pool<Funcionario> funcionarioPool = new FuncionarioPool();
		Funcionario funcionario = funcionarioPool.adquirir();
		
		while (funcionario != null) {
			System.out.println(funcionario.getNome());
			funcionario = funcionarioPool.adquirir();
		}
	}
}
