package com.vasanth.javaprograms.telusko.complex;

public class InsertionSorting {

	public static void main(String[] args) {

		int num[] = { 9, 6, 4, 5, 8, 1, 3 };
		System.out.println("Before Sorting..");
		for (int i : num) {
			System.out.print(i + " ");
		}

		for (int i = 1; i < num.length; i++) {
			int key = num[i];
			int j = i - 1;
			while (j >= 0 && num[j] > key) {
				num[j + 1] = num[j];
				j--;
			}
			num[j + 1] = key;
		}

		System.out.println();
		System.out.println("After Sorting..");
		for (int i : num) {
			System.out.print(i + " ");
		}
	}

}
