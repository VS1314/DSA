package com.vasanth.javaprograms.bharat.strings;

import java.util.Scanner;

public class StringEncoder {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String");
		String s = scanner.nextLine();
		String outputString = "";
		for (int i = 0; i < s.length(); i++) {
			outputString += (char) (s.charAt(i) + 1);
		}
		System.out.println(outputString);
		scanner.close();
	}

}
