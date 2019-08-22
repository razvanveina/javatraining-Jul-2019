package com.savnet.session07;

public class WrapperThing2 {
	public static void main(String[] args) {
		System.out.println(next(new int[] { 1, 2, 3, 4 }, 5));
		System.out.println(next(new int[] { 1, 2, 3, 4 }, 1));

		System.out.println(next2(new int[] { -1, 2, -1, 3, 4 }, 5));
		System.out.println(next2(new int[] { -1, 2, -1, 3, 4 }, -1));
	}

	private static int next(int[] arr, int n) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == n) {
				return arr[i + 1];
			}
		}
		return -1;
	}

	private static Integer next2(int[] arr, int n) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == n) {
				return arr[i + 1];
			}
		}
		return null;
	}
}
