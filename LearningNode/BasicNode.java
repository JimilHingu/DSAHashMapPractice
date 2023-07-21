package LearningNode;

public class BasicNode {
    public static class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

        public int getData() {
            return data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    public static void main(String[] args) {
        // Create nodes
        Node node1 = new Node(10);
        Node node2 = new Node(20);
        Node node3 = new Node(30);

        // Link nodes
        node1.setNext(node2);
        node2.setNext(node3);

        // Access node data
        System.out.println(node1.getData()); // Output: 10
        System.out.println(node2.getData()); // Output: 20
        System.out.println(node3.getData()); // Output: 30

        // Traverse the linked list
        Node currentNode = node1;
        while (currentNode != null) {
            System.out.println(currentNode.getData());
            currentNode = currentNode.getNext();

        }
    }

}
