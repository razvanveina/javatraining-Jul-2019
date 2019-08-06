package com.savnet.session05;

public class Params {
	public static void main(String[] args) {
		int value = 7;

		metoda(value);

		System.out.println(value);
	}

	private static void metoda(int value) {
		value = 10;
	}
}
