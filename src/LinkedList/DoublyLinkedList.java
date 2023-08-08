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


         insertEnd(1);
         insertEnd(2);
         insertEnd(3);

         insertAtIndex(4,2);

         Node temp = head;

         while (temp != null) {
             System.out.println(temp.data);
             temp = temp.next;
         }


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

        if(head == null) {
            System.out.println("List is empty!");
            return;
        }

        Node currentNode = head;
        int currentIndex = 0;

        while (currentNode !=  null && currentIndex < index - 1) {
            currentNode = currentNode.next;
            currentIndex++;
        }

        if (currentNode == null) {
            System.out.println("Invalid index");
            return;
        }


       newNode.next = currentNode.next;
        newNode.prev = currentNode;

        if(currentNode.next != null) {
            currentNode.next.prev = newNode;
        }
        currentNode.next = newNode;

    }

}
