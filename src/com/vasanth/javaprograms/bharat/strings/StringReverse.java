package com.vasanth.javaprograms.bharat.strings;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String");
		String input = scanner.next();
		String output = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			output += input.charAt(i);
		}
		System.out.println(output);
		
		System.out.println(new StringBuffer(input).reverse());
		scanner.close();
	}

}
