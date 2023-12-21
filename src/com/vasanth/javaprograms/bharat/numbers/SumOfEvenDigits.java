package com.vasanth.javaprograms.bharat.numbers;

import java.util.Scanner;

public class SumOfEvenDigits {

	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner scanner = new Scanner(System.in);
		int digit, num = scanner.nextInt(), sum = 0;
		while (num != 0) {
			digit = num % 10;
			if (digit % 2 == 0) {
				sum = sum + digit;
			}
			num = num / 10;
		}
		System.out.println("Sum of even digits is: " + sum);
		scanner.close();

	}

}
