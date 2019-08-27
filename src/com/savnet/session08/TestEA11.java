package com.savnet.session08;

public class TestEA11 {
	public static void main(String[] args) {
		System.out.println(countPairs(new int[] { 1, 2, 3, 5, 7, 8, 9, 10, 11, 12 }, 10));
	}

	public static int countPairs(int[] arr, int n) {
		int counter = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == n) {
					counter++;
				}
			}
		}

		return counter;
	}
}
