package com.vasanth.javaprograms.telusko.stackDynamic;

public class Main {

	public static void main(String[] args) {
		// Stack nums = new Stack();
		DStack nums = new DStack();
		// System.out.println("Is the Stack Empty: " + nums.isEmpty());
		nums.push(1);
		nums.push(2);
		nums.push(3);
		nums.push(4);
		nums.push(5);
		nums.pop();
		nums.pop();
		nums.pop();
		nums.pop();
		// nums.push(6);

//			nums.pop();
//			nums.pop();
//			nums.pop();
//			nums.pop();
//			nums.pop();

		// System.out.println("Last added value is: " + nums.peek());
		// System.out.println("Size of Stack is " + nums.size());
		// System.out.println("Is the Stack Empty: " + nums.isEmpty());
		nums.show();
	}
}
