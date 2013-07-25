package wiki;
//Possui o objetivo de “converter a interface de uma classe em outra interface,
//esperada pelos clientes. O Adapter permite que classes
//com interaces imcompatíveis trabalhem em conjunto – o que, de outra forma, seria impossível.”

public class Teste {

	public static void main(String[] args) {
		TomadaDoisPinos tomada = new TomadaComum();
		PlugueTresPinos plugue = new PlugueEuropeu();
		
		//adapter permitir a tomada de dois pinos, se passar por uma de três
		Adaptador adapter = new Adaptador(tomada);
		//aqui o adapter é um de 3 pinos (ou seja, se passando por um de 3), porém seu comportamento continuará sendo de 2
		plugue.conectar(adapter);
	}
}