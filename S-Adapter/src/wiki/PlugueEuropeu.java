package wiki;

class PlugueEuropeu implements PlugueTresPinos {
	@Override
	public void conectar(TomadaTresPinos tomada) {
		System.out.println("[PLUGUE] Pegando energia el�trica de uma tomada de tr�s pinos.");
		tomada.fornecerEnergiaForte();
	}

}