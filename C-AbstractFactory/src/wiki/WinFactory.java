package wiki;

class WinFactory implements GUIFactory {
    public Button createButton() {
        return new WinButton();
    }
}