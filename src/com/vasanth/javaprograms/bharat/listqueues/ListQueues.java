package com.vasanth.javaprograms.bharat.listqueues;

public class ListQueues {

	private Node front, rear;
	private int size;

	public void enQueue(int data) {
		System.out.println("data added is: " + data);
		Node node = new Node();
		node.setData(data);

		if (isEmpty()) {
			front = node;
		} else {
			rear.setNext(node);
		}
		rear = node;
		size++;
	}

	public int enQueue() throws Exception {
		if (isEmpty()) {
			throw new Exception("Queue is empty");
		}
		int data = front.getData();
		front = front.getNext();
		size--;
		if (isEmpty()) {
			rear = null;
		}
		return data;
	}

	public boolean isEmpty() {
		return (size == 0);
	}

	public int size() {
		return size;
	}
}
