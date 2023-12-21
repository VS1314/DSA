package com.vasanth.javaprograms.bharat.recursion;

public class SumOfCubesOfNumbers {

	public static double sumOfCubesOfNumbers(double num) {
		if (num == 0) {
			return 0;
		} else {
			return Math.pow(num, 3) + sumOfCubesOfNumbers(num - 1);
		}
	}

	public static void main(String[] args) {
		System.out.println(sumOfCubesOfNumbers(7));
	}

}
