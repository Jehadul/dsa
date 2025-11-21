package dsa;

class Node {
	int data;
	Node prev;
	Node next;

	Node(int data) {
		this.data = data;
		this.prev = null;
		this.next = null;
	}
}

class DoublyLinkedList {
    Node head;

    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (head != null) {
            newNode.next = head;
            head.prev = newNode;
        }
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
        newNode.prev = current;
    }

    public void insertAtPosition(int data, int position) {
        Node newNode = new Node(data);

        if (position == 0) {
            insertAtBeginning(data);
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
        if (current.next != null) {
            current.next.prev = newNode;
        }
        current.next = newNode;
        newNode.prev = current;
    }

    public void displayForward() {
        Node current = head;
        System.out.print("Forward: ");
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public void displayBackward() {
        Node current = head;
        if (current == null) return;

        while (current.next != null) {
            current = current.next;
        }

        System.out.print("Backward: ");
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.prev;
        }
        System.out.println("null");
    }
    
    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty, nothing to delete!");
            return;
        }

        System.out.println("Deleting: " + head.data);

        head = head.next;

        if (head != null) {
            head.prev = null;
        }
    }
}


public class DoublyLinkedListInsertion {
	public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        list.insertAtBeginning(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtPosition(25, 2);
        list.insertAtBeginning(5);

        list.displayForward();
        list.displayBackward();
        list.deleteFirst();
        list.displayForward();
    }
}
