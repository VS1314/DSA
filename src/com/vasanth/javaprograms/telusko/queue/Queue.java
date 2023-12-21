package com.vasanth.javaprograms.telusko.queue;

public class Queue {

	int queue[] = new int[5];
	int front;
	int rear;
	int size;

	public void enQueue(int data) {
		if (!isFull()) {
			queue[rear] = data;
			rear = (rear + 1) % 5;
			size++;
		} else {
			System.out.println("Queue is full.");
		}
	}

	public void show() {
		for (int i = 0; i < size; i++) {
			System.out.print(queue[(front + i) % 5] + " ");
		}
		System.out.println();
		for (int i : queue) {
			System.out.print(i + " ");
		}
	}

	public int deQueue() {
		int data = queue[front];
		if (!isEmpty()) {
			front = (front + 1) % 5;
			size--;
		} else {
			System.out.println("Queue is empty.");
		}
		return data;
	}

	public boolean isEmpty() {
		return getSize() == 0;
	}

	public boolean isFull() {
		return getSize() == 5;
	}

	private int getSize() {
		return size;
	}

}
