/* GUIFactory example -- */
 
interface GUIFactory {
    public Button createButton();
}
 
class WinFactory implements GUIFactory {
    public Button createButton() {
        return new WinButton();
    }
}
class OSXFactory implements GUIFactory {
    public Button createButton() {
        return new OSXButton();
    }
}
 
interface Button {
    public void paint();
}
 
class WinButton implements Button {
    public void paint() {
        System.out.println("I'm a WinButton");
    }
}
class OSXButton implements Button {
    public void paint() {
        System.out.println("I'm an OSXButton");
    }
}
 
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
 
public class Cliente {
    public static void main(String[] args) {
        Application app = new Application(createOsSpecificFactory());
        
        app.chamaBotao();
        
    }
 
    //simula uma verificacao externa sobre qual OS
    public static GUIFactory createOsSpecificFactory() {
    	int sys = readFromConfigFile("OS_TYPE");
        if (sys == 0) return new WinFactory();
        else return new OSXFactory();
    }
    static int readFromConfigFile(String s) {
    	return 1;
    }
}