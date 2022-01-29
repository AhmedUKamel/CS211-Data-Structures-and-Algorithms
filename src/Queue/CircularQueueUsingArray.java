package Queue;
public class CircularQueueUsingArray <type> {
    // attributes
    private int front;
    private int rear;
    private int ctr;
    private type[] queue;

    // constructors
    public CircularQueueUsingArray(int size) {
        this.queue = (type[]) new Object[size];
        this.front = -1;
        this.rear = -1;
        this.ctr = 0;
    }

    // methods
    public void enqueue(type element) {
        if (isFull())
            System.out.println("Queue is Overflow");
        else {
            ctr++;
            this.rear = (this.rear + 1) % size();
            this.queue[rear] = element;
        }
    }

    public type dequeue() {
        if (isEmpty())
            System.out.println("Queue is Underflow");
        else {
            ctr--;
            this.front = (this.front + 1) % size();
            return this.queue[front];
        }
        return null;
    }

    public int search(type element) {
        if(!isEmpty()) {
            int i = front + 1, copy = ctr;
            while (copy != 0) {
                if (queue[i].equals(element))
                    return i + 1;
                i = (i+1) % size();
                copy--;
            }
        }
        return -1;
    }

    public type begin() {
        if (isEmpty())
            System.out.println("Queue is Underflow");
        else
            return queue[front + 1];
        return null;
    }

    public type end() {
        if (isEmpty())
            System.out.println("Queue is Underflow");
        else
            return queue[rear];
        return null;
    }

    public void display() {
        System.out.print("[ ");
        if (!isEmpty()) {
            int i = front + 1, copy = ctr;
            while (copy != 0) {
                System.out.print(queue[i] + " ");
                i = (i+1) % size();
                copy--;
            }
        }
        System.out.println("]");
    }

    public boolean isEmpty() {
        return this.ctr == 0;
    }

    public boolean isFull() {
        return this.ctr == this.size();
    }

    public int capacity() {
        return this.ctr;
    }

    public int size() {
        return this.queue.length;
    }
}