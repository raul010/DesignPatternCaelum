package k19.pool;

/**
 * Interface dos objetos que controlam a aquisição e a liberação dos Produtos.
 * @param <T>
 * @author Raul
 */
public interface Pool<T> {
	T adquirir();

	void liberar(T t);
}
