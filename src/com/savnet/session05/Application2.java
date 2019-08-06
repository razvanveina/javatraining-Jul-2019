package com.savnet.session05;

public class Application2 {
	static {
		System.out.println("1");
	}
	{
		System.out.println("3");
	}
	static {
		System.out.println("2");
	}
	{
		System.out.println("4");
	}

	public static void main(String[] args) {
		Application2 app = new Application2();
		Application2 app2 = new Application2();
		app.init();
		app.showMenu();
		app.finishApplication();
	}

	private void finishApplication() {
		// TODO Auto-generated method stub

	}

	private void showMenu() {
		// TODO Auto-generated method stub

	}

	private void init() {
		// TODO Auto-generated method stub

	}

}
