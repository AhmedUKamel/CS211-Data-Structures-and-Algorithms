package List;
public class SinglyLinkedList <type> {
    // attributes
    private class Node {
        private type value;
        private Node next;
    }
    private Node head;
    private Node tail;
    private int ctr;

    // constructors
    public SinglyLinkedList() {
        head = tail = null;
        ctr = 0;
    }

    // methods
    public void insert(type element) {
        if (isEmpty()) {
            head = tail = new Node();
            head.value = element;
        } else {
            tail = tail.next = new Node();
            tail.value = element;
        } ctr++;
    }

    public void insertFirst(type element) {
        if (isEmpty()) {
            head = tail = new Node();
            head.value = element;
        } else {
            Node ptr = head;
            head = new Node();
            head.value = element;
            head.next = ptr;
        } ctr++;
    }

    public void insert(int position, type element) {
        if(isValidPosition(position)) {
            Node ptr = head;
            for (int i = 0; i < position - 1; i++)
                ptr = ptr.next;
            Node newNode = new Node();
            newNode.value = element;
            newNode.next = ptr.next;
            ptr.next = newNode;
            ctr++;
        } else
            System.out.println("Invalid range");
    }

    public void remove(int position) {
        if(isEmpty())
            System.out.println("LinkedList is Underflow");
        else if (!isValidPosition(position))
            System.out.println("Invalid range");
        else {
            Node ptr = head;
            for (int i = 0; i < position - 1; i++)
                ptr = ptr.next;
            ptr.next = ptr.next.next;
            ctr--;
        }
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

    public int search(type element) {
        Node ptr = head;
        int idx = 0;
        while (ptr != null) {
           if (ptr.value.equals(element))
               return idx;
           else {
               ptr = ptr.next;
               idx++;
           }
        } return -1;
    }

    public void remove() {
        if(isEmpty())
            System.out.println("LinkedList is Underflow");
        else {
            head = head.next;
            ctr--;
        }
    }

    public void pop() {
        if(isEmpty())
            System.out.println("LinkedList is Underflow");
        else {
            Node ptr = head;
            while (ptr.next.next != null)
                ptr = ptr.next;
            ptr.next = null;
            ctr--;
        }
    }

    public type get(int position) {
        if(isEmpty())
            System.out.println("LinkedList is Underflow");
        else if (!isValidPosition(position))
            System.out.println("Invalid range");
        else {
            Node ptr = head;
            for (int i = 0; i < position; i++)
                ptr = ptr.next;
            return ptr.value;
        } return null;
    }

    public void update(int position, type element) {
        if(isEmpty())
            System.out.println("LinkedList is Underflow");
        else if (!isValidPosition(position))
            System.out.println("Invalid range");
        else {
            Node ptr = head;
            for (int i = 0; i < position; i++)
                ptr = ptr.next;
            ptr.value = element;
        }
    }

    public void clear() {
        head = tail = null;
        ctr = 0;
    }

    public void display() {
        System.out.print("[ ");
        Node ptr = head;
        while (ptr != null) {
            System.out.print(ptr.value + " ");
            ptr = ptr.next;
        } System.out.println("]");
    }

    private boolean isValidPosition(int pos) {
        return pos >= 0 && pos <= ctr - 1;
    }

    public int capacity() {
        return ctr;
    }

    public boolean isEmpty() {
        return head == null;
    }
}