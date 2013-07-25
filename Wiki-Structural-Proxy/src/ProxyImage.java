
/**
 * on System B
 */ 
class ProxyImage implements Image {
	private RealImage image = null;
	private String filename = null;

	public ProxyImage(final String fileName) {
		filename = fileName;
	}

	public void displayImage() {
		if (image == null) {
			image = new RealImage(filename);
		}
		image.displayImage();
	}
}