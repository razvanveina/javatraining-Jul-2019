package com.savnet.session04;

public class Position2 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		int n = 4;
		boolean gasit = false;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == n) {
				System.out.println(i);
				gasit = true;
				break;
			}
		}

		if (!gasit) {
			System.out.println("Not found");
		}

	}
}
