package com.vasanth.javaprograms.bharat.numbers;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner scanner = new Scanner(System.in);
		int digit, num = scanner.nextInt(), result = 0, temp = num;
		while (num != 0) {
			digit = num % 10;
			result = result * 10 + digit;
			num = num / 10;
		}
		if (temp==result) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not a Palindrome");
		}
		
		scanner.close();

	}
}
