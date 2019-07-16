package com.savnet.session01;

public class VariablesThing {
	static final double CONSTANTA_PI = 3.1415;

	int variabilaMembru;
	static int variabilaMembruStatica;

	public static void main(String[] args) {
		// CONSTANTA_PI = 0;
		System.out.println(variabilaMembruStatica);
		int variabilaLocala = 0;
		System.out.println(variabilaLocala);
		metoda2(6);
	}

	public static void metoda2(int parametru) {
		int variabilaLocala = 1;
		System.out.println(variabilaLocala);
		System.out.println(parametru);
	}
}
