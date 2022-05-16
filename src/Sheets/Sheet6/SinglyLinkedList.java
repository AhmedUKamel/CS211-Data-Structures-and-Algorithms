package Sheets.Sheet6;

public class SinglyLinkedList <type> {
    // Data Fields
    public class Node {
        private type value;
        private Node next;
    }
    public Node head;
    public Node tail;
    public int ctr;
    public void insert(type element) {
        if (isEmpty()) {
            head = tail = new Node();
            head.value = element;
        } else {
            tail = tail.next = new Node();
            tail.value = element;
        } ctr++;
    }

    public type remove() {
        if(isEmpty())
            System.out.println("LinkedList is Underflow");
        else {
            Node temp = head;
            head = head.next;
            ctr--;
            return temp.value;
        } return null;
    }

    public void display() {
        System.out.print("[ ");
        Node ptr = head;
        while (ptr != null) {
            System.out.print(ptr.value + " ");
            ptr = ptr.next;
        } System.out.println("]");
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void reverse() {
        if (!isEmpty()) {
            Node cnt = tail = head;
            Node prv = null;
            Node nxt = cnt.next;
            while (nxt != null) {
                nxt = cnt.next;
                cnt.next = prv;
                prv = cnt;
                cnt = nxt;
            } head = prv;
        } else
            System.out.println("LinkedList is Underflow");
    }

    public void merge(SinglyLinkedList list) {
        while(!list.isEmpty())
            this.insert((type) list.remove());
    }
}