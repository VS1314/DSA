package com.vasanth.javaprograms.telusko.complex;

public class BubbleSorting {

	public static void main(String[] args) {

		int num[] = { 9, 6, 4, 5, 8, 1, 3 };
		int size = num.length;
		int temp = 0;
		System.out.println("Before Sorting..");
		for (int i : num) {
			System.out.print(i + " ");
		}

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size - i - 1; j++) {
				if (num[j] > num[j + 1]) {
					temp = num[j];
					num[j] = num[j + 1];
					num[j + 1] = temp;
				}
			}
		}

		System.out.println();
		System.out.println("After Sorting..");
		for (int i : num) {
			System.out.print(i + " ");
		}
	}

}
