package com.vasanth.javaprograms.bharat.numbers;

import java.util.Scanner;

public class AmstrongNumber {

	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner scanner = new Scanner(System.in);
		int digit, num = scanner.nextInt(), sum = 0;
		int temp = num;
		while (num != 0) {
			digit = num % 10;
			sum += digit * digit * digit;
			num = num / 10;
		}
		System.out.println(sum == temp ? "Amstrong number" : "Not an Amstrong number");
		scanner.close();

	}
}
