package com.vasanth.javaprograms.bharat.numbers;

import java.util.Scanner;

public class CountNoOfTimesDigitsOccur {

	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner scanner = new Scanner(System.in);
		int digit, num = scanner.nextInt(), find = scanner.nextInt(), count = 0;
		while (num != 0) {
			digit = num % 10;
			if (digit == find) {
				count++;
			}

			num = num / 10;
		}
		System.out.println("No of times "+ find + " occured is: " + count);
		scanner.close();

	}

}
