package LearningNode;

class Node {
    int data;
    Node next;
    
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class InsertionLinaklist {
    public static Node insertAtFirst(Node head, int data) {
        Node newNode = new Node(data);
        
        newNode.next = head;
        return newNode;
    }
    
    public static void main(String[] args) {
        Node head = null;
        head = insertAtFirst(head, 10);
        head = insertAtFirst(head, 20);
        head = insertAtFirst(head, 30);
        
        // Print the linked list
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}
