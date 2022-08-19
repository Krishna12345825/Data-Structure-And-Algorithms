package lectures.tree.binaryTree.bookQuestions;

import lectures.tree.binaryTree.code.Q1BinaryTree;

public class Q2minElements {
    public Node root;

    Q2minElements() {
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

    public static int minElements(Node root) {
        int minValue = Integer.MIN_VALUE;
        if (root != null) {
            int leftNode = minElements(root.left);
            int rightNode = minElements(root.right);
            if (leftNode < rightNode)
                minValue = leftNode;
            else
                minValue = rightNode;
            if (minValue < root.data)
                minValue = root.data;
        }
        return minValue;
    }


    public static void main(String[] args) {
        Q2minElements minElements = new Q2minElements();
        minElements.root = new Q2minElements.Node(15);
        minElements.root.right = new Q2minElements.Node(35);
        minElements.root.left = new Q2minElements.Node(40);
        minElements.root.left.left = new Q2minElements.Node(74);
        minElements.root.right.left = new Q2minElements.Node(55);
        minElements.root.right.right = new Q2minElements.Node(6);
        System.out.println("Smallest Element in the binary tree   " + minElements.minElements(minElements.root));
    }
}

