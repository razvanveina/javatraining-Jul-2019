package com.savnet.session05;

public class Person {
	private String name;
	private int age;
	public static int counter = 0;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public static void showCounter() {
		System.out.println(counter);
		// toString();
	}

	@Override
	public String toString() {
		showCounter();
		return "" + name + age;
	}

}
