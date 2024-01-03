package com.vasanth.javaprograms.bharat.doublelinkedlist;

public class DoublyLinkedList {

	private Node head;

	private Node createNewNode(int data) {
		Node node = new Node();
		node.setData(data);
		return node;
	}

	public void create(int data) {
		Node temp, q;
		temp = createNewNode(data);
		if (head == null) {
			head = temp;
		} else {
			temp = head;
			while (temp.getNext() != null) {
				temp = temp.getNext();
			}
			q = createNewNode(data);
			temp.setNext(q);
			q.setPrev(temp);
		}
	}

	public void insertAtStart(int data) {
		Node newNode = createNewNode(data);
		head.setPrev(newNode);
		newNode.setNext(head);
		head = newNode;
	}

	public void insertAfter(int data, int position) {
		if (head == null) {
			head = createNewNode(data);
		} else if (position == 0) {
			insertAtStart(data);
		} else {
			Node temp = head;
			for (int i = 1; i < position; i++) {
				temp = temp.getNext();
			}
			Node newNode = createNewNode(data);
			newNode.setNext(temp.getNext());
			newNode.setPrev(temp);
			newNode.getNext().setPrev(newNode);
			temp.setNext(newNode);
		}
	}
	
	public void insertAtEnd(int data) {
		Node temp = head;
		while (temp.getNext() != null) {
			temp = temp.getNext();
		}
		Node newNode = createNewNode(data);
		temp.setNext(newNode);
		newNode.setPrev(temp);
	}

	public void traverse() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.getData());
			temp = temp.getNext();
		}
	}
}
