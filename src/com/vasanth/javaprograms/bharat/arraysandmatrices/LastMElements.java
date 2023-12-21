package com.vasanth.javaprograms.bharat.arraysandmatrices;

import java.util.Scanner;

public class LastMElements {

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
		System.out.println("Enter the number of last elements to display");
		int m = scanner.nextInt();
		System.out.println("The last " + m + " elements is: ");

		for (int i = n - m; i < n; i++) {
			System.out.print(a[i] + " ");
		}
		scanner.close();

	}

}
