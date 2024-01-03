package com.vasanth.javaprograms.bharat.doublelinkedlist;

public class Main {

	public static void main(String[] args) {
		DoublyLinkedList ddl = new DoublyLinkedList();
		ddl.create(10);
		ddl.create(20);
		ddl.create(30);
		ddl.insertAtStart(40);
		ddl.insertAfter(50, 2);
		ddl.insertAtEnd(70);
		ddl.traverse();
	}

}
