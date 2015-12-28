package dev.code.hrank.tree;

/**
 * Created by shreeprakash on 9/2/15.
 */
public class Node {
    int data;
    Node left;
    Node right;

    Node() {

    }

    Node(int data, Node left, Node right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public static void createTree(Node root, Node node) {
        if (node.data <= root.data) {
            if (root.left == null) {
                root.left = node;
            } else {
                createTree(root.left, node);
            }
        } else {
            if (root.right == null) {
                root.right = node;
            } else {
                createTree(root.right, node);
            }
        }
    }
}
