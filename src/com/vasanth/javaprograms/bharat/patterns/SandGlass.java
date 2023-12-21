package com.vasanth.javaprograms.bharat.patterns;

import java.util.Scanner;

public class SandGlass {

	public static void main(String[] args) {
		System.out.println("How many numbers");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = i; k <= n; k++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
		for (int i = n; i > 0; i--) {
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = i; k <= n; k++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
		scanner.close();

	}
}
