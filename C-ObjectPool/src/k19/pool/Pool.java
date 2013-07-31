package k19.pool;

/**
 * Interface dos objetos que controlam a aquisi��o e a libera��o dos Produtos.
 * @param <T>
 * @author Raul
 */
public interface Pool<T> {
	T adquirir();

	void liberar(T t);
}
