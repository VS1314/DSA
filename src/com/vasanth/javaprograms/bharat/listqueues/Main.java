package com.vasanth.javaprograms.bharat.listqueues;

public class Main {

	public static void main(String[] args) throws Exception {
		ListQueues queues = new ListQueues();
		queues.enQueue(10);
		queues.enQueue(20);
		queues.enQueue(30);
		queues.enQueue(40);
		queues.enQueue(50);
		System.out.println(queues.enQueue());
		queues.enQueue(60);
		
	}

}
