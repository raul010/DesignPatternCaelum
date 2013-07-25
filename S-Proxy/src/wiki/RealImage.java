package wiki;

/**
 * on System A
 */
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