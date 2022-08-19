package lectures.tree.binaryTree.bookQuestions;
// 1. Binary tree :problem & solution
// problem -1 Give a algorithms for finding maximum elements in binary tree

public class Q1MaxElements {
    public Node root;

    public Q1MaxElements() {
        this.root = null;
    }

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public int maxNode(Node root) {
        int maxValue = Integer.MIN_VALUE;
        if (root != null) {
            int maxLeft = maxNode(root.left);
            int maxRight = maxNode(root.right);
            if (maxLeft > maxRight)
                maxValue = maxLeft;
            else
                maxValue = maxRight;
            if (root.data > maxValue)
                maxValue = root.data;
        }
        return maxValue;
    }

    public static void main(String[] args) {
        Q1MaxElements maxElements = new Q1MaxElements();
        maxElements.root = new Node(15);
        maxElements.root = new Node(15);
        maxElements.root.right = new Node(35);
        maxElements.root.left = new Node(20);
        maxElements.root.left.left = new Node(74);
        maxElements.root.right.left = new Node(55);
        maxElements.root.right.right = new Node(6);
        System.out.println("Largest Element in the binary tree   " + maxElements.maxNode(maxElements.root));

    }


}
