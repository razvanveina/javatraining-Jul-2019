package com.savnet.session09.enums;

public class EnumDemo {
	public static void main(String[] args) {
		Month[] values = Month.values();
		for (Month m : values) {
			System.out.println(m + " " + m.getDays());
		}

		System.out.println(Month.APR.compareTo(Month.IAN));
		System.out.println(Month.IAN.compareTo(Month.APR));
		System.out.println(Month.APR.compareTo(Month.APR));

		Month month = Month.APR;

		System.out.println(month.equals(Month.APR));
		System.out.println(month.equals(Month.MAR));

		System.out.println(month == Month.APR);
		System.out.println(month == Month.MAR);

		System.out.println(month.name());

		System.out.println(month.ordinal());

		System.out.println(month.toString());
	}
}
