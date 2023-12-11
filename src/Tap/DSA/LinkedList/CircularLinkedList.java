package Tap.DSA.LinkedList;


class Node3 {
    int data;
    Node3 next;

    Node3(int data) {
        this.data = data;
        this.next = null;
    }

}

class Cll {
    Node3 head;

    void print() {
        if (this.head != null) {
            Node3 current = head;
            do {
                System.out.print(current.data + " ");
                current = current.next;
            } while (current != head);
        }
        System.out.println();
    }


    // o(n) complexity
    void addFirst(int element) {
        Node3 temp = new Node3(element);
        if (this.head == null) {
            this.head = temp;
            this.head.next = head;
        } else {
            Node3 current = this.head.next;
            while (current.next != this.head) {
                current = current.next;
            }
            current.next = temp;
            temp.next = this.head;
            this.head = temp;
        }
    }


//    efficiant approach o(1);
    void addEfficiantApproach(int element){
        Node3 temp = new Node3(element);
        if (this.head == null){
            this.head = temp;
            this.head.next = head;
        }else {
            temp.next = this.head.next;
            this.head.next = temp;
            int t = temp.data;
            temp.data = this.head.data;
            this.head.data = t;
        }
    }

    void addLast(int element){
        Node3 temp = new Node3(element);
        if (head == null){
            head = temp;
            head.next = head;
        }else {
            Node3 current = head.next;
            while (current.next != head){
                current = current.next;
                current.next = temp;
                temp.next = head;
            }
        }
    }



}

public class CircularLinkedList {
    public static void main(String[] args) {
        Cll cll = new Cll();

//        cll.head = new Node3(10);
//        cll.head.next = new Node3(20);
//        cll.head.next.next = new Node3(30);
//        cll.head.next.next.next = new Node3(40);
//        cll.head.next.next.next.next = cll.head;
//        cll.print();

        cll.addFirst(1);
        cll.addFirst(2);
        cll.addFirst(3);
        cll.print();
        cll.addEfficiantApproach(33);
        cll.print();
        cll.addLast(35);
        cll.print();

    }
}
