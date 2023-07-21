package LearningNode;

import LearningNode.LinkedLisr.Node;

public class LinkedLisr {
    public static class Node {
        private int data;
        private Node next;
        public boolean empty;

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
        Node node1 = new Node(10);
        Node node2 = new Node(20);
        Node node3 = new Node(30);
        while(!node1.empty){
            System.out.println();
        }
    }
}
