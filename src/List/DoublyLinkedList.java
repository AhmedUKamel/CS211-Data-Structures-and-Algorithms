package List;
public class DoublyLinkedList <type> {
    // attributes
    private class Node {
        private type value;
        private Node next;
        private Node prev;
    }
    private Node head;
    private Node tail;
    private int ctr;

    // methods
    /*---------------------------------------------- Insertion ----------------------------------------------*/
    /*
    * 1: insertFirst() takes only element to add it in begin of list
    * 2: insert() takes only element to add it in end of list
    * 3: insert() takes value and specific index to add in
    * */

    public void insertFirst(type element) {
        if (isEmpty()) {
            head = tail = new Node();
            head.value = element;
        }
        else {
            Node newNode = new Node();
            newNode.value = element;
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        } ctr++;
    }

    public void insert(type element) {
        if (isEmpty()) {
            head = tail = new Node();
            head.value = element;
        }
        else {
            tail.next = new Node();
            tail.next.prev = tail;
            tail.next.value = element;
            tail = tail.next;
        } ctr++;
    }

    public void insert(int position, type element) {
        if(isValidPosition(position)) {
            Node ptr = head;
            for (int i = 0; i < position - 1; i++)
                ptr = ptr.next;
            Node newNode = new Node();
            newNode.next = ptr.next;
            newNode.prev = ptr;
            newNode.value = element;
            ptr.next.prev = newNode;
            ptr.next = newNode;
            ctr++;
        } else
            System.out.println("Invalid range");
    }

    /*---------------------------------------------- Removal ----------------------------------------------*/

    /*
    * 1: remove() takes index as a parameter to remove it
    * 2: overloaded remove() doesn't take parameters and remove the first element in list
    * 3: pop() doesn't take parameters and remove the last element in list
    * 4: clear() delete all elements from list
    * */

    public void remove(int position) {
        if (isEmpty())
            System.out.println("List in Underflow");
        else if (!isValidPosition(position))
            System.out.println("Invalid range");
        else {
            Node ptr = head;
            for (int i = 0; i < position; i++)
                ptr = ptr.next;
            ptr.prev.next = ptr.next;
            ptr.next.prev = ptr.prev;
            ctr--;
        }
    }

    public void remove() {
        if (isEmpty())
            System.out.println("List in Underflow");
        else {
            head = head.next;
            head.prev = null;
            ctr--;
        }
    }

    public void pop() {
        if (isEmpty())
            System.out.println("List in Underflow");
        else {
            tail = tail.prev;
            tail.next = null;
            ctr--;
        }
    }

    public void clear() {
        head = tail = null;
        ctr = 0;
    }

    /*---------------------------------------------- Update ----------------------------------------------*/

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

    /*---------------------------------------------- Display ----------------------------------------------*/

    /*
    * display() method takes a boolean input to print the elements ( nodes ) in two different orders ( ascending / descending ).
    * in case of list contains no elements
    * */

    public void display(boolean order) {
        System.out.print("[ ");
        if (order) {
            Node ptr = head;
            while (ptr != null) {
                System.out.print(ptr.value + " ");
                ptr = ptr.next;
            }
        } else {
            Node ptr = tail;
            while (ptr != null) {
                System.out.print(ptr.value + " ");
                ptr = ptr.prev;
            }
        }
        System.out.println("]");
    }

    /*---------------------------------------------- Search ----------------------------------------------*/

    public int search(type element) {
        Node ptr = head;
        for (int i = 0; ptr != null; i++) {
            if (ptr.value.equals(element))
                return i;
            else
                ptr = ptr.next;
        } return -1;
    }

    /*---------------------------------------------- Access ----------------------------------------------*/

    public type get(int position) {
        if (isEmpty())
            System.out.println("List in Underflow");
        else if (!isValidPosition(position))
            System.out.println("Invalid range");
        else {
            Node ptr = head;
            for (int i = 0; i < position; i++)
                ptr = ptr.next;
            return ptr.value;
        }
        return null;
    }

    /*---------------------------------------------- Other ----------------------------------------------*/

    /*
    * 1: isValidPosition() method help you to determine if the given position is in range or not (* range validation *).
    * 2: capacity() method just return the number of elements ( nodes ) in your list.
    * 3: isEmpty() method return if the list contain at least element or not (* empty or not *).
    * 4: reverse() method doesn't take parameters and only reverse elements order in list.
    * */

    private boolean isValidPosition(int pos) {
        return pos >= 0 && pos <+ ctr;
    }

    public int capacity() {
        return ctr;
    }

    public boolean isEmpty() {
        return ctr == 0;
    }

    public void reverse() {
        Node ptr = head;
        while (ptr != null) {
            Node swp = ptr.next;
            ptr.next = ptr.prev;
            ptr.prev = swp;
            ptr = ptr.prev;
        } Node tmp = head;
        head = tail;
        tail = tmp;
    }
}