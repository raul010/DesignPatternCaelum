package wiki;

/**
 * esta clase torna poss�vel o uso da tomada de 2 pinos, no adaptador de 3 pinos
 */
class Adaptador implements TomadaTresPinos {
	private TomadaDoisPinos tomada;

	Adaptador(TomadaDoisPinos tomada) {
		this.tomada = tomada;
	}
	
	//este metodo implementado da TomadaTresPinos, encapsula a de dois. 
	//Ent�o embora seja de 3, o comportamento continua sendo de 2.
	@Override
	public void fornecerEnergiaForte() {
		tomada.fornecerEnergiaFraca();
	}
}