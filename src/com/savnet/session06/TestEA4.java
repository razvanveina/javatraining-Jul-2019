package com.savnet.session06;

public class TestEA4 {
	public static void main(String[] args) {
		int result = cmmmc(4, 10);
		System.out.println(result);
	}

	private static int cmmmc(int a, int b) {
		int max = Math.max(a, b);
		for (int i = max; i <= a * b; i += max) {
			if (i % a == 0 && i % b == 0) {
				return i;
			}
		}
		return -1;
	}
}
