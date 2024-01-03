package com.vasanth.javaprograms.bharat.linkedstack.problems;

public class LinkedStack {

	private Node top;
	private int length;

	public boolean isEmpty() {
		return (length == 0);
	}

	public int size() {
		return length;
	}

	public void push(char data) {
		Node temp = new Node();
		temp.setData(data);
		temp.setNext(top);
		top = temp;
		length++;
	}

	public char pop() throws Exception {
		if (isEmpty()) {
			throw new Exception("Stack is empty");
		}
		char result = top.getData();
		top = top.getNext();
		length--;
		return result;
	}

	public int peek() throws Exception {
		if (isEmpty()) {
			throw new Exception("Stack is empty");
		}
		return top.getData();
	}
}
