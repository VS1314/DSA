package com.vasanth.javaprograms.bharat.numbers;

import java.util.Scanner;

public class DuckNumberCheck {

	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner scanner = new Scanner(System.in);
		int digit, num = scanner.nextInt();
		boolean isDuckNumber = false;
		while (num != 0) {
			digit = num % 10;
			if (digit == 0) {
				isDuckNumber = true;
				break;
			}
			num = num / 10;
		}
		if (isDuckNumber) {
			System.out.println("Number is a Duck number");
		} else {
			System.out.println("Not a Duck number");
		}
		scanner.close();

	}

}
