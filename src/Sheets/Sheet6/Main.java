package Sheets.Sheet6;
public class Main {
    public static void main(String [] args) {
        test_question_1();
        test_question_2();
        test_question_3();
        test_question_4();
    }

    // Question 1
    public static StackUsingLinkedList <Integer> sort_stack(StackUsingLinkedList <Integer> unsorted_stack) {

        StackUsingLinkedList <Integer> sorted_stack = new StackUsingLinkedList<>();

        while(!unsorted_stack.isEmpty()) {

            int temp = unsorted_stack.pop();

            while(!sorted_stack.isEmpty()  && sorted_stack.peek().compareTo(temp) < 0) {
                unsorted_stack.push(sorted_stack.pop());
            }

            sorted_stack.push(temp);

        } return sorted_stack;
    }

    public static StackUsingLinkedList[] divide_stack(StackUsingLinkedList <Integer> stack) {

        StackUsingLinkedList[] addresses = new StackUsingLinkedList[2];
        addresses[0] = new StackUsingLinkedList <Integer> ();
        addresses[1] = new StackUsingLinkedList <Integer> ();

        while(!stack.isEmpty()) {
            if(stack.peek() % 2 == 0) {
                addresses[0].push(stack.pop());
            }
            else {
                addresses[1].push(stack.pop());
            }
        }
        return addresses;
    }

    public static void test_question_1() {

        System.out.println("Test for Question 1");
        StackUsingLinkedList <Integer> stack = new StackUsingLinkedList<>();

        stack.push(10);
        stack.push(8);
        stack.push(6);
        stack.push(15);
        stack.push(2);
        stack.push(7);
        stack.push(20);
        stack.push(1);

        System.out.println("Before sort:");
        stack.display();

        StackUsingLinkedList <Integer> new_stack = sort_stack(stack);
        System.out.println("After  sort:");
        new_stack.display();
    }

    public static void test_question_2() {

        System.out.println("\n\nTest for Question 2");
        StackUsingLinkedList <Integer> stack = new StackUsingLinkedList<>();

        stack.push(15);
        stack.push(30);
        stack.push(12);
        stack.push(13);
        stack.push(9);
        stack.push(7);
        stack.push(4);
        stack.push(6);
        stack.push(1);

        System.out.println("Original Stack");
        stack.display();

        StackUsingLinkedList[] divided_stacks = divide_stack(stack);
        System.out.println("Even Stack");
        divided_stacks[0].display();

        System.out.println("Odd Stack");
        divided_stacks[1].display();
    }

    public static void test_question_3() {

        System.out.println("\n\nTest for Question 3");
        SinglyLinkedList <Integer> list = new SinglyLinkedList<>();

        list.insert(10);
        list.insert(7);
        list.insert(12);
        list.insert(50);
        list.insert(37);
        list.insert(25);

        System.out.println("Before reverse:");
        list.display();

        System.out.println("After  reverse:");
        list.reverse();
        list.display();
    }

    public static void test_question_4() {

        System.out.println("\n\nTest for Question 4");
        SinglyLinkedList <Integer> first_list = new SinglyLinkedList<>();
        SinglyLinkedList <Integer> second_list = new SinglyLinkedList<>();

        first_list.insert(10);
        first_list.insert(20);
        first_list.insert(30);

        System.out.println("First List:");
        first_list.display();

        second_list.insert(1);
        second_list.insert(2);
        second_list.insert(3);

        System.out.println("Second List:");
        second_list.display();

        System.out.println("After Merge:");
        first_list.merge(second_list);
        first_list.display();
    }
}