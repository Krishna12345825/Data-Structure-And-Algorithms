package Tap.DSA.LinkedList;

class Node1 {
     int data;
     Node next;
     Node prev;

    Node1(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class Dll {
    Node1 head;
    Node1 tail;



}

public class DoublyLinkedList {
    public static void main(String[] args) {

        Node1 list = new Node1(10);
        System.out.println(list.data);
        System.out.println(list.prev);
        System.out.println(list.next);
    }
}
