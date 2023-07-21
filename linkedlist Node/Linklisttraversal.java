class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    public void traverse() {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}

public class Linklisttraversal {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        
        // Create a sample linked list
        list.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        list.head.next = second;
        second.next = third;

        // Traverse the linked list and print the elements
        list.traverse();
    }
}
