import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

//Colleague interface
interface Command {
	void execute();
}

// Concrete mediator
class Mediator {
	BtnView btnView;
	BtnSearch btnSearch;
	BtnBook btnBook;
	LblDisplay show;
	// ....
	void register(BtnView v) {
		btnView = v;
	}
	void register(BtnSearch s) {
		btnSearch = s;
	}
	void register(BtnBook b) {
		btnBook = b;
	}
	void registerDisplay(LblDisplay d) {
		show = d;
	}
	void book() {
		btnBook.setEnabled(false);
		btnView.setEnabled(true);
		btnSearch.setEnabled(true);
		show.setText("booking�");
	}
	void view() {
		btnView.setEnabled(false);
		btnSearch.setEnabled(true);
		btnBook.setEnabled(true);
		show.setText("viewing�");
	}
	void search() {
		btnSearch.setEnabled(false);
		btnView.setEnabled(true);
		btnBook.setEnabled(true);
		show.setText("searching�");
	}
}

// A concrete colleague
@SuppressWarnings("serial")
class BtnView extends JButton implements Command {
	Mediator med;
	BtnView(ActionListener al, Mediator m) {
		super("View");
		addActionListener(al);
		//this faz refer�ncia ao med
		med = m;
		//med faz refer�ncia ao this
		med.register(this);
	}
	@Override
	public void execute() {
		med.view();
	}
}

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

@SuppressWarnings("serial")
class LblDisplay extends JLabel {
	Mediator med;
	LblDisplay(Mediator m) {
		super("Just start�");
		med = m;
		med.registerDisplay(this);
		setFont(new Font("Arial", Font.BOLD, 24));
	}
}

@SuppressWarnings("serial")
class MediatorDemo extends JFrame implements ActionListener {
	 
    Mediator med = new Mediator();
 
    MediatorDemo() {
        JPanel p = new JPanel();
        p.add(new BtnView(this, med));
        p.add(new BtnBook(this, med));
        p.add(new BtnSearch(this, med));
        getContentPane().add(new LblDisplay(med), "North");
        getContentPane().add(p, "South");
        setSize(400, 200);
        setVisible(true);
    }
 
    @Override
	public void actionPerformed(ActionEvent ae) {
        Command comd = (Command) ae.getSource();
        comd.execute();
    }
 
    public static void main(String[] args) {
        new MediatorDemo();
    }
 
}