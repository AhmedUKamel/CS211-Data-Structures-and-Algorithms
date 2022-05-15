package Stack;
import java.util.Scanner;
import javax.script.ScriptException;
import static Stack.Applications.*;

//import static Stack.Applications.infixToPostfix;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws ScriptException {
//        StackUsingArray <Integer> stack1 = new StackUsingArray<>(5);
//        System.out.println("Is empty : " + stack1.isEmpty());
//        System.out.println("Size : " + stack1.size());
//        stack1.push(1);
//        stack1.push(2);
//        System.out.println("Capacity : " + stack1.capacity());
//        stack1.push(3);
//        System.out.println("Popped element : " + stack1.pop());
//        System.out.println("Capacity : " + stack1.capacity());
//        stack1.push(4);
//        stack1.push(5);
//        stack1.push(11);
//        System.out.println("Last element : " + stack1.peek());
//        stack1.display();
//        System.out.println("Is full : " + stack1.isFull());

//        StackUsingLinkedList <String> stack2 = new StackUsingLinkedList<>();
//        System.out.println("Is empty : " + stack2.isEmpty());
//        stack2.pop();
//        stack2.push(new String("Computer science"));
//        stack2.push(new String("Information technology"));
//        stack2.push(new String("Information systems"));
//        stack2.push(new String("Multi media"));
//        System.out.println("Size : " + stack2.size());
//        System.out.println("Last element : " + stack2.peek());
//        stack2.display();
//        stack2.push("Test1");
//        System.out.println("Size : " + stack2.size());
//        System.out.println("Popped element : " + stack2.pop());
//        stack2.display();

//        System.out.print("Enter expression : ");
//        if (Applications.isBalanced(sc.next()))
//            System.out.println("Balanced parentheses");
//        else
//            System.out.println("Not balanced parentheses");

//        String infix = new String("2 + ((8 + 2 * 3) / 2) - 1");
//        String postfix = new String(Applications.infixToPostfix(infix));
//        System.out.println("Infix : " + infix + " = " + (2 + ((8 + 2 * 3) / 2) - 1));
//        System.out.println("Postfix : " + postfix + " = " + Applications.resultForPostfix(postfix));

        System.out.print("Enter expression: ");

        String infix = sc.next();

        System.out.println(infixToPostfix(infix));

    }
}