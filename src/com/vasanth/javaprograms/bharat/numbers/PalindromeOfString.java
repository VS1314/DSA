package com.vasanth.javaprograms.bharat.numbers;

import java.util.Scanner;

public class PalindromeOfString {

	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner scanner = new Scanner(System.in);
		String num = scanner.next();
		StringBuffer buffer = new StringBuffer(num);
		String revnum = buffer.reverse().toString();
		System.out.println(num.equals(revnum) ? "Palindrome" : "Not a Palindrome");
		scanner.close();

	}
}
