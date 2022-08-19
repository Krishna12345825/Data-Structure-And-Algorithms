package lectures.linkedList.code;

public class Q1LinkedList {

    private Node head;
    private Node tail;
    private int size;

    public Q1LinkedList() {
        this.size = 0;
    }


    private class Node {
        private int value;
        private Node next;
        private Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }


    }

    // insert first Node
    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
        size += 1;
    }


    // print the Nodes
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    // insert at last
    public void insertLast(int val) {

        if (tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }


    // insert Anyware between index 0 to end
    public void insert(int val, int index) {
        if (index == 0) {
            insertLast(val);
            return;
        }
        if (index == size) {
            insertLast(val);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }

    // delete the first Elements
    public int deleteFirst() {
        int temp = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return temp;
    }

    // It will return the referenced pointer to that node
    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }


    // delete last Elements
    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }
        Node secondLast = get(size - 2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        return val;
    }

    // delete last elements
    public int delete(int index) {
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size - 1) {
            return deleteLast();
        }
        Node prev = get(index - 1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        return val;
    }

    // find the value
    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }


    public void delete(int after, int val) {
        Node p = find(after);
        if (p == null) {
            System.out.println("Does not exist ");
            return;
        }
        Node node = new Node(val);
        node.next = p.next;
        p.next = node;
        node.prev = p;
        if (node.next != null) {
            node.next.prev = node;
        }
    }


    // Q-01: Recursive Insertion in LinkedList
    public void insertRec(int val, int index) {
        head = insertRec(val, index, head);
    }

    private Node insertRec(int val, int index, Node node) {
        if (index == 0) {
            Node temp = new Node(val, node);
            size++;
            return temp;
        }
        node.next = insertRec(val, index - 1, node.next);
        return node;
    }


    // Q-02: Remove Duplicates from Sorted LinkedList
    // https://leetcode.com/problems/remove-duplicates-from-sorted-list
    public void duplicates() {
        Node node = head;
        while (node.next != null) {
            if (node.value == node.next.value) {
                node.next = node.next.next;
                size--;
            } else {
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
    }



    // Q-03: Merge Two Sorted LinkedLists
    //https://leetcode.com/problems/merge-two-sorted-lists/
 public static Q1LinkedList merge(Q1LinkedList first, Q1LinkedList second){
        Node f= first.head;
        Node s= second.head;
        Q1LinkedList ans= new Q1LinkedList();
        while (f!=null && s!=null){
            if (f.value<s.value){
                ans.insertLast(f.value);
                f=f.next;
            }else {
                ans.insertLast(s.value);
                s=s.next;
            }
        }
        while (f!=null){
            ans.insertLast(f.value);
            f=f.next;
        }
        while (s!=null){
            ans.insertLast(s.value);
            s=s.next;
        }
        return ans;
 }

    public static void main(String[] args) {
      /*  Q1LinkedList list = new Q1LinkedList();
        list.insertFirst(1);
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(3);
        list.insertFirst(3);
        list.insertFirst(3);
        list.display();
        list.duplicates();
        list.display();*/

        // Q-03: Merge Two Sorted LinkedLists
        Q1LinkedList first= new Q1LinkedList();
        Q1LinkedList second= new Q1LinkedList();
        first.insertLast(1);
        first.insertLast(3);
        first.insertLast(5);

        second.insertLast(1);
        second.insertLast(2);
        second.insertLast(9);
        second.insertLast(14);

        Q1LinkedList ans= Q1LinkedList.merge(first,second);
        ans.display();

    }


}
