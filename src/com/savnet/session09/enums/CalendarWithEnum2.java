package com.savnet.session09.enums;

import java.util.Scanner;

public class CalendarWithEnum2 {
	public static void main(String[] args) {
		Month[] values = Month.values();
		for (Month m : values) {
			System.out.println(m.getFullName() + " " + m.getDays());
		}

		System.out.println(Month.APR.compareTo(Month.IAN));
		System.out.println(Month.IAN.compareTo(Month.APR));

		Scanner sc = new Scanner(System.in);
		String monthString = sc.nextLine();
		Month month = Month.valueOf(monthString.toUpperCase());
		System.out.println(month.getDays());

		sc.close();
	}
}
