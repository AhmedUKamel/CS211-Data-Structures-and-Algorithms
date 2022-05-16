package Sheets.Sheet6;
public class StackUsingLinkedList <type> {
    // Data Fields
    private class Node {
        type value;
        Node next;
    }
    private Node top;
    private int filled;

    // constructors
    public StackUsingLinkedList() {
        top = null;
        filled = 0;
    }

    // methods
    public void push(type element) {
        if(isEmpty()) {
            top = new Node();
            top.value = element;
        } else {
            Node newNode = new Node();
            newNode.value = element;
            newNode.next = top;
            top = newNode;
        } filled++;
    }

    public type pop() {
        if(isEmpty()) {
            System.out.println("Stack underflow");
            return null;
        } else {
            type tmp = top.value;
            top = top.next;
            filled--;
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
        Node ptr = top;
        System.out.print("[ ");

        while (ptr != null) {
            System.out.print(ptr.value + " ");
            ptr = ptr.next;
        }

        System.out.println("]");
    }

    public int capacity() {
        return this.filled;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public static void main(String [] args) {
        StackUsingLinkedList <Integer> stack = new StackUsingLinkedList<>();
        stack.push(20);
        stack.push(15);
        stack.push(1);
        stack.display();
    }
}