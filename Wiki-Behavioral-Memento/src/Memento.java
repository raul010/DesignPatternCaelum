
class Memento {
	private final String state;
	
	public Memento(String stateToSave) {
		state = stateToSave;
	}
	
	public String getSavedState() {
		return state;
	}
}