package com.savnet.session02;

import java.util.Scanner;

public class IfThing {
	public static void main(String[] args) {
		System.out.println("Hello world");
		System.out.print("Your name: ");

		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();

		if (!name.endsWith("a")) {
			System.out.println("Salut, " + name);
		}

		System.out.println("Ceau, " + name);

		scanner.close();
	}
}
