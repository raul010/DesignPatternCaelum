import java.util.ArrayList;
import java.util.List;

/* the Invoker class */
class Switch {
	private List<Command> history = new ArrayList<Command>();

	public void storeAndExecute(Command cmd) {
		this.history.add(cmd); // optional
		cmd.execute();
	}
}