package dev.code.hrank.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by shreeprakash on 9/2/15.
 */
public class LevelOrderTraversal {
    public static void main(String args[]) {
        Node root = new Node();
        // Queue Solution
        levelOrderTraversalUsingQueue(root);
        // Recursion Solution
        invokeRecursionSolution(root);
    }

    public static void levelOrderTraversalUsingQueue(Node root) {
        Queue<Node> queueCurrent = new LinkedList<>();
        Queue<Node> queueNext = new LinkedList<>();
        List<Integer> arrList = new ArrayList<>();
        queueCurrent.add(root);
        while (!queueCurrent.isEmpty()) {
            Node next = queueCurrent.remove();
            if (next.left != null) {
                queueNext.add(next.left);
            }
            if (next.right != null) {
                queueNext.add(next.right);
            }
            arrList.add(next.data);
            if (queueCurrent.isEmpty()) {
                queueCurrent = queueNext;
                queueNext = new LinkedList<>();
            }
        }
        for (Integer i : arrList) {
            System.out.print(i);
        }
    }

    public static void invokeRecursionSolution(Node root) {
        Node left = root.left;
        Node right = root.right;
        System.out.print(root.data + " ");
        levelOrderTraversalUsingRecursion(left, right);
    }

    public static void levelOrderTraversalUsingRecursion(Node left, Node right) {
        Node leftNextLeft = null;
        Node leftNextRight = null;
        Node rightNextLeft = null;
        Node rightNextRight = null;
        if (left != null) {
            leftNextLeft = left.left;
            leftNextRight = left.right;
            System.out.print(left.data + " ");
        }
        if (right != null) {
            rightNextLeft = right.left;
            rightNextRight = right.right;
            System.out.print(right.data + " ");
        }
        levelOrderTraversalUsingRecursion(leftNextLeft, leftNextRight);
        levelOrderTraversalUsingRecursion(rightNextLeft, rightNextRight);
    }
}
