package com.savnet.session04;

public class Position3 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		int n = 4;

		int result = findPosition(arr, n);

		if (result != -1) {
			System.out.println(result);
		} else {
			System.out.println("Not found");
		}

	}

	private static int findPosition(int[] arr, int n) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == n) {
				return i;
			}
		}

		return -1;
	}
}
