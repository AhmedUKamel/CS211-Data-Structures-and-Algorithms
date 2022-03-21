package SearchAndSorting;
public class Main {
    public static void main(String[] args) {

//        LinearSearch<String>sr = new LinearSearch();
//        String[] arr = {"CS", "IT", "IS", "MM"};
//        String str1 = "CS"; String str2 = "AI";
//        display(arr);
//        System.out.println(str1 + " in Index: " + sr.search(str1, arr));
//        System.out.println(str2 + " in Index: " + sr.search(str2, arr));

//        LinearSearch<Double>sr = new LinearSearch();
//        Double[] arr = {3.5, 5.7, 1.2, 6.4, 9.8, 7.6, 5.2, 6.4, 4.9, 7.1};
//        Double d1 = 5.7, d2 = 5.0, d3 = 7.1; int b = 1, e = 5;
//        display(arr);
//        System.out.println("Search for " + d1 + " in range [" + b + ", " + e + "[: " + sr.search(d1, arr, b, e));
//        System.out.println("Search for " + d2 + " in whole array: " + sr.search(d2, arr));
//        b = 5; e = 9;
//        System.out.println("Search for " + d3 + " in range [" + b + ", " + e + "[: " + sr.search(d3, arr, b, e));

//        int[] arr = {1, 3, 5, 7, 9, 11, 13, 15}; e
//        display(arr);
//        System.out.println("-5 in index: " + BinarySearch.search(-5, arr));
//        System.out.println("1  in index: " + BinarySearch.search(1, arr));
//        System.out.println("4  in index: " + BinarySearch.search(4, arr));
//        System.out.println("7  in index: " + BinarySearch.search(7, arr));
//        System.out.println("15 in index: " + BinarySearch.search(15, arr));
//        System.out.println("17 in index: " + BinarySearch.search(17, arr));
//        System.out.println("7  in range [4, 6]: " + BinarySearch.search(7, arr, 4, 6));
//        System.out.println("15 in range [2, 7]: " + BinarySearch.search(15, arr, 2, 7));

    }

    public static void display(String[] arr) {
        System.out.print("[ ");
        for(int i = 0; i < arr.length - 1; i++)
            System.out.print(arr[i] + ", ");
        System.out.println(arr[arr.length - 1] + " ]");
    }

    public static void display(Double[] arr) {
        System.out.print("[ ");
        for(int i = 0; i < arr.length - 1; i++)
            System.out.print(arr[i] + ", ");
        System.out.println(arr[arr.length - 1] + " ]");
    }

    public static void display(int[] arr) {
        System.out.print("[ ");
        for(int i = 0; i < arr.length - 1; i++)
            System.out.print(arr[i] + ", ");
        System.out.println(arr[arr.length - 1] + " ]");
    }
}