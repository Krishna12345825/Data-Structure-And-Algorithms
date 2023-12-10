package Tap.DSA.LinkedList.SingleLinkedList;

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

class LinkedList{
    Node head;
     void printLinkedList(){
        Node temp = this.head;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
public class SingleLinkedList {
    public static void main(String[] args) {
      LinkedList list =  new LinkedList();
        Node p1 = new Node(10);
        Node p2 = new Node(20);
        Node p3 = new Node(30);
        Node p4 = new Node(40);

       // System.out.println(p1.data);
        p1.next = p2;
        p2.next = p3;
        p3.next = p4;

       list.head =  p1;
       list.printLinkedList();





    }
}
