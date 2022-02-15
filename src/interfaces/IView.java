package interfaces;

public interface IView {
	void showMainMenu();
	int readMainMenuOption();
	void showSecundaryMenu();
	int readSecundaryOption();
	String leeString();
	float leeFloat();
	int leeEntero();
	void print(String s);
	void print(IDrink d);
}