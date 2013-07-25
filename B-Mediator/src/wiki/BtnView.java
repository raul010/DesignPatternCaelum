package wiki;
import java.awt.event.ActionListener;

import javax.swing.JButton;


// A concrete colleague
@SuppressWarnings("serial")
class BtnView extends JButton implements Command {
	Mediator med;
	BtnView(ActionListener al, Mediator m) {
		super("View");
		addActionListener(al);
		
		med = m;
		
		med.register(this);
	}
	@Override
	public void execute() {
		med.view();
	}
}