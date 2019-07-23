package com.savnet.session02;

public class LiteralsThing {
	public static void main(String[] args) {
		long l = 1_000_000_000;
		int x = 7;
		double d = 3.14;
		String s = "abc";
		char ch = 'A';
		int x1 = (int) 10L;

		x = 1000;
		byte b = (byte) x;
		System.out.println(b);

		int nr = (int) d;
		System.out.println(nr);

		int x2 = 0xFFFF;
		int x3 = 0b01010101;

		char ch2 = '\u1234';
		System.out.println(ch2);

		String s2 = "abc\"\'\\";
		System.out.println(s2);
	}
}
