package Stack;
public class StackUsingArray <type> {
    // attributes
    private int top;
    private int size;
    private type[] arr;

    // constructors
    public StackUsingArray(int size) {
        this.top = -1;
        this.size = size;
        this.arr = (type[]) new Object[size];
    }

    // methods
    public void push(type element) {
        if(isFull()) System.out.println("Stack is Overflow");
        else arr[++top] = element;
    }

    public type pop() {
        if(isEmpty()) System.out.println("Stack is Underflow");
        else return arr[top--];
        return null;
    }

    public type peek() {
        if(isEmpty()) System.out.println("Stack is Underflow");
        else return arr[top];
        return null;
    }

    public void display() {
        if(isEmpty()) System.out.println("Stack is Underflow");
        else {
            System.out.print("[ ");
            for(int i = top; i >= 0; i--)
                System.out.print(arr[i] + " ");
            System.out.println("]");
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == this.size - 1;
    }

    public int capacity() {
        return this.top + 1;
    }

    public int size() {
        return this.size;
    }
}