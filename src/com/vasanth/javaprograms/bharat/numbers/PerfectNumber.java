package com.vasanth.javaprograms.bharat.numbers;

import java.util.Scanner;

public class PerfectNumber {

	public static boolean isPerfect(int num) {
		int sum = 0;
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				sum += i;
			}
		}
		return sum == num;
	}

	public static void main(String[] args) {

		System.out.println("Enter a number: ");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		System.out.println(isPerfect(num));
		scanner.close();
	}
}
