package com.savnet.session06;

public class TestEA3 {
	public static void main(String[] args) {
		boolean result = isPrime(1);
		System.out.println(result);
	}

	private static boolean isPrime(int n) {
		for (int i = 2; i < n / 2; i++) {
			if (n % i == 0) {
				return false;
			}
		}

		return true;
	}
}
