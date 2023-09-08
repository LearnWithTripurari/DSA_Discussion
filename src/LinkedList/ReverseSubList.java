package LinkedList;

public class ReverseSubList {

    static ListNode root = null;

    static class ListNode {
        int data;
        ListNode next;

        ListNode(int val) {
            this.data = val;
            this.next = null;
        }
    }

    public static void main(String[] args) {

        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
//        ListNode n4 = new ListNode(72);

        root = n1;
        n1.next = n2;
        n2.next = n3;
//        n3.next = n4;

        printList(root);

        ListNode reverseSubListHead = reverseSubList(root, 1, 2);

        System.out.println("Reverse the list :-");

        printList(reverseSubListHead);

    }

    static ListNode reverseSubList(ListNode A, int B, int C) {

        if (A == null || B == C) {
            return A;
        }

        ListNode nodeBeforeSubList, firstNodeOfSubList, CN, PN;
        nodeBeforeSubList = PN = null;

        for (int i = 1; i < B; i++) {

            if (nodeBeforeSubList == null) {
                nodeBeforeSubList = A;
            } else {
                nodeBeforeSubList = nodeBeforeSubList.next;
            }
        }


        if (nodeBeforeSubList == null) {
            CN = firstNodeOfSubList = A;
        } else {
            CN = firstNodeOfSubList = nodeBeforeSubList.next;
        }


        for (int i = B; CN != null && i <= C; i++) {
            ListNode temp = CN.next;
            CN.next = PN;
            PN = CN;
            CN = temp;
        }

        firstNodeOfSubList.next = CN;

        if(nodeBeforeSubList != null) {
            nodeBeforeSubList.next = PN;
            return A;
        }
        else {
            return PN;
        }

    }

    static void printList(ListNode node) {
        ListNode CN = node;

        while (CN != null) {
            System.out.println(CN.data);
            CN = CN.next;
        }
    }


}
