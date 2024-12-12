class Node {
    int data;
    Node prev;
    Node next;

    // Constructor to create a new node
    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

class DoublyLinkedList {
    Node head; // Head of the list

    // Constructor to initialize an empty list
    DoublyLinkedList() {
        this.head = null;
    }

    // Method to insert a node at the end of the DLL
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);

        // If the list is empty, make the new node the head
        if (head == null) {
            head = newNode;
            return;
        }

        // Traverse to the last node
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        // Update the last node's next and the new node's prev
        temp.next = newNode;
        newNode.prev = temp;
    }

    // Method to display the list
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();

        // Insert elements at the end
        dll.insertAtEnd(10);
        dll.insertAtEnd(20);
        dll.insertAtEnd(30);

        // Display the list
        System.out.println("Doubly Linked List:");
        dll.display();
    }
}
