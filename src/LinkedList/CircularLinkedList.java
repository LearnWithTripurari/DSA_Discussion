package LinkedList;

public class CircularLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static Node head = null;


    public static void main(String[] args) {
        insert(1);
        insert(3);
        insert(4);
        insert(5);

        traverse();
    }

    static void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            newNode.next = newNode;
            head = newNode;
        }
        else {
            Node currentNode = head;

            while (currentNode.next != head) {
                currentNode = currentNode.next;
            }

            currentNode.next = newNode;
            newNode.next = head;
        }
    }

    static void traverse() {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        System.out.println(head.data);
        Node temp = head.next;

        while (temp != head) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }


}
