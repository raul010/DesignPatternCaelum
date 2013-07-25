package wiki;
import java.awt.event.ActionListener;

import javax.swing.JButton;


// A concrete colleague
@SuppressWarnings("serial")
class BtnSearch extends JButton implements Command {
	Mediator med;
	BtnSearch(ActionListener al, Mediator m) {
		super("Search");
		addActionListener(al);
		med = m;
		med.register(this);
	}
	@Override
	public void execute() {
		med.search();
	}
}