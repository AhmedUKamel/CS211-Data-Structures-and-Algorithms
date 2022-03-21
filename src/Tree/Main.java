package Tree;
public class Main {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        System.out.println("Is empty : " + tree.isEmpty());
        tree.insert(10);
        tree.insert(8);
        tree.insert(9);
        tree.insert(7);
        tree.insert(11);
        tree.insert(12);
        System.out.print("Pre-order : ");
        tree.search("pre");
        System.out.print("Post-order : ");
        tree.search("post");
        System.out.print("In-order : ");
        tree.search("in");
        System.out.print("Level-order : ");
        tree.search("level");
        System.out.println("Is empty : " + tree.isEmpty());
        System.out.println("Capacity : " + tree.capacity());
    }
}