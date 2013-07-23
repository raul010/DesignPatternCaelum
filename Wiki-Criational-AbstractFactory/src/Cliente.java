 
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