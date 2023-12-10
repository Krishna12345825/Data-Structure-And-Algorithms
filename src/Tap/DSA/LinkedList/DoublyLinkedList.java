package Tap.DSA.LinkedList;

class Node1 {
     int data;
     Node1 next;
     Node1 prev;

    Node1(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class Dll {
    Node1 head;
    Node1 tail;

    void add(int data){
        Node1 temp = new Node1(data);
        if (head == null){
            head = temp;
            tail = temp;
        }else {
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }
    }

}

public class DoublyLinkedList {
    public static void main(String[] args) {

//        Node1 list = new Node1(10);
//        System.out.println(list.data);
//        System.out.println(list.prev);
//        System.out.println(list.next);

        Dll list = new Dll();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

//        System.out.println(list.head.data);
//        System.out.println(list.tail.data);


    }
}
