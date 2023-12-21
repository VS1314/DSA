package com.vasanth.javaprograms.bharat.arraysandmatrices;

import java.util.Scanner;

public class MinAndMax {

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
		int min = a[0], max = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			} else if (a[i] < min) {
				min = a[i];
			}
		}
		System.out.println("Max Element in Array is: " + max);
		System.out.println("Min Element in Array is: " + min);
		scanner.close();
	}

}
