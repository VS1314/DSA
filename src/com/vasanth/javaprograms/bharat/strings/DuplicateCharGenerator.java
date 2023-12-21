package com.vasanth.javaprograms.bharat.strings;

import java.util.Scanner;

public class DuplicateCharGenerator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String");
		String s = scanner.nextLine();
		StringBuffer stringBuffer = new StringBuffer();
		for (int i = 0; i < s.length(); i++) {
			stringBuffer.append(s.charAt(i));
			stringBuffer.append(s.charAt(i));
		}
		System.out.println(stringBuffer);
		scanner.close();
	}

}
