package Stack;
public class StackUsingLinkedList <type> {
    // attributes
    private class Node {
        type value;
        Node next;
    }
    private Node top;
    private int ctr;

    // constructors
    public StackUsingLinkedList() {
        top = null;
        ctr = 0;
    }

    // methods
    public void push(type element) {
        if(isEmpty()) {
            top = new Node();
            top.value = element;
            ctr++;
        } else {
            Node newNode = new Node();
            newNode.value = element;
            newNode.next = top;
            top = newNode;
            ctr++;
        }
    }

    public type pop() {
        if(isEmpty()) {
            System.out.println("Stack underflow");
            return null;
        } else {
            type tmp = top.value;
            top = top.next;
            ctr--;
            return tmp;
        }
    }

    public type peek() {
        if(isEmpty()) {
            System.out.println("Stack underflow");
            return null;
        } else {
            return top.value;
        }
    }

    public void display() {
        if(isEmpty())
            System.out.println("Stack underflow");
        else {
            Node ptr = top;
            System.out.print("[ ");
            System.out.print(ptr.value + " ");
            while (ptr.next != null) {
                ptr = ptr.next;
                System.out.print(ptr.value + " ");
            }
            System.out.println("]");
        }
    }

    public int size() {
        return this.ctr;
    }

    public boolean isEmpty() {
        return top == null;
    }
}