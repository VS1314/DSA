package com.vasanth.javaprograms.telusko.stackDynamic;

public class DStack {
	int capacity = 2;
	int stack[] = new int[capacity];
	int top = 0;

	public void push(int data) {
		if (size() == capacity)
			expand();
		stack[top] = data;
		top++;

	}

	private void expand() {
		int length = size();
		int newStack[] = new int[capacity * 2];
		System.arraycopy(stack, 0, newStack, 0, length);
		stack = newStack;
		capacity *= 2;
	}

	public void show() {
		for (int i : stack) {
			System.out.print(i + " ");
		}
	}

	public int pop() {
		int data = 0;
		if (isEmpty()) {
			System.out.println("Empty Stack");
		} else {
			top--;
			data = stack[top];
			stack[top] = 0;
			shrink();
		}
		return data;

	}

	private void shrink() {
		int length = size();
		if (length <= (capacity / 2) / 2) {
			capacity = capacity / 2;
		}
		int newStack[] = new int[capacity];
		System.arraycopy(stack, 0, newStack, 0, length);
		stack = newStack;
	}

	public int peek() {
		int data;
		data = stack[top - 1];
		return data;
	}

	public int size() {
		return top;
	}

	public boolean isEmpty() {
		return top <= 0;
	}
}
