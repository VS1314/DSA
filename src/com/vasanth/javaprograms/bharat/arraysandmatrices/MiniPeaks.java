package com.vasanth.javaprograms.bharat.arraysandmatrices;

import java.util.Scanner;

public class MiniPeaks {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n = scanner.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the elements of the array");
		for (int i = 0; i < a.length; i++) {
			a[i] = scanner.nextInt();
		}
		System.out.print("The Array is: [ ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.print("]");
		System.out.println();
		for (int i = 1; i < a.length - 1; i++) {
			if (a[i] > a[i - 1] && a[i] > a[i + 1]) {
				System.out.println(a[i]);
			}
		}
		scanner.close();
	}

}
