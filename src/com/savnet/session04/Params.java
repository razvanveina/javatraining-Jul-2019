package com.savnet.session04;

public class Params {
	public static void main(String[] args) {
		int n = 7;
		method(n);
		method(5);
		method(10 / 2);
		method(2);
	}

	private static void method(int a) {
		System.out.println(a);
	}
}
