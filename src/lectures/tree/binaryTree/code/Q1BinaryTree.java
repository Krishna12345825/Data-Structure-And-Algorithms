package lectures.tree.binaryTree.code;

import javax.swing.tree.TreeNode;
import java.util.LinkedList;
import java.util.Queue;

//1. Build Tree from given Preorder Sequence
public class Q1BinaryTree {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    //1. Build a Tree from its Preorder traversal
    static class BinaryTree {
        static int indx = -1;

        public static Node buildTree(int nodes[]) {
            indx++;
            if (nodes[indx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[indx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }

    /*    2. Tree Traversals
        a. preorder  */
    public static void preorder(Node root) {
        if (root == null) {
            System.out.println(-1 + " ");
            return;
        }
        System.out.println(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    /*    2. Tree Traversals
     b. postorder  */

    public static void postorder(Node root) {
        if (root == null) {
            System.out.println(-1 + " ");
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.data + " ");
    }

    /*    2. Tree Traversals
     c. inorder  */

    public static void inorder(Node root) {
        if (root == null) {
            System.out.println(-1 + " ");
        }
        inorder(root.left);
        System.out.println(root.data + " ");
        inorder(root.right);
    }


    /*    2. Tree Traversals
     d. Level Order
      */

    public static void levelorder(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            Node curr = q.remove();
            if (curr == null) {
                System.out.println();
                // queue empty
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.println(curr.data + " ");
                if (curr.left != null) {
                    q.add(curr.left);
                }
                if (curr.right != null) {
                    q.add(curr.right);
                }
            }
        }
    }


    /* 3. Height of Tree*/

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    /*4. Count of Nodes of Tree*/
    public static int countofNodes(Node root) {
        if (root == null) {
            return 0;
        }
        int leftNodes = countofNodes(root.left);
        int rightNodes = countofNodes(root.left);
        return leftNodes + rightNodes + 1;
    }

    /*    5. Sum of Nodes of Tree*/
    public static int sumofNodes(Node root) {
        if (root == null) {
            return 0;
        }
        int leftSum = sumofNodes(root.left);
        int rightSum = sumofNodes(root.right);
        return leftSum + rightSum + root.data;
    }

    /*   6.  Diameter of Tree - Approach1 O(N^2)  */
    public static int diameter(Node root) {
        if (root == null) {
            return 0;
        }
        int diam1 = diameter(root.left);
        int diam2 = diameter(root.right);
        int diam3 = height(root.left) + height(root.right) + 1;
        return Math.max(diam3, Math.max(diam1, diam2));
    }


    /*  7. Diameter of Tree - Approach2 O(N)*/

    static class TreeInfo {
        int height;
        int diam;

        TreeInfo(int height, int diam) {
            this.height = height;
            this.diam = diam;
        }
    }

    public static TreeInfo diameter2(Node root) {
        if (root == null) {
            return new TreeInfo(0, 0);
        }

        TreeInfo leftTI = diameter2(root.left);
        TreeInfo rightTI = diameter2(root.right);

        int myHeight = Math.max(leftTI.height, rightTI.height) + 1;


        int diam1 = leftTI.diam;
        int diam2 = rightTI.diam;
        int diam3 = leftTI.height + rightTI.height + 1;
        int myDiam = Math.max(Math.max(diam1, diam2), diam3);

        return new TreeInfo(myHeight, myDiam);
    }



    /*
     *//*  8. Subtree of another tree   leetcode question *//*
public boolean isIdentical(TreeNode root,TreeNode subRoot){
    if(subRoot == null && root == null){
        return true;
    }
    if(root == null || subRoot == null){
        return false;
    }
    if(root.val == subRoot.val){
        return isIdentical(root.left, subRoot.left) && isIdentical(root.right, subRoot.right);
    }
    return false;
}

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(subRoot == null){
            return true;
        }
        if(root == null){
            return false;
        }
        if(isIdentical(root, subRoot)){
            return true;
        }
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }*/


    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(root.data);

    }


}
