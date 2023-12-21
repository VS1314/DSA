package com.vasanth.javaprograms.bharat.strings;

import java.util.Scanner;

public class MaxOccuranceFinder {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String");
		String s = scanner.nextLine();
		int arr[] = new int[256];
		for (int i = 0; i < s.length(); i++) {
			arr[(int) s.charAt(i)]++;
		}
		int max = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > arr[max]) {
				max = i;
			}
		}
		System.out.println("Max Occuring character is: " + (char) max);
		scanner.close();
	}
}
