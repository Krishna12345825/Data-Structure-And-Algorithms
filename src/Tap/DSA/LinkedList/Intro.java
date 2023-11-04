package Tap.DSA.LinkedList;

public class Intro {
    public static void main(String[] args) {
        LinkedList list =new LinkedList();

       /* Node p1= new Node(12);
        Node p2=new Node(13);
        Node p3 = new Node(14);
        p1.next=p2;
        p2.next=p3;
        list.head=p1;*/
        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);
        list.printLinkedList();

    }
}
