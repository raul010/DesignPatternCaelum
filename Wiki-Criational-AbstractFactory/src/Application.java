
class Application {
	GUIFactory factory;
	
	public Application(GUIFactory factory) {
		this.factory = factory;
    }
	public void chamaBotao() {
	    Button button = factory.createButton();
	    button.paint();
	}
	//outros metodos da OS especifica....
    
}