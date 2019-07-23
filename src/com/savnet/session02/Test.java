package com.savnet.session02;

public class Test {
	public static void main(String[] args) {
		int nota = 7;
		System.out.println(//
				nota > 4 ? //
						(nota > 6 ? //
								(nota > 8 ? //
										"excelent" : "acceptabil")
								: "slab")
						: "respins");
		// 9-10 : excelent
		// 7-8.99 : acceptabil
		// 5-6.99 : slab
		// in rest: respins
	}
}
