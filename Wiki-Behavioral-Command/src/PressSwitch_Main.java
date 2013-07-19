
/* The test class or client */
class PressSwitch_Main {
	public static void main(String[] args) {
		Light lamp = new Light();
		Command switchUp = new FlipUpCommand(lamp);
		Command switchDown = new FlipDownCommand(lamp);

		Switch s = new Switch();
		
		args = new String[1];
		args[0] = "on";
		
		try {
			
			if (args[0].equalsIgnoreCase("ON")) s.storeAndExecute(switchUp);
			else if (args[0].equalsIgnoreCase("OFF")) s.storeAndExecute(switchDown);
			
			else System.out.println("Argument \"ON\" or \"OFF\" is required.");
		
		} catch (Exception e) { System.out.println("Arguments required."); }
	}
}