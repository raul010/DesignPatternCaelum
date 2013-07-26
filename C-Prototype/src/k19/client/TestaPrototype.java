package k19.client;

import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

import k19.conreteprototype.Campanha;

/**
 * Classe que cria novos objetos a partir da interface definida por Prototype.
 */
public class TestaPrototype {
	public static void main(String[] args) throws CloneNotSupportedException {
		
		String nome = "K19";
		
		Calendar vencimento = Calendar.getInstance();
		vencimento.add(Calendar.DATE, 30);
		
		Set<String> hashSet = new HashSet<String>();
		hashSet.add("curso");
		hashSet.add("java");
		hashSet.add("k19");

		Campanha campanha = new Campanha(nome, vencimento, hashSet);
		System.out.println(campanha);

		Campanha clone = campanha.clone();
		System.out.println(clone);
		
		//São objetos completamente distintos
		campanha.setNome("Raul");
		System.out.println(campanha);
		System.out.println(clone);
	}
}
