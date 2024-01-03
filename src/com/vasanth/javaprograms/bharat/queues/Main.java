package com.vasanth.javaprograms.bharat.queues;

public class Main {

	public static void main(String[] args) throws Exception {
		Queue queue=new Queue(5);
		queue.enQueue(10);
		queue.enQueue(20);
		queue.enQueue(30);
		queue.enQueue(40);
		queue.enQueue(50);
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());

		queue.enQueue(60);
		queue.enQueue(70);
		System.out.println(queue.peek());
		queue.show();
		
	}

}
