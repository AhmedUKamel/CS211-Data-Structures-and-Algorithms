package Queue;
public class LinkedQueueUsingLinkedList <type> {
    // attributes
    private class Node {
        private type value;
        private Node next;
    }
    private Node front;
    private Node rear;
    private int ctr;
    // constructors
    public LinkedQueueUsingLinkedList() {
        front = null;
        rear = null;
        ctr = 0;
    }
    // methods

    public void enqueue(type element) {
        if (isEmpty()) {
            front = rear = new Node();
            front.value = element;
        } else {
            rear.next = new Node();
            rear.next.value = element;
            rear = rear.next;
        } ctr++;
    }

    public type dequeue() {
        if (isEmpty())
            System.out.println("Queue is Underflow");
        else {
            type tmp = front.value;
            front = front.next;
            ctr--;
            return tmp;
        }
        return null;
    }

    public type begin() {
        if (isEmpty())
            System.out.println("Queue is Underflow");
        else
            return front.value;
        return null;
    }

    public type end() {
        if (isEmpty())
            System.out.println("Queue is Underflow");
        else
            return rear.value;
        return null;
    }

    public void display() {
        if (isEmpty())
            System.out.println("[ ]");
        else {
            Node i = front;
            System.out.print("[ ");
            while (i.next != null) {
                System.out.print(i.value + " ");
                i = i.next;
            }
            System.out.println(i.value + " ]");
        }
    }

    public int search(type element) {
        if (isEmpty())
            return -1;
        else {
            Node i = front;
            int index = 1;
            System.out.print("[ ");
            while (i.next != null) {
                if (i.value.equals(element))
                    return index;
                i = i.next;
                index++;
            }
            return -1;
        }
    }

    public int capacity() {
        return ctr;
    }

    public boolean isEmpty() {
        return rear == null;
    }
}