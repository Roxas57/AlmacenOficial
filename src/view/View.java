package view;

import java.util.Scanner;

import interfaces.IDrink;
import interfaces.IView;

public class View implements IView {

	@Override
	public void showMainMenu() {
		System.out.println();
	}

	@Override
	public int readMainMenuOption() {
		// TODO Auto-generated method stub
		return this.leeEntero();
	}

	@Override
	public void showSecundaryMenu() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int readSecundaryOption() {
		// TODO Auto-generated method stub
		return this.leeEntero();
	}

	@Override
	public String leeString() {
		Scanner t = new Scanner(System.in);
		return null;
	}

	@Override
	public float leeFloat() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int leeEntero() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void print(String s) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void print(IDrink d) {
		// TODO Auto-generated method stub
		
	}

}
