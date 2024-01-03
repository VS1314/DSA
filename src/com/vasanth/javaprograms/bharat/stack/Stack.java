package com.vasanth.javaprograms.bharat.stack;

public class Stack {

	private int[] stack;
	private int top = -1;

	public Stack() {
		this(10);
	}

	public Stack(int capacity) {
		stack = new int[capacity];
	}

	public int size() {
		return top + 1;
	}

	public boolean isEmpty() {
		return top < 0;
	}

	public void push(int data) throws Exception {
		if (size() == stack.length) {
			throw new Exception("Stak is full");
		}
		stack[++top] = data;
	}

	public int pop() throws Exception {
		if (isEmpty()) {
			throw new Exception("Stack is Empty");
		}
		int data = stack[top];
		stack[top--] = 0;
		return data;
	}

	public int peek() throws Exception {
		if (isEmpty()) {
			throw new Exception("Stack is Empty");
		}
		return stack[top];
	}

	public void show() {
		for (int i : stack) {
			System.out.print(i + " ");
		}
	}
}
