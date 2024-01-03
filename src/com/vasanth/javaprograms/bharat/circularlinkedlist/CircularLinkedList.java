package com.vasanth.javaprograms.bharat.circularlinkedlist;

public class CircularLinkedList {

	private Node head;

	private Node createNewNode(int data) {
		Node newNode = new Node();
		newNode.setData(data);
		newNode.setNext(null);
		return newNode;
	}

	public void create(int data) {
		Node newNode = createNewNode(data);
		if (head == null) {
			head = newNode;
			newNode.setNext(head);
		} else {
			Node temp = head;
			while (temp.getNext() != head) {
				temp = temp.getNext();
			}
			temp.setNext(newNode);
			newNode.setNext(head);
		}
	}

	public void traverse() {
		Node currentNode = head;
		do {
			System.out.println(currentNode.getData());
			System.out.println(currentNode.getNext());
			currentNode = currentNode.getNext();
		} while (currentNode != head);
		System.out.println();
	}

	public void insertAtStart(int data) {
		Node newNode = createNewNode(data);
		if (head == null) {
			head = newNode;
			newNode.setNext(head);
		} else {
			Node lastNode = head;
			while (lastNode.getNext() != head) {
				lastNode = lastNode.getNext();
			}
			newNode.setNext(head);
			lastNode.setNext(newNode);
			head = newNode;
		}
	}

	public void insertAtEnd(int data) {
		Node newNode = createNewNode(data);
		if (head == null) {
			head = newNode;
			newNode.setNext(head);
		} else {
			Node temp = head;
			while (temp.getNext() != head) {
				temp = temp.getNext();
			}
			temp.setNext(newNode);
			newNode.setNext(head);
		}
	}

	public void insertAtPosition(int data, int position) {
		Node newNode = createNewNode(data);
		if (head == null) {
			head = newNode;
			newNode.setNext(head);
		} else if (position == 0) {
			insertAtStart(data);
		} else {
			Node temp = head;
			for (int i = 1; i < position; i++) {
				temp = temp.getNext();
			}
			newNode.setNext(temp.getNext());
			temp.setNext(newNode);
		}
	}

	public void reverse() {
		Node prevNode = null, nextNode = null;
		while (head != null) {
			nextNode = head.getNext();
			head.setNext(prevNode);
			prevNode = head;
			head = nextNode;
		}
		head = prevNode;
	}

	public boolean hasLoop() {
		Node slowNode = head, fastNode = head;
		while (slowNode != null && fastNode != null && fastNode.getNext() != null) {
			slowNode = slowNode.getNext();
			fastNode = fastNode.getNext().getNext();
			if (slowNode == fastNode) {
				return true;
			}
		}
		return false;
	}

	public void deleteAtStart() {
		if (head == null) {
			System.out.println("List is empty. Cannot delete from an empty list.");
			return;
		}
		Node temp = head;
		while (temp.getNext() != head) {
			temp = temp.getNext();
		}
		if (head.getNext() == head) {
			// Only one node in the list
			head = null;
		} else {
			temp.setNext(head.getNext());
			head = head.getNext();
		}
	}

	public void delete(int data) {
		if (head == null) {
			System.out.println("List is empty");
			return;
		}

		Node current = head;
		Node previous = null;

		// Traverse the list to find the node to delete
		do {
			if (current.getData() == data) {
				if (previous == null) {
					// If the node to delete is the head, update head
					head = current.getNext();
				} else {
					// Update the next pointer of the previous node
					previous.setNext(current.getNext());
				}

				// If the deleted node is the last node, update the next pointer of the last node
				if (current.getNext() == head) {
					Node temp = head;
					while (temp.getNext() != current) {
						temp = temp.getNext();
					}
					temp.setNext(head);
				}
				return;
			}

			previous = current;
			current = current.getNext();
		} while (current != head);

		System.out.println("Node with data " + data + " not found in the list.");
	}

	public void cearList() {
		head = null;
	}

	public void findNthNodeFromEnd(int n) {
		Node nthNode = null, temp = head;
		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		for (int i = 1; i < n; i++) {
			if (temp != null) {
				temp = temp.getNext();
			}
		}
		while (temp != null) {
			if (nthNode == null) {
				nthNode = head;
			} else {
				nthNode = nthNode.getNext();
			}
			temp = temp.getNext();
		}
		if (nthNode != null) {
			System.out.println(nthNode.getData());
		} else {
			System.out.println("Not enough elements in the List");
		}
	}
}
