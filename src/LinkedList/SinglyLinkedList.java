package LinkedList;

class Node {
    int data;
    Node next;

    Node(int _data) {
        this.data = _data;
        this.next = null;
    }
}

public class SinglyLinkedList {

    static Node head = null;

    public static void main(String[] args) {

//        Node node1 = new Node(1);
//        Node node2 = new Node(2);
//        Node node3 = new Node(3);
//        Node node4 = new Node(4);
//        Node node5 = new Node(5);
//
//        head = node1;
//        node1.next = node2;
//        node2.next = node3;
//        node3.next = node4;
//        node4.next = node5;


        insertNode(1);
        insertNode(2);
        insertNode(3);

        // Traversing
        Node temp = head;

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }


    public static void insertNode(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node lastNode = head;

        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }

        lastNode.next = newNode;
    }

}
