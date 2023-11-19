class Node {
    int data;
    Node next;

    // Constructor
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    // Constructor
    LinkedList() {
        this.head = null;
    }

    // Method to add a new node to the end of the linked list
    public void append(int data) {
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

    // Method to display the linked list
    public void display() {
        Node current = head;

        if (current == null) {
            System.out.println("The linked list is empty.");
            return;
        }

        System.out.print("Linked List: ");
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}

public class Main {
    public static void main(String[] args) {
        LinkedList myList = new LinkedList();

        myList.append(10);
        myList.append(20);
        myList.append(30);

        myList.display();
    }
}


// Linked List: 10 -> 20 -> 30 -> null





