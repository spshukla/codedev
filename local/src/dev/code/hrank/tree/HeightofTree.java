package dev.code.hrank.tree;

/**
 * Created by shreeprakash on 9/8/15.
 */
public class HeightofTree {
    public static void main(String args[]) {
        int arr[] = {8, 5, 6, 9, 10, 12};
        Node root = new Node(arr[0], null, null);
        for (int i = 1; i < arr.length; i++) {
            Node node = new Node(arr[i], null, null);
            Node.createTree(root, node);
        }

        int height = heightOfTree(root);
        System.out.println("Height of tree=" + height);

        Node node = new Node(10, null, null);
        findImmediateAncestor(root, node);
    }

    public static int heightOfTree(Node root) {
        if (root == null) {
            return 0;
        } else {
            int left = heightOfTree(root.left);
            int right = heightOfTree(root.right);
            if (left > right) {
                return left + 1;
            } else {
                return right + 1;
            }
        }
    }

    public static void findImmediateAncestor(Node root, Node node) {
        if (root != null) {
            if ((root.left != null && (root.left.data == node.data)) || (root.right != null && (root.right.data == node.data))) {
                System.out.println("Parent:" + root.data);
                return;
            }
            findImmediateAncestor(root.left, node);
            findImmediateAncestor(root.right, node);
        }
    }
}
