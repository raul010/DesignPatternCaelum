//UML e dicas: https://docs.google.com/viewer?a=v&q=cache:yxgbwAHyHL4J:www.i2p.com.br/ricardo/ppadapter.pdf+&hl=pt-BR&gl=br&pid=bl&srcid=ADGEEShHhz2X0-xuznNuWBwWbMpU0MX0AKWIn6qIZ1vUm8yQ2frw5Vtovvo9Sk2WBPaotVCu3JhLaeyNIpcn0ykGbpZKFF9TB1CCw515HQ0XclD3XteQjYLhlFljCKAecJ3ZANGs1DtN&sig=AHIEtbRhEjFNLpQdmnVV3ZKfpH8ll2Kt0g
//Possui o objetivo de �converter a interface de uma classe em outra interface, esperada pelos clientes. O Adapter permite que classes
//com interaces imcompat�veis trabalhem em conjunto � o que, de outra forma, seria imposs�vel.�

interface TomadaTresPinos {
	void fornecerEnergiaForte();
}
interface TomadaDoisPinos {
	void fornecerEnergiaFraca();
}
interface PlugueTresPinos {
	void conectar(TomadaTresPinos tomada);
}
interface PlugueDoisPinos {
	void conectar(TomadaDoisPinos tomada);
}

class TomadaEuropeia implements TomadaTresPinos {
	@Override
	public void fornecerEnergiaForte() {
		System.out.println("[TOMADA] Fornecendo energia para um plugue de tr�s pinos!");
	}
}

class TomadaComum implements TomadaDoisPinos {
	@Override
	public void fornecerEnergiaFraca() {
		System.out.println("[TOMADA] Fornecendo energia para um plugue de dois pinos!");
	}

}

class PlugueEuropeu implements PlugueTresPinos {
	@Override
	public void conectar(TomadaTresPinos tomada) {
		System.out.println("[PLUGUE] Pegando energia el�trica de uma tomada de tr�s pinos.");
		tomada.fornecerEnergiaForte();
	}

}

class PlugueComum implements PlugueDoisPinos {
	@Override
	public void conectar(TomadaDoisPinos tomada) {
		System.out.println("[PLUGUE] Pegando energia el�trica de uma tomada de dois pinos.");
		tomada.fornecerEnergiaFraca();
	}
}
//esta clase torna poss�vel o uso da tomada de 2 pinos, no adaptador de 3 pinos
class Adaptador implements TomadaTresPinos {
	private TomadaDoisPinos tomada;

	Adaptador(TomadaDoisPinos tomada) {
		this.tomada = tomada;
	}
	
	//este metodo implementado da TomadaTresPinos, encapsula a de dois. Ent�o embora seja de 3, o comportamento continua sendo de 2.
	@Override
	public void fornecerEnergiaForte() {
		tomada.fornecerEnergiaFraca();
	}
}
public class Teste {

	public static void main(String[] args) {
		TomadaDoisPinos tomada = new TomadaComum();
		PlugueTresPinos plugue = new PlugueEuropeu();
		
		//adapter permitira tomada de dois pinos, se passar por uma de tr�s
		Adaptador adapter = new Adaptador(tomada);
		//aqui o adapter � um de 3 pinos (ou seja, se passando por um de 3), por�m seu comportamento continuar� sendo de 2
		plugue.conectar(adapter);
	}
}