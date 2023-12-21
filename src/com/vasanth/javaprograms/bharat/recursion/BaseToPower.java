package com.vasanth.javaprograms.bharat.recursion;

public class BaseToPower {

	public static int baseToPower(int base, int exponent) {
		if (exponent == 1) {
			return base;
		} else {
			return base * baseToPower(base, exponent - 1);
		}
	}

	public static void main(String[] args) {
		System.out.println(baseToPower(5, 3));
	}

}
