package com.vasanth.javaprograms.bharat.arraysandmatrices;

import java.util.Scanner;

public class ArrayReversal {

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
		int b[] = new int[a.length];
		for (int i = 0, j = b.length - 1; j >= 0; i++, j--) {
			b[j] = a[i];
		}
		System.out.print("The reversed Array is: [ ");
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
		System.out.print("]");
		scanner.close();
	}

}
