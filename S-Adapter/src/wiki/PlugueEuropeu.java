package wiki;

class PlugueEuropeu implements PlugueTresPinos {
	@Override
	public void conectar(TomadaTresPinos tomada) {
		System.out.println("[PLUGUE] Pegando energia elétrica de uma tomada de três pinos.");
		tomada.fornecerEnergiaForte();
	}

}