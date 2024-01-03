package com.vasanth.javaprograms.bharat.linkedstack.problems;

public class StringReverser {

	public static String reverse(String str) throws Exception {
		LinkedStack stack = new LinkedStack();
		for (int i = 0; i < str.length(); i++) {
			stack.push(str.charAt(i));
		}
		char[] reversed = new char[str.length()];
		int i = 0;
		while (!stack.isEmpty()) {
			reversed[i++] = stack.pop();
		}
		return new String(reversed);

	}

	public static void main(String[] args) throws Exception {
		System.out.println(reverse("vasanth"));
		System.out.println(reverse("malayalam"));

	}

}
