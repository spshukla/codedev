package dev.code.hrank.linkedlist;

/**
 * Created by shreeprakash on 9/6/15.
 */
public class Node {
    int data;
    Node next;

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    public Node() {

    }

    public static void createLinkedList(Node head, Node node) {
        while (head.next != null) {
            head = head.next;
        }
        head.next = node;
    }


    public static void printLinkedList(Node head) {
        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }
}
