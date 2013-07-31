package k19.prototype;

/**
 * A apostila faz o clone simples. Ela implementa manualmente o clone do objeto
 * e inicializa seus atributos de forma id�ntica aos do objeto original.
 * Eu modifiquei, por�m ficou igual ao exemplo da Wiki.
 * 
 * <p><b>Abstra��o dos objetos que possuem a capacidade de se auto copiar.</b>
 *
 * @param <T>
 */
public abstract class Prototype<T> implements Cloneable {
	public T clone() throws CloneNotSupportedException {
		return (T) super.clone();
	}
}
