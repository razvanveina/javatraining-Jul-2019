package com.savnet.session09.enums;

import java.util.Scanner;

public class Calendar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String month = sc.nextLine();

		switch (month) {
		case "ian":
			System.out.println(31);
			break;
		case "feb":
			System.out.println(28);
			break;
		case "mar":
			System.out.println(31);
			break;
		case "qwe":
			System.out.println(-1);
			break;
		}

		sc.close();
	}
}
