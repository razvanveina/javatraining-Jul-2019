package com.savnet.session07;

public class EmailValidator {
	public static void main(String[] args) {
		System.out.println(isEmailValid("qwe@qwe.ro"));
		System.out.println(isEmailValid("qwe.qwe@ro"));
	}

	private static boolean isEmailValid(String s) {
		int index1 = s.indexOf('@');
		int index2 = s.indexOf('.');

		return (index1 != -1 && index2 != -1 && index2 > index1);
	}
}
