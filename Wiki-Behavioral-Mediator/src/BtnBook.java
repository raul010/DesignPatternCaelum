import java.awt.event.ActionListener;

import javax.swing.JButton;


@SuppressWarnings("serial")
// A concrete colleague
class BtnBook extends JButton implements Command {
	Mediator med;
	BtnBook(ActionListener al, Mediator m) {
		super("Book");
		addActionListener(al);
		med = m;
		med.register(this);
	}
	@Override
	public void execute() {
		med.book();
	}
}