package Tap.DSA.LinkedList.SingleLinkedList;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    void printLinkedList() {
        Node temp = this.head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }


    void add(int data) {
        Node temp = new Node(data);
        if (head == null) {
            head = temp;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = temp;
        }
    }

    void addFirst(int data) {
        Node temp = new Node(data);
        if (head == null) {
            head = temp;
        } else {
            temp.next = head;
            head = temp;
        }
    }

    void addLast(int index, int data) throws IndexOutOfBoundsException {
        try {
            if (index == 0) {
                addFirst(data);
            } else {
                Node temp = new Node(data);
                int count = 0;
                Node current = this.head;
                while (count < index - 1) {
                    current = current.next;
                    count++;
                }
                temp.next = current.next;
                current.next = temp;
            }
        } catch (NullPointerException e) {
            throw new IndexOutOfBoundsException();
        }
    }

    void addAll(int[] elements) {
        for (int element : elements) {
            add(element);
        }
    }

    void removeFirst() {
        if (head == null) {
        } else if (head.next == null) {
            head = null;
        } else if (head.next != null) {
            Node current = head;
            head = head.next;
            current.next = null;
        }
    }

    void removeLast() {
        if (head == null) {
        } else if (head.next == null) {
            head = null;
        } else if (head.next != null) {
            Node current = head;
            while (current.next.next != null) {
                current = current.next;
            }
            current.next = null;
        }
    }

    int indexOf(int element) {
        Node current = head;
        int count = 0;
        while (current != null) {
            if (current.data == element) {
                return count;
            }
            current = current.next;
            count++;
        }
        return -1;
    }

    int lastIndexOf(int element) {
        Node current = head;
        int count = 0;
        int index = -1;
        while (current != null) {
            if (current.data == element) {
                index = count;
            }
            current = current.next;
            count++;
        }
        return index;
    }



}

public class SingleLinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.add(10);
        list.add(20);
        list.add(30);
        list.printLinkedList();

        System.out.println();
        list.addFirst(50);
        list.printLinkedList();

        System.out.println();
        list.addLast(3, 25);
        list.printLinkedList();

        System.out.println();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        list.addAll(arr);
        list.printLinkedList();

        System.out.println();
        list.removeFirst();
        list.printLinkedList();

        System.out.println();
        list.removeLast();
        list.printLinkedList();

        System.out.println();
        System.out.println(list.indexOf(3));

        System.out.println(list.lastIndexOf(9));





       /* Node p1 = new Node(10);
        Node p2 = new Node(20);
        Node p3 = new Node(30);
        Node p4 = new Node(40);

        // System.out.println(p1.data);
        p1.next = p2;
        p2.next = p3;
        p3.next = p4;
        list.head = p1;
        list.printLinkedList();*/


    }
}
