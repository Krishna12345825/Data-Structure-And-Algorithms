package Tap.DSA.Tree;

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

        inOrder(root);
        System.out.println();
        preOrder(root);
        System.out.println();
        postOrder(root);
        System.out.println();
        System.out.println(heightOf(root));
    }


//    InOrder Traversal reccurssion
    static void inOrder(Node root){
        if (root != null){
            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);
        }
    }

    //    PreOrder Traversal reccurssion
    static void preOrder(Node root){
        if (root != null){
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    //    PostOrder Traversal reccurssion
    static void postOrder(Node root){
        if (root != null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+ " ");
        }
    }

//    Height of nodes using reccursion
    static int  heightOf(Node root){
        if (root == null){
            return 0;
        }else {
            int leftHeight = heightOf(root.left);
            int rightHeight = heightOf(root.right);
          return   (leftHeight > rightHeight ? leftHeight : rightHeight) + 1;
        }
    }
}
