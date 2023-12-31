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


        insertAtIndex(1,4);
//
//        deleteAtIndex(3);


        // Traversing
        Node temp = head;

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }

        System.out.println("-------------------------- Length of the Linked List -----------------------------");


        int listLen = getLength();
        System.out.println("Length " +listLen);


//        System.out.println("--------------------------Reversed element of the Linked List -----------------------------");
//
//        // Reverse the Linked List
//        Node reverseListHead = reverseList();
//
//        Node reverseListHeadTemp = reverseListHead;
//
//        while (reverseListHeadTemp != null) {
//            System.out.println(reverseListHeadTemp.data);
//            reverseListHeadTemp = reverseListHeadTemp.next;
//        }

        System.out.println("------------------------ Middle Element of the Linked List --------------------------------");

       Node middleNode = findMiddle();

       if(middleNode != null) {
           System.out.println(middleNode.data);
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

    public static void insertAtIndex(int index, int data) {

        Node newNode = new Node(data);

        if(index == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node currentNode = head;
        int currentIndex = 0;

        while (currentNode != null && currentIndex < index - 1) {
            currentNode = currentNode.next;
            currentIndex++;
        }

        if (currentNode == null) {
            System.out.println("Invalid index");
            return;
        }

        newNode.next = currentNode.next;
        currentNode.next = newNode;

    }

    public static void deleteAtIndex(int index) {

        if(head == null) {
            System.out.println("List is empty!");
           return;
        }

        if (index == 0) {
            head = head.next;
            return;
        }

        Node currentNode = head;
        Node previousNode = null;

        int currentIndex = 0;

        while (currentNode != null && currentIndex < index) {
            previousNode = currentNode;
            currentNode = currentNode.next;
            currentIndex++;
        }

        if(currentNode == null) {
            System.out.println("Invalid index");
            return;
        }
        if (previousNode == null) {
            System.out.println("Previous Node can not be null");
            return;
        }

        previousNode.next = currentNode.next;
    }

    public static Node reverseList() {

        Node previousNode = null;
        Node currentNode = head;

        while (currentNode != null) {
           Node temp = currentNode.next;
           currentNode.next = previousNode;
           previousNode = currentNode;
           currentNode = temp;
        }

        return previousNode;
    }

    public static Node findMiddle() {

        int mid = (int) Math.ceil(getLength() / 2);

        int len =  getLength() % 2 == 0 ? mid + 1 : mid;

        Node currentNode = head;

        while (currentNode != null && len > 1) {
            len--;
            currentNode = currentNode.next;
        }

        return currentNode;
    }

    public static int getLength() {
        int length = 0;

        Node currentNode = head;

        while (currentNode != null) {
            length++;
            currentNode = currentNode.next;
        }

        return length;
    }


}
