package com.savnet.session05;

public class Params2 {
	public static void main(String[] args) {
		Value value = new Value(7);

		metoda(value);

		System.out.println(value.getValue());
	}

	private static void metoda(Value value) {
		value = new Value(10);
	}
}
