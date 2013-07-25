package wiki;

/* the Command for turning off the light - ConcreteCommand #2 */
class FlipDownCommand implements Command {
	private Light theLight;

	public FlipDownCommand(Light light) {
		this.theLight = light;
	}

	public void execute() {
		theLight.turnOff();
	}
}