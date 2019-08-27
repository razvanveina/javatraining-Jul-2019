package com.savnet.session08;

public class Factorial {
	public static void main(String[] args) {
//		System.out.println(factorial(5));
		System.out.println(f(5));
	}

	private static int factorial(int n) {
		int prod = 1;
		for (int i = 1; i <= n; i++) {
			prod *= i;
		}
		return prod;
	}

	private static int f(int n) {
		if (n == 0) {
			return 1;
		}
		return f(n - 1) * n;
	}
}
