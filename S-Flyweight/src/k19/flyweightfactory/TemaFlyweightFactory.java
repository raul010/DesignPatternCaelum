package k19.flyweightfactory;

import java.util.HashMap;
import java.util.Map;

import k19.concreteflyweight.TemaAsterisco;
import k19.concreteflyweight.TemaHifen;
import k19.concreteflyweight.TemaK19;
import k19.flyweight.TemaFlyweight;

/**
 * <b>Flyweight Factory</b> <br>
 * Classe que controla a criação e recuperação de Flyweights
 * 
 * @author Raul
 */
public class TemaFlyweightFactory {
	private static Map<Class<? extends TemaFlyweight>, TemaFlyweight> temas = 
			new HashMap<Class<? extends TemaFlyweight>, TemaFlyweight>();
	public static final Class<TemaAsterisco> ASTERISCO = TemaAsterisco.class;
	public static final Class<TemaHifen> HIFEN = TemaHifen.class;
	public static final Class<TemaK19> K19 = TemaK19.class;

	public static TemaFlyweight getTema(Class<? extends TemaFlyweight> clazz) {
		if (!temas.containsKey(clazz)) {
			try {
				temas.put(clazz, clazz.newInstance());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return temas.get(clazz);
	}
}
