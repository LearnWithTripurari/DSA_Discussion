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
         insertEnd(1);
         insertEnd(2);
         insertEnd(3);

         insertAtIndex(4,2);
         insertAtIndex(5, 0);

         Node temp = head;

         while (temp != null) {
             System.out.println(temp.data);
             temp = temp.next;
         }

        System.out.println("    // Tail");

        Node tailTemp = tail;

         while (tailTemp != null) {
             System.out.println(tailTemp.data);
             tailTemp = tailTemp.prev;
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

}
