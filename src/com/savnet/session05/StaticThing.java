package com.savnet.session05;

public class StaticThing {
	public static final int CONSTANTA = 0;

	public static void main(String[] args) {
		Integer.parseInt("123");

		Person p1 = new Person("ion", 123);
		Person p2 = new Person("ion2", 13);

		Person.counter++;
		p1.counter++;
		p2.counter++;

		System.out.println(Person.counter);

		Person.showCounter();

		p1.toString();
	}
}
