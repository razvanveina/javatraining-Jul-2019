package com.savnet.session02;

public class IfThing2 {
	public static void main(String[] args) {
		int nota = 7;

		if (nota < 5) {
			System.out.println("Respins");
		} else if (nota < 7) {
			System.out.println("Slab");
		} else if (nota < 9) {
			System.out.println("Acceptabil");
		} else {
			System.out.println("Foarte bine");
		}

		boolean flag = false;

		if (!flag) {
			System.out.println("Flagul este setat");
		}
	}
}
