package wiki;

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
		show.setText("booking…");
	}
	void view() {
		btnView.setEnabled(false);
		btnSearch.setEnabled(true);
		btnBook.setEnabled(true);
		show.setText("viewing…");
	}
	void search() {
		btnSearch.setEnabled(false);
		btnView.setEnabled(true);
		btnBook.setEnabled(true);
		show.setText("searching…");
	}
}