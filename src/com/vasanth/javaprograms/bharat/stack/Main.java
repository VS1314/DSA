package com.vasanth.javaprograms.bharat.stack;

public class Main {

	public static void main(String[] args) throws Exception {
		Stack stack=new Stack();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.pop();
		stack.show();
		
		System.out.println(stack.peek());
		
		
	}

}
