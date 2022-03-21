package SearchAndSorting;
public class BinarySearch {
    /**** Please, Be noted that Binary search must be used with `Sorted Arrays only` ****/

    /**** Those functions search on all array ****/
    public static int search(int element, int[] arr) {
        int b = 0, e = arr.length - 1, idx = 0;
        while(b <= e) {
            idx = (b + e) / 2;
            if(arr[idx] == element) return idx;
            else if(arr[idx] > element) e = idx - 1;
            else b = idx + 1;
        } return -1;
    }

    public static int search(double element, double[] arr) {
        int b = 0, e = arr.length - 1, idx = 0;
        while(b <= e) {
            idx = (b + e) / 2;
            if(arr[idx] == element) return idx;
            else if(arr[idx] > element) e = idx - 1;
            else b = idx + 1;
        } return -1;
    }

    /**** Those functions search on dedicated range ****/ // --> Please, be noted that End (e) included in search
    public static int search(int element, int[] arr, int b, int e) {
        int idx = 0;
        while(b <= e) {
            idx = (b + e) / 2;
            if(arr[idx] == element) return idx;
            else if(arr[idx] > element) e = idx - 1;
            else b = idx + 1;
        } return -1;
    }

    public static int search(double element, double[] arr, int b, int e) {
        int idx = 0;
        while(b <= e) {
            idx = (b + e) / 2;
            if(arr[idx] == element) return idx;
            else if(arr[idx] > element) e = idx - 1;
            else b = idx + 1;
        } return -1;
    }
}