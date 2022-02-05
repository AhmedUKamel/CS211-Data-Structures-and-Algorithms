package List;
public class ArrayList <type> {
    // attributes
    private type[] list;
    private int end;

    // constructors
    public ArrayList(int size) {
        list = (type[]) new Object[size];
        end = -1;
    }

    // methods
    // methods
    /*---------------------------------------------- Insertion ----------------------------------------------*/
    /*
     * 1: insertFirst() takes only element to add it in begin of list
     * 2: insert() takes only element to add it in end of list
     * 3: insert() takes value and specific index to add in
     * 4: insertNoDublicate() method takes a value as parameter and insert it only it's not exist in arraylist
     * */
    public void insertFirst(type element) {
        if (isFull())
            System.out.println("List is Overflow");
        else {
            for (int i = end + 1; i > 0;)
                list[i] = list[--i];
            list[0] = element;
            end++;
        }
    }

    public void insert(type element) {
        if (isFull())
            System.out.println("List is Overflow");
        else {
            list[++end] = element;
        }
    }

    public void insert(int position, type element) {
        if (!isValidPosition(position))
            System.out.println("Invalid range");
        else if (isFull())
            System.out.println("List is Overflow");
        else {
            for (int i = end + 1; i > position;)
                list[i] = list[--i];
            list[position] = element;
            end++;
        }
    }

    public void insertNoDublicate(type element) {
        if (search(element) == -1)
            insert(element);
    }

    /*---------------------------------------------- Removal ----------------------------------------------*/

    /*
     * 1: remove() takes index as a parameter to remove it
     * 2: overloaded remove() doesn't take parameters and remove the first element in list
     * 3: pop() doesn't take parameters and remove the last element in list
     * 4: clear() delete all elements from list
     * */


    public void remove(int position) {
        if (!isValidPosition(position))
            System.out.println("Invalid range");
        else if (isEmpty())
            System.out.println("List is Underflow");
        else {
            for (int i = position; i < end;)
                list[i] = list[i++];
            end--;
        }
    }

    public void remove() {
        if (isEmpty())
            System.out.println("List is Underflow");
        else {
            for (int i = 0; i < end;)
                list[i] = list[i++];
            end--;
        }
    }

    public void pop() {
        end--;
    }

    public void clear() {
        end = -1;
    }

    /*---------------------------------------------- Update ----------------------------------------------*/

    public void update(int position, type element) {
        if (!isValidPosition(position))
            System.out.println("Invalid range");
        else if (isEmpty())
            System.out.println("List is Underflow");
        else
            list[position] = element;
    }

    /*---------------------------------------------- Display ----------------------------------------------*/

    /*
     * display() method takes a boolean input to print the elements ( nodes ) in two different orders ( ascending / descending ).
     * in case of list contains no elements
     * */

    public void display() {
        System.out.print("[ ");
        for (int i = 0; i <= end;)
            System.out.print(list[i++] + " ");
        System.out.println("]");
    }

    /*---------------------------------------------- Search ----------------------------------------------*/

    public int search(type element) {
        if (isEmpty())
            System.out.println("List is Underflow");
        else
            for (int i = 0; i <= end;i++)
                if (list[i].equals(element))
                    return i;
        return -1;
    }

    /*---------------------------------------------- Access ----------------------------------------------*/

    public type get(int position) {
        if (!isValidPosition(position))
            System.out.println("Invalid range");
        else if (isEmpty())
            System.out.println("List is Underflow");
        else
            return list[position];
        return null;
    }

    /*---------------------------------------------- Other ----------------------------------------------*/

    /*
     * 1: isValidPosition() method help you to determine if the given position is in range or not (* range validation *).
     * 2: size() method just return the maximum size allowed for arraylist.
     * 3: capacity() method just return the actual number of elements ( nodes ) in your arraylist.
     * 4: isEmpty() method return if the list contain at least element or not (* empty or not *).
     * 5: isFull() method return if the list contain the maximum allowed number or not (* empty or not *).
     * */

    public boolean isValidPosition(int pos) {
        return pos >= 0 && pos < size();
    }

    public int size() {
        return list.length;
    }

    public int capacity() {
        return end + 1;
    }

    public boolean isEmpty() {
        return end == -1;
    }

    public boolean isFull() {
        return end == size() - 1;
    }
}