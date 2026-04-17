package dsa.arrays;

public class RotatedArray {
    public static boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++)
            if (arr[i] < arr[i-1]) return false;
        return true;
    }
    public static int biSearch(int x, int[] arr) {
        int first = 0, last = arr.length-1;
        while (last >= first) {
            int middle = (first+last)/2;
            if (arr[middle] == x) return middle; // Found. Exit.
            if (arr[middle] > x) last = middle-1; // Enter first half.
            else first = middle+1; // Enter second half.
        }
        return -1; // Not found. Return -1;
    }
    public static int biSearchRec(int x, int[] arr, int first, int last) {
        if (last < first) return -1; // Not found. Return -1.
        int middle = (first+last)/2;
        if (arr[middle] == x) return middle; // Found. Exit.
        if (arr[middle] > x) return biSearchRec(x, arr, first, middle-1); // Enter a deeper layer (first half).
        else return biSearchRec(x, arr, middle+1, last); // Enter a deeper layer (second half).
    }
    public static int searchInRotatedSortedArray(int x, int[] arr) {
        int pivot = 0;
        for (int i = 1; i < arr.length; i++)
            if (arr[i] < arr[pivot]) pivot = i;
        if (pivot == 0) return biSearch(x, arr);
        else {
            int result = biSearchRec(x, arr, 0, pivot-1);
            return result == -1? biSearchRec(x, arr, pivot, arr.length-1): result;
        }
    }
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 1, 2};
        System.out.println(searchInRotatedSortedArray(9, arr));
        System.out.println(searchInRotatedSortedArray(7, arr));
        System.out.println(searchInRotatedSortedArray(3, arr));
        System.out.println(searchInRotatedSortedArray(1, arr));
        System.out.println(searchInRotatedSortedArray(2, arr));
        System.out.println(searchInRotatedSortedArray(4, arr));
    }

}