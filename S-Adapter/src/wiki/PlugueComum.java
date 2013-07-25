package wiki;

class PlugueComum implements PlugueDoisPinos {
	@Override
	public void conectar(TomadaDoisPinos tomada) {
		System.out.println("[PLUGUE] Pegando energia el�trica de uma tomada de dois pinos.");
		tomada.fornecerEnergiaFraca();
	}
}