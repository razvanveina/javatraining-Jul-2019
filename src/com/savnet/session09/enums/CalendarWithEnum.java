package com.savnet.session09.enums;

import java.util.Scanner;

public class CalendarWithEnum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String monthString = sc.nextLine();
		Month month = Month.valueOf(monthString.toUpperCase());

		switch (month) {
		case IAN:
			System.out.println(31);
			break;
		case FEB:
			System.out.println(28);
			break;
		case MAR:
			System.out.println(31);
			break;
		case APR:
			System.out.println(30);
			break;
		}

		sc.close();
	}
}
