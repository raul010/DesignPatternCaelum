package wiki;
//Possui o objetivo de �converter a interface de uma classe em outra interface,
//esperada pelos clientes. O Adapter permite que classes
//com interaces imcompat�veis trabalhem em conjunto � o que, de outra forma, seria imposs�vel.�

public class Teste {

	public static void main(String[] args) {
		TomadaDoisPinos tomada = new TomadaComum();
		PlugueTresPinos plugue = new PlugueEuropeu();
		
		//adapter permitir a tomada de dois pinos, se passar por uma de tr�s
		Adaptador adapter = new Adaptador(tomada);
		//aqui o adapter � um de 3 pinos (ou seja, se passando por um de 3), por�m seu comportamento continuar� sendo de 2
		plugue.conectar(adapter);
	}
}