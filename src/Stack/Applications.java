package Stack;

public class Applications {
    // balanced parentheses
    public static boolean isBalanced(String exp) {
        StackUsingLinkedList <Character> stack = new StackUsingLinkedList<>();
        for (int i = 0; i < exp.length(); i++) {
            if (exp.charAt(i) == '[' || exp.charAt(i) == '(' || exp.charAt(i) == '{')
                stack.push(exp.charAt(i));
            else if (exp.charAt(i) == ')' || exp.charAt(i) == ']' || exp.charAt(i) == '}') {
                if (stack.isEmpty())
                    return false;
                if (match(stack.peek(), exp.charAt(i)))
                    stack.pop();
                else
                    return false;
            }
        }
        return stack.isEmpty();
    }

    public static boolean match(Character c1, Character c2) {
        if (c1 == '[' && c2 == ']')
            return true;
        else if (c1 == '{' && c2 == '}')
            return true;
        else if (c1 == '(' && c2 == ')')
            return true;
        else
            return false;
    }

    // infix to postfix
    public static String infixToPostfix (String infix) {
        StackUsingLinkedList <Character> stack = new StackUsingLinkedList<>();
        StringBuilder postfix = new StringBuilder();
        for (int i = 0; i < infix.length(); i++) {
            if (isOperand(infix.charAt(i))) {
                postfix.append(infix.charAt(i));
                postfix.append(' ');
            }
            else if (isOperator(infix.charAt(i))) {
                while (!stack.isEmpty() && stack.peek() != '(' && isHigherPrecedence(stack.peek(), infix.charAt(i))) {
                    postfix.append(stack.pop());
                    postfix.append(' ');
                }
                stack.push(infix.charAt(i));
            } else if (infix.charAt(i) == '(')
                stack.push(infix.charAt(i));
            else if (infix.charAt(i) == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix.append(stack.pop());
                    postfix.append(' ');
                }
                stack.pop();
            }
        }
        while (!stack.isEmpty()) {
            postfix.append(stack.pop());
            postfix.append(' ');
        }
        return postfix.toString();
    }

    public static boolean isOperand(char op) {
        if (op >= '0' && op <= '9') return true;
        else if (op >= 'a' && op <= 'z') return true;
        else if (op >= 'A' && op <= 'Z') return true;
        else return false;
    }

    public static boolean isOperator(char op) {
        return (op =='+' || op =='-' || op =='*' || op =='/' || op =='$');
    }

    public static int operatorPriority(char op) {
        return (op == '+' || op == '-') ? 1 : (op == '*' || op == '/') ? 2 : (op == '$') ? 3 : 0;
    }

    public static boolean isHigherPrecedence(char op1, char op2) {
        if (operatorPriority(op1) == operatorPriority(op2))
            return op1 != '$';
        else
            return operatorPriority(op1) > operatorPriority(op2);
    }

    public static Double resultForPostfix(String postfix) {
        StackUsingLinkedList <Double> stack = new StackUsingLinkedList<>();
        for (int i = 0; i < postfix.length(); i++) {
            if (isOperand(postfix.charAt(i)))
                stack.push(new Double("" + postfix.charAt(i)));
            else if (isOperator(postfix.charAt(i))) {
                switch (postfix.charAt(i)) {
                    case '+' : stack.push(stack.pop() + stack.pop()); break;
                    case '-' : stack.push(- stack.pop() + stack.pop()); break;
                    case '*' : stack.push(stack.pop() * stack.pop()); break;
                    case '/' : stack.push(1 / (stack.pop() / stack.pop())); break;
                }
            }
        }
        return stack.peek();
    }
}
