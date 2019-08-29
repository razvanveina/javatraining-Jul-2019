package com.savnet.session09.calculator;

import java.util.Scanner;

public class MiniCalculatorApp3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Calculator2 calculator = new Calculator2(0);

		while (true) {
			calculator.showCurrentValue();
			System.out.print("> ");
			String s = scanner.nextLine();

			char operator = s.charAt(0);
			Operation op = Operation.getOperationByChar(operator);
			if (op == Operation.EXIT) {
				break;
			}

			calculator.doOperation(s);
		}

		scanner.close();
	}
}
