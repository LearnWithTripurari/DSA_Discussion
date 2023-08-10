package LinkedList;

public class DoublyLinkedList {

    static Node head = null;
    static Node tail = null;

    static class Node {
      Node prev;
      int data;
      Node next;

      Node(int data) {
          this.data = data;
      }
    }


    public static void main(String[] args) {


        insertAtIndex(6, 0);
        traverse();

        insertEnd(1);
        traverse();

        insertEnd(2);
        traverse();

        insertEnd(3);
        traverse();


        insertAtIndex(4,2);
        traverse();

        insertAtIndex(5, 0);
        traverse();


        deleteAtIndex(0);
        traverse();

        deleteAtIndex(3);
        traverse();

        deleteAtIndex(3);
        traverse();


    }

    static void insertEnd(int data) {

        Node newNode = new Node(data);

        if (tail == null) {
            head = newNode;
            tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;

    }

    static void insertAtIndex(int data, int index) {

        Node newNode = new Node(data);

        if(index == 0) {

             newNode.next = head;

             if (head != null) {
                 head.prev = newNode;
             }

             head = newNode;

             if (tail == null) {
                 tail = newNode;
             }
        }
        else {

            Node currentNode = head;
            int currentIndex = 0;

           while (currentNode !=  null && currentIndex < index - 1) {
            currentNode = currentNode.next;
            currentIndex++;
          }

           if (currentNode == null) {
               System.out.println("Invalid Index");
               return;
           }

           newNode.next = currentNode.next;

            if(currentNode.next != null ) {
                currentNode.next.prev = newNode;
            }

           newNode.prev = currentNode;

           currentNode.next = newNode;



           if (newNode.next == null) {
               tail = newNode;
           }

        }

    }

    static void deleteAtIndex(int index) {

        if (index == 0) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
            if (head == null) {
                tail = null;
            }
        }
        else {

            Node currentNode = head;
            int currentIndex = 0;

            while (currentNode != null && currentIndex < index) {
                currentNode = currentNode.next;
                currentIndex++;
            }

            if (currentNode == null) {
                System.out.println("Invalid index");
                return;
            }

            if (currentNode == tail) {
                tail = tail.prev;
                tail.next = null;
                return;
            }

            currentNode.prev.next = currentNode.next;
            currentNode.next.prev = currentNode.prev;

        }
    }

    static  void traverse() {
        Node temp = head;

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }

        System.out.println("--------------------------------");
    }

}
