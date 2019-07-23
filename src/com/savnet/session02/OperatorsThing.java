package com.savnet.session02;

public class OperatorsThing {
	public static void main(String[] args) {
		int x = 0;
		x++;
		System.out.println(x);
		x--;
		System.out.println(x);

		System.out.println(x++); // postincrementare
		System.out.println(++x); // preincrementare

		System.out.println(-x);

		int y = -5;
		System.out.println(-y);

		boolean b = true;
		System.out.println(!b);

		System.out.println(~y);

		System.out.println((1 + 2) * 3);

		System.out.println(5 % 2);

		System.out.println(10 >> 2);
		System.out.println(10 >>> 2);
		System.out.println(10 << 2);
		System.out.println(-10 >> 2);
		System.out.println(-10 >>> 2);
		int q = 7;
		System.out.println(q);

		int x2 = 5;
		System.out.println(x2 > 2);
		System.out.println(x2 < 2);
		System.out.println(x2 >= 2);
		System.out.println(x2 <= 2);

		System.out.println(x == 2);
		System.out.println(x = 2);
		System.out.println(x != 2);

		System.out.println(10 & 5); // 1010 0101
		System.out.println(10 | 5); // 1010 0101
		System.out.println(10 ^ 5);
		System.out.println(10 ^ 11);

		System.out.println(false && metoda());
		System.out.println(true || metoda());

		x2 = x2 + 10;
		x2 += 10; // preferabil asa

		int nota = 7;
		System.out.println(nota > 4 ? "admis" : "respins");
		// 9-10 : excelent
		// 7-8 : acceptabil
		// 5-6 : slab
		// in rest: respins

		String a = "abc";
		String b2 = "def";
		System.out.println(a + b2);

		int z = metoda3() * 100;
	}

	private static boolean metoda() {
		System.out.println("am intrat in metoda");
		return false;
	}

	public static void metoda2() {

	}

	public static int metoda3() {
		return 10;
	}
}
