package com.vasanth.javaprograms.bharat.numbers;

import java.util.Scanner;

public class IntegerToBinaryOtherWay {

	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		System.out.println(Integer.toBinaryString(num));
		scanner.close();
	}

}
