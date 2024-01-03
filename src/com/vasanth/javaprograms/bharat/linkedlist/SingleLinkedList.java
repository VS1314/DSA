package com.vasanth.javaprograms.bharat.linkedlist;

public class SingleLinkedList {

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
		} else {
			Node temp = head;
			while (temp.getNext() != null) {
				temp = temp.getNext();
			}
			temp.setNext(newNode);
		}
	}

	public void traverse() {
		Node currentNode = head;
		while (currentNode != null) {
			System.out.println(currentNode.getData());
			System.out.println(currentNode.getNext());
			currentNode = currentNode.getNext();
		}
	}

	public void insertAtStart(int data) {
		Node newNode = createNewNode(data);
		newNode.setNext(head);
		head = newNode;
	}

	public void insertAtEnd(int data) {
		Node newNode = createNewNode(data);
		if (head == null) {
			head = newNode;
		} else {
			Node temp = head;
			while (temp.getNext() != null) {
				temp = temp.getNext();
			}
			temp.setNext(newNode);
		}
	}

	public void insertAtPosition(int data, int position) {
		Node newNode = createNewNode(data);
		if (head == null) {
			head = newNode;
		} else if (position == 0) {
			Node temp = newNode;
			temp.setNext(head);
			head = temp;
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
		Node temp = head;
		if (temp != null) {
			head = temp.getNext();
			temp.setNext(null);
		}
	}

	public void delete(int data) {
		Node p = head;
		if (head.getData() == data) {
			p = head;
			head = p.getNext();
			return;
		}
		Node q = head;
		while (q.getNext() != null) {
			if (q.getNext().getData() == data) {
				p = q.getNext();
				q.setNext(p.getNext());
				return;
			}
			q = q.getNext();
		}
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

	public void partitionList(int x) {
		if (head == null) {
			// If the linked list is empty, return immediately
			return;
		}

		// Create dummy nodes for the two partitions
		Node lessThanX = createNewNode(0);
		Node greaterThanOrEqualX = createNewNode(0);

		// Create pointers for the two partitions
		Node lessThanXPtr = lessThanX;
		Node greaterThanOrEqualXPtr = greaterThanOrEqualX;

		// Traverse the original linked list
		Node current = head;
		while (current != null) {
			if (current.getData() < x) {
				// If the current node's value is less than x, add it to the lessThanX partition
				lessThanXPtr.setNext(current);
				lessThanXPtr = lessThanXPtr.getNext();
			} else {
				// If the current node's value is greater than or equal to x, add it to the
				// greaterThanOrEqualX partition
				greaterThanOrEqualXPtr.setNext(current);
				greaterThanOrEqualXPtr = greaterThanOrEqualXPtr.getNext();
			}
			// Move to the next node in the original list
			current = current.getNext();
		}

		// Connect the two partitions
		lessThanXPtr.setNext(greaterThanOrEqualX.getNext()); 
		// Set the end of the greaterThanOrEqualX partition to null to terminate the
		// list
		greaterThanOrEqualXPtr.setNext(null); 

		// Update the head of the modified linked list
		head = lessThanX.getNext();
	}
}
