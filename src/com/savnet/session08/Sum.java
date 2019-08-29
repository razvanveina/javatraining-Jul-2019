package com.savnet.session08;

import java.util.Arrays;

public class Sum {
	static int[] solution = new int[] {};

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		sum(arr, 10);
	}

	private static void sum(int[] arr, int n) {
		System.out.println(Arrays.toString(solution));
		// daca n este 0 am ajuns la solutie si o afisam
		if (n == 0) {
			System.out.println("!!!: " + Arrays.toString(solution));
			return;
		}

		// luam fiecare element din arr
		for (int i = 0; i < arr.length; i++) {
			// il adaugam la solutie
			solution = Arrays.copyOf(solution, solution.length + 1);
			solution[solution.length - 1] = arr[i];

			// apelam recursiv pentru restul elementelor si un n scazut in functie de
			// elementul curent
			sum(Arrays.copyOfRange(arr, i + 1, arr.length), n - arr[i]);

			// stergem din solutie elementul adaugat la linia 24
			solution = Arrays.copyOf(solution, solution.length - 1);
		}
	}

}
