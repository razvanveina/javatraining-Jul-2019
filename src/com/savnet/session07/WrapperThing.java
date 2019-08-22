package com.savnet.session07;

public class WrapperThing {
	public static void main(String[] args) {
		getPosition(new int[] { 1, 2, 3, 4 }, 5);
	}

	private static int getPosition(int[] arr, int n) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == n) {
				return i;
			}
		}
		return -1;
	}
}
