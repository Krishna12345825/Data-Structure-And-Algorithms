package Tap.DSA.Binary_Tree;

import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

}

public class Tree {
    public static void main(String[] args) {
        Node root = null;
        root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.right = new Node(60);

        System.out.println("DFS/ (Depfth first search)/ InOrder Traversal reccurssion");
        inOrder(root);
        System.out.println();

        System.out.println("DFS/ (Depfth first search)/ PreOrder Traversal reccurssion");
        preOrder(root);
        System.out.println();

        System.out.println("DFS/ (Depfth first search)/ PostOrder Traversal reccurssion");
        postOrder(root);
        System.out.println();

        System.out.println("DFS/ (Depfth first search)/  Height of nodes using reccursion");
        System.out.println(heightOf(root));
        System.out.println();

        System.out.println("DFS/ (Depfth first search)/ print Nodes at Distance k");
        printKDistance(root, 2);
        System.out.println();

        System.out.println("BFS/ (Breadth first search)/ level order traversal");
        leveOrder(root);
        System.out.println();

        System.out.println("Size of the Tree");
        System.out.println(size(root));
        System.out.println();

        System.out.println("DFS(Defth first search) / Maximum in Binary tree");
        System.out.println(max(root));
        System.out.println();

        System.out.println("Level Order Traversal_Line By Line (Approach1)");
        levelOrderLineByLine(root);
        System.out.println();
    }


    //   DFS/ (Depfth first search)/ InOrder Traversal reccurssion
    static void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }

    //   DFS/ (Depfth first search)/ PreOrder Traversal reccurssion
    static void preOrder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    //   DFS/ (Depfth first search)/ PostOrder Traversal reccurssion
    static void postOrder(Node root) {
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }
    }

    //  DFS/ (Depfth first search)/  Height of nodes using reccursion
    static int heightOf(Node root) {
        if (root == null) {
            return 0;
        } else {
            int leftHeight = heightOf(root.left);
            int rightHeight = heightOf(root.right);
            return (leftHeight > rightHeight ? leftHeight : rightHeight) + 1;
        }
    }

    //   DFS/ (Depfth first search)/ print Nodes at Distance k
    static void printKDistance(Node root, int k) {
        if (root != null) {
            if (k == 0) {
                System.out.print(root.data + " ");
            } else {
                printKDistance(root.left, k - 1);
                printKDistance(root.right, k - 1);
            }
        }
    }


    // BFS/ (Breadth first search)/ level order traversal
    static void leveOrder(Node root) {
        Queue<Node> q = new LinkedList<Node>();
        if (root != null) {
            q.add(root);
            while (q.size() > 0) {
                Node current = q.poll();
                System.out.print(current.data + " ");
                if (current.left != null) {
                    q.add(current.left);
                }
                if (current.right != null) {
                    q.add(current.right);
                }
            }
        }
    }


    //    Size of the Tree
    static int size(Node root) {
        if (root == null) {
            return 0;
        } else {
            int leftSize = size(root.left);
            int rightSize = size(root.right);
            return leftSize + rightSize + 1;
        }
    }

    //    DFS(Defth first search) / Maximum in Binary tree
    static int max(Node root) {
        if (root == null) {
            return Integer.MAX_VALUE;
        } else {
            int leftMax = max(root.left);
            int rightMax = max(root.right);
            return Math.max(Math.max(leftMax, rightMax), root.data);
        }
    }

//    Level Order Traversal_Line By Line (Approach1)

    static void levelOrderLineByLine(Node root) {
        Queue<Node> q = new LinkedList<Node>();
        if (root != null) {
            q.add(root);
            q.add(null);
            while (q.size() > 1) {
                Node current = q.poll();
                if (current == null) {
                    System.out.println();
                    q.add(null);
                } else {
                    System.out.print(current.data + " ");
                    if (current.left != null) {
                        q.add(current.left);
                    }
                    if (current.right != null) {
                        q.add(current.right);
                    }
                }
            }
        }
    }


}

