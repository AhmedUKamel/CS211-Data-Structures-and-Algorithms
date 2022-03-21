package SearchAndSorting;
public class LinearSearch <type> {
    /**** This function search on all array ****/
    public int search(type element, type[] arr) {
        for(int i = 0; i < arr.length; i++)
            if(arr[i].equals(element)) return i;
        return -1;
    }

    /**** This function search on dedicated range ****/
    public int search(type element, type[] arr, int s, int e) {
        for(int i = s; i < e; i++) // --> Please, be noted that End (e) not included in search
            if(arr[i].equals(element)) return i;
        return -1;
    }
}