package dsa;

class LinkedList {
	Node head;

	public void insertAtBeginning(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}

	public void insertAtEnd(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		Node current = head;
		while (current.next != null) {
			current = current.next;
		}
		current.next = newNode;
	}

	public void insertAtPosition(int data, int position) {
		Node newNode = new Node(data);
		if (position == 0) {
			newNode.next = head;
			head = newNode;
			return;
		}
		Node current = head;
		for (int i = 0; current != null && i < position - 1; i++) {
			current = current.next;
		}
		if (current == null) {
			System.out.println("Position out of range!");
			return;
		}
		newNode.next = current.next;
		current.next = newNode;
	}

	public void display() {
		Node current = head;
		while (current != null) {
			System.out.print(current.data + " -> ");
			current = current.next;
		}
		System.out.println("null");
	}
}

public class SinglyLinkedListInsertion {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insertAtBeginning(20);
		list.insertAtBeginning(10);
		list.insertAtEnd(30);
		list.insertAtPosition(25, 2);
		list.display();
	}
}
