package lectures.linkedList.code;


public class Main {
    public static void main(String[] args) {
      /*  Q1LinkedList q1LinkedList = new Q1LinkedList();
        // insert first elements
        q1LinkedList.insertFirst(12);
        q1LinkedList.insertFirst(13);
        q1LinkedList.insertFirst(14);
        q1LinkedList.insertFirst(15);
        q1LinkedList.insertFirst(17);
// insert last elements
        q1LinkedList.insertLast(99);
        q1LinkedList.insertLast(100);

        // insert Anywhere between index 0 to end

        q1LinkedList.insert(1, 1);
        q1LinkedList.insert(345, 4);

        // delete first Element
        System.out.println(q1LinkedList.deleteFirst());
        q1LinkedList.display();
        // delete last elements
        System.out.println(q1LinkedList.deleteLast());
        // display the elements
        q1LinkedList.display();
        System.out.println(q1LinkedList.delete(3));
        q1LinkedList.display();


        */




  /*

        Q2DaublyLinkedList daublyLinkedList = new Q2DaublyLinkedList();
        daublyLinkedList.insertFirst(12);
        daublyLinkedList.insertFirst(13);
        daublyLinkedList.insertFirst(124);
        daublyLinkedList.insertFirst(127);
        daublyLinkedList.display();
        daublyLinkedList.insertLast(1);
        daublyLinkedList.display();
        daublyLinkedList.insert(1, 34);
        daublyLinkedList.display();



        */


        Q3CircularLinkedList linkedList = new Q3CircularLinkedList();
        linkedList.insert(12);
        linkedList.insert(123);
        linkedList.insert(124);
        linkedList.insert(126);
        linkedList.display();


        linkedList.delete(126);
        linkedList.display();

    }


}
