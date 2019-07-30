package com.savnet.session03;

public class ForThing {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}

		for (int i = 0, j = 0; i < 10 && j < 10; i++, j++) {
			System.out.println(i);
		}

		// bucla infinita
//		for (;;) {
//
//		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println(i + "," + j);
			}
		}

		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				break;
			}
			System.out.println(i);
		}

		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				continue;
			}
			System.out.println(i);
		}

		label: for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (j == 1) {
					break label;
				}
				System.out.println(i + "," + j);
			}
		}
	}
}
