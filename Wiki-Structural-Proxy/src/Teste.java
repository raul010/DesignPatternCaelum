interface Image {
	void displayImage();
}
// on System A
class RealImage implements Image {
	private String filename = null;

	public RealImage(final String fileName) {
		filename = fileName;
		loadImageFromDisk();
	}

	private void loadImageFromDisk() {
		System.out.println("Loading   " + filename);
	}

	public void displayImage() {
		System.out.println("Displaying " + filename);
	}
}
// on System B
class ProxyImage implements Image {
	private RealImage image = null;
	private String filename = null;

	public ProxyImage(final String fileName) {
		filename = fileName;
	}

	public void displayImage() {
		//se existir um grande numero de objetos a serem criados
		//o padrao flyweight pode ser implementado:
		if (image == null) {
			image = new RealImage(filename);
		}
		image.displayImage();
	}
}

public class Teste {

	public static void main(String[] args) {
        final Image image1 = new ProxyImage("HiRes_10MB_Photo1");
        final Image image2 = new ProxyImage("HiRes_10MB_Photo2");     
 
        image1.displayImage(); // loading necessary
        image1.displayImage(); // loading unnecessary
        image2.displayImage(); // loading necessary
        image2.displayImage(); // loading unnecessary
        image1.displayImage(); // loading unnecessary
    }
}