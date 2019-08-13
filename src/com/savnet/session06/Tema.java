package com.savnet.session06;

/**
 * Sa se implementeze o metoda care evalueaza o expresie primita ca parametru
 * intr-un String. Expresia consta in 2 operanzi numerici intregi separati de un
 * operator care poate fi +,-,/,*
 */
public class Tema {
	public static void main(String[] args) {
		int nr = Integer.parseInt("123"); // pentru transformarea unui String in numar

		int result = evaluate("20 + 15");
		System.out.println(result); // trebuie sa afiseze 35
	}

	private static int evaluate(String exp) {
		return 0;
	}
}
