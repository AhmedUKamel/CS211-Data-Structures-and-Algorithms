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

    public void update(int position, type element) {
        if (!isValidPosition(position))
            System.out.println("Invalid range");
        else if (isEmpty())
            System.out.println("List is Underflow");
        else
            list[position] = element;
    }

    public type get(int position) {
        if (!isValidPosition(position))
            System.out.println("Invalid range");
        else if (isEmpty())
            System.out.println("List is Underflow");
        else
            return list[position];
        return null;
    }

    public void insertNoDublicate(type element) {
        if (search(element) == -1)
            insert(element);
    }

    public void clear() {
        end = -1;
    }

    public int search(type element) {
        if (isEmpty())
            System.out.println("List is Underflow");
        else
            for (int i = 0; i <= end;i++)
                if (list[i].equals(element))
                    return i;
        return -1;
    }

    public void display() {
        System.out.print("[ ");
        for (int i = 0; i <= end;)
            System.out.print(list[i++] + " ");
        System.out.println("]");
    }

    public boolean isValidPosition(int pos) {
        return pos >= 0 && pos < size();
    }

    public boolean isEmpty() {
        return end == -1;
    }

    public boolean isFull() {
        return end == size() - 1;
    }

    public int capacity() {
        return end + 1;
    }

    public int size() {
        return list.length;
    }
}