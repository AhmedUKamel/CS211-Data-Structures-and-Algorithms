package Queue;
public class LinearQueueUsingArray <type> {
    // attributes
    private int front;
    private int rear;
    private type[] queue;

    // constructors
    public LinearQueueUsingArray(int size) {
        queue = (type[]) new Object[size];
        this.front = -1;
        this.rear = -1;
    }

    // methods
    public void enqueue(type element) {
        if (isFull())
            System.out.println("Queue is Overflow");
        else
            this.queue[++rear] = element;
    }

    public type dequeue() {
        if (isEmpty())
            System.out.println("Queue is Underflow");
        else
            return this.queue[++front];
        return null;
    }

    public type begin() {
        if (isEmpty())
            System.out.println("Queue is Underflow");
        else
            return queue[front+1];
        return null;
    }

    public type end() {
        if (isEmpty())
            System.out.println("Queue is Underflow");
        else
            return queue[rear];
        return null;
    }

    public int search(type element) {
        if (!isEmpty())
            for (int i = 0; i < size(); i++)
                if (this.queue[i].equals(element))
                    return i + 1;
        return -1;
    }

    public void display() {
            int i = front + 1;
            System.out.print("[ ");
            while (i <= rear)
                System.out.print(queue[i++] + " ");
            System.out.println("]");
    }

    public boolean isEmpty() {
        return rear == -1;
    }

    public boolean isFull() {
        return rear == size() - 1;
    }

    public int capacity() {
        return rear - front;
    }

    public int size() {
        return this.queue.length;
    }
}