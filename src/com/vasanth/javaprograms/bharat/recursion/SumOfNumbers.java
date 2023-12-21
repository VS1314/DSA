package com.vasanth.javaprograms.bharat.recursion;

public class SumOfNumbers {

	public static int sum(int num) {
		if (num <= 1) {
			return num;
		} else {
			return num + sum(num - 1);
		}
	}

	public static void main(String[] args) {
		System.out.println(sum(4));
	}

}
