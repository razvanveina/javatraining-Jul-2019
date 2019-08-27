package com.savnet.session08;

public class TestEA9 {
	public static void main(String[] args) {
		System.out.println(isUnique(new int[] { 1, 2, 3, 5, 7, 8, 9, 10, 11, 12 }));
	}

	public static boolean isUnique(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					return false;
				}
			}
		}

		return true;
	}
}
