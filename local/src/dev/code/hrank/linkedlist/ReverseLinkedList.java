package dev.code.hrank.linkedlist;

/**
 * Created by shreeprakash on 9/6/15.
 */
public class ReverseLinkedList {

    private static Node finalHead = null;

    public static void main(String args[]) {
        Node head = new Node();
        head.data = 1;
        head.next = null;
        Node.createLinkedList(head, new Node(2, null));
        Node.createLinkedList(head, new Node(3, null));
        Node.createLinkedList(head, new Node(4, null));
        Node.createLinkedList(head, new Node(5, null));
        Node.createLinkedList(head, new Node(6, null));
        Node val = reverseList(head, head.next);
        Node.printLinkedList(val);
    }

    public static Node reverseList(Node head, Node prevNode) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            head.next = prevNode;
            return head;
        }
        Node valNode = reverseList(head.next, head);
        head.next = prevNode;
        return valNode;
    }
}
