package com.vasanth.javaprograms.bharat.circularlinkedlist;

public class Main {

	public static void main(String[] args) {
		CircularLinkedList linkedList = new CircularLinkedList();
		linkedList.create(1);
		linkedList.create(2);
		linkedList.create(3);
		linkedList.create(4);
//		linkedList.insertAtStart(11);
//		linkedList.insertAtEnd(20);
//		linkedList.insertAtPosition(30,0);
//		linkedList.reverse();
//		linkedList.delete(2);
		linkedList.findNthNodeFromEnd(2);
//		linkedList.deleteAtStart();
//		linkedList.cearList();
		linkedList.traverse();
//		linkedList.hasLoop();
		
	}

}
