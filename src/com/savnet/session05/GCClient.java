package com.savnet.session05;

public class GCClient {
	public static void main(String[] args) {
		Person p = new Person("ion", 20);
		p = null;

		metoda(p);

		Person[] arr = new Person[5];
		arr[0] = p;
		p = arr[1];
		arr = null;
///////////////////////// ?
	}

	private static void metoda(Person p) {

		for (int i = 0; i < 3; i++) {
			String s = new String("" + i);
			System.out.println(s);
		}
/////////////////////////// 3
		p = null;
/////////////////////////// ?		

	}
}
