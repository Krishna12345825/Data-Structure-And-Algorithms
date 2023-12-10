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

    void print(){
        Node1 current = this.head;
        while (current != null){
            System.out.print(current.data+ " ");
            current = current.next;
        }
        System.out.println();
    }

    void printReverse(){
        Node1 current = this.tail;
        while (current != null){
            System.out.print(current.data + " ");
            current = current.prev;
        }
        System.out.println();
    }

    void addFirst(int data){
        Node1 temp = new  Node1(data);
        if (this.head == null){
            this.head = temp;
            this.tail = temp;
        }else {
            temp.next = head;
            head.prev = temp;
            head = temp;
        }
    }

    void addIndex(int length, int data){
        Node1 temp = new Node1(data);

        int count = 0;
        Node1 current = this.head;
        while (count < length -1){
            current = current.next;
            count++;
        }
        current.next.prev = temp;
        temp.next = current.next;
        current.next = temp;
        temp.prev = current;
    }

    void addAll(int [] elements){
        for (int element : elements){
            this.add(element);
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

        list.print();
        list.printReverse();
        list.addFirst(50);
        list.print();

        list.addIndex(4, 33);
        list.print();

        int []arr = {1,2,3,4,5,6};
        list.addAll(arr);
        list.print();
    }
}
