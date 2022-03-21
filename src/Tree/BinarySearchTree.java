package Tree;
import Queue.LinkedQueueUsingLinkedList;

import java.util.Queue;

public class BinarySearchTree {
    private class Node {
        private double value;
        private Node left;
        private Node right;
        private Node(double value) {
            this.value = value;
        }
    }
    private Node root;
    private int ctr;

    /*---------------------------------------------- Insertion ----------------------------------------------*/

    public void insert(double element) {
        if (isEmpty()) {
            root = new Node(element);
            ctr++;
        }
        else {
            Node ptr = root;
            while (true) {
                if (ptr.value > element) {
                    if (ptr.left == null) {
                        ptr.left = new Node(element);
                        ctr++;
                        break;
                    }
                    else ptr = ptr.left;
                }
                else if (ptr.value < element) {
                    if (ptr.right == null) {
                        ptr.right = new Node(element);
                        ctr++;
                        break;
                    }
                    else ptr = ptr.right;
                }
                else break;
            }
        }
    }

    /*---------------------------------------------- Search ----------------------------------------------*/

    public void search(String order) {
        System.out.print("[ ");
        switch (order.toLowerCase()) {
            case "in": search("in", root); break;
            case "pre": search("pre", root); break;
            case "post": search("post", root); break;
            case "level": search("level", root); break;
            default: System.out.println("Only Pre, Post and In orders are allowed");
        }
        System.out.println("]");
    }

    private void search(String order, Node node) {
        if (node == null) return;
        switch (order) {
            case "in" : {
                search(order, node.left);
                System.out.print(node.value + " ");
                search(order, node.right);
                break;
            } case "pre" : {
                System.out.print(node.value + " ");
                search(order, node.left);
                search(order, node.right);
                break;
            } case "post" : {
                search(order, node.left);
                search(order, node.right);
                System.out.print(node.value + " ");
                break;
            } case "level" : {
                LinkedQueueUsingLinkedList <Node> myQueue = new LinkedQueueUsingLinkedList<>();
                myQueue.enqueue(node);
                System.out.println("Before while loop is queue empty: " + myQueue.isEmpty());
                while (!myQueue.isEmpty()) {
                    if (myQueue.end().left != null) {
                        myQueue.enqueue(myQueue.end().left);
                    }
                    if (myQueue.end().right != null) {
                        myQueue.enqueue(myQueue.end().right);
                    }
                    System.out.print(myQueue.dequeue().value + " ");
                    System.out.println("End of while loop is queue empty: " + myQueue.isEmpty());
                }
            }
        }
    }

    /*---------------------------------------------- Others ----------------------------------------------*/
    public boolean isEmpty() {
        return root == null;
    }

    public int capacity() {
        return ctr;
    }

    public void test() {
        System.out.println("Current value " + root.value);
        System.out.println("Left value " + root.left.value);
        System.out.println("Right value " + root.right.value);
    }
}