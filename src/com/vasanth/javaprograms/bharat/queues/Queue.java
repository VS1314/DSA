package com.vasanth.javaprograms.bharat.queues;

public class Queue {

	private int[] queue;
	int size, capacity, front, rear;

	public Queue(int capacity) {
		queue = new int[capacity];
		this.capacity = capacity;
		size = 0;
		front = 0;
		rear = 0;
	}

	public boolean isEmpty() {
		return (size == 0);
	}

	public boolean isFull() {
		return (size == capacity);
	}

	public void enQueue(int data) throws Exception {
		if (isFull()) {
			throw new Exception("Queue is full");
		}
//		if (rear == capacity) {
//			rear = 0;
//		}
		queue[rear] = data;
		rear = (rear + 1) % capacity;
		size++;
	}

	public int deQueue() throws Exception {
		if (isEmpty()) {
			throw new Exception("Queue is empty");
		} else {
			size--;
			queue[front] = 0;
			int data = queue[front];
			front = (front + 1) % capacity;
			return data;
		}
	}

	public void show() {
		for (int i : queue) {
			System.out.print(i + " ");
		}
	}

	public int peek() {
		if (isEmpty()) {
			System.out.println("Queue is empty");
		}
		return queue[front];
	}
}
