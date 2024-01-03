package com.vasanth.javaprograms.bharat.linkedlist;

public class Main {

	public static void main(String[] args) {
		SingleLinkedList linkedList = new SingleLinkedList();
		linkedList.create(3);
		linkedList.create(5);
		linkedList.create(8);
		linkedList.create(10);
		linkedList.create(2);
		linkedList.create(1);

//		linkedList.insertAtStart(10);
//		linkedList.insertAtEnd(20);
//		linkedList.insertAtPosition(30,3);
//		linkedList.reverse();
		//linkedList.delete(4);
//		linkedList.findNthNodeFromEnd(2);
		linkedList.partitionList(5);
		linkedList.traverse();
		linkedList.hasLoop();
		
	}

}
