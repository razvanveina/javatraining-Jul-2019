package com.savnet.session02;

public class SwitchThingTema {
	public static void main(String[] args) {
		int nota = 7;

		switch (nota) {
		case 10:
		case 9:
			System.out.println("Excelent");
			break;
		case 8:
		case 7:
			System.out.println("Bine");
			break;
		case 6:
		case 5:
			System.out.println("Acceptabil");
			break;
		default:
			System.out.println("Slab");
		}
	}
}
