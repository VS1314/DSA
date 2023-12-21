package com.vasanth.javaprograms.telusko.linkedlist;

public class Main {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insert(13);
		list.insert(20);
		list.insert(11);
		list.insertAtStart(25);
		list.insertAt(2,16);
		list.insertAt(0, 02);
		list.deleteAt(2);
		list.show();
	}

}
