package com.savnet.session07;

public class WrapperThing3 {
	public static void main(String[] args) {
		int x = 5;
		Integer xx = 5;
		Integer xx2 = new Integer(5);

		int y = x + xx; // unboxing

		method(xx);
		method(x); // autoboxing

		Boolean b;
		Character ch;
		Float f;
		Double d;

		Byte by;
		Short sh;
		Long l;

		System.out.println(Integer.BYTES);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE);
		System.out.println(Integer.max(5, 7));
		int n = Integer.parseInt("12341234");
		System.out.println(n);

		String[] splits = "123, 234, 345, 456".split(",");
		String result = "";
		int sum = 0;
		for (String ss : splits) {
			System.out.println(ss.trim());
			result += ss;
			sum += Integer.parseInt(ss.trim());
		}
		System.out.println(result);
		System.out.println(sum);

		System.out.println(Integer.rotateLeft(100, 2));
		System.out.println(xx.toString());
		System.out.println(Integer.toBinaryString(100));
		System.out.println(Integer.toHexString(100));

		System.out.println(Character.isDigit('0'));
		System.out.println(Character.isDigit('f'));

		boolean bbb = Boolean.parseBoolean("true");
		System.out.println(bbb);
	}

	private static void method(Integer xx) {

	}

}
