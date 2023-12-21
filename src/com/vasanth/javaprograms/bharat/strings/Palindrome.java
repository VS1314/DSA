package com.vasanth.javaprograms.bharat.strings;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String");
		String input = scanner.next();
		String output = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			output += input.charAt(i);
		}
		if (input.equals(output)) {
			System.out.println("Is a Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}
		
		System.out.println(new StringBuffer(input).reverse());
		scanner.close();
	}

}
