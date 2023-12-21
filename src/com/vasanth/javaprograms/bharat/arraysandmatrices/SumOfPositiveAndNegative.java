package com.vasanth.javaprograms.bharat.arraysandmatrices;

import java.util.Scanner;

public class SumOfPositiveAndNegative {

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
		int nSum = 0, pSum = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] < 0) {
				nSum += a[i];
			} else {
				pSum += a[i];
			}
		}
		System.out.println("Sum of negative elements is: " + nSum);
		System.out.println("Sum of positive elements is: " + pSum);
		scanner.close();
	}

}
