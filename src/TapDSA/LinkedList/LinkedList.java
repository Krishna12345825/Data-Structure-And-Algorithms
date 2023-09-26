package TapDSA.LinkedList;

public class LinkedList {
    Node head;
    void printLinkedList(){
        Node current=head;
        while (current!=null){
            System.out.print(current.data+" ");
          current= current.next;
        }
    }

    void add(int data){
        Node temp=new Node(data);
        if(head==null){
            head=temp;
        }else {
            Node current=head;
            while (current!=null){
                current=current.next;
            }
            current.next=temp;
        }
    }

    void addFirst(int data){
        Node temp= new Node(data);
        if(head==null){
            head=temp;
        }else {
            temp.next=head;
            head=temp;
        }
    }

    void insertAtIndex(int index, int data) throws IndexOutOfBoundsException {
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


}
