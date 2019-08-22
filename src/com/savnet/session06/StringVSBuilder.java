package com.savnet.session06;

public class StringVSBuilder {
	public static void main(String[] args) {
		System.out.println("String");
		long start = System.currentTimeMillis();
		String s = "";
		for (int i = 0; i < 100000; i++) {
			s += i;
		}
		long stop = System.currentTimeMillis();
		System.out.println(stop - start);

		System.out.println("StringBuilder");
		start = System.currentTimeMillis();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 10000000; i++) {
			sb.append(i);
		}
		stop = System.currentTimeMillis();
		System.out.println(stop - start);
	}
}
