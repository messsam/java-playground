package dsa.arrays;

public class UnsortedArray {
    int[] arr; int total;

    public void insertLast(int x) {
        if (total == arr.length) return;
        arr[total++] = x;
    }
    public void insertFirst(int x) {
        if (total == arr.length) return;
        for (int i = total++; i > 0; i--)
            arr[i] = arr[i-1];
        arr[0] = x;
    }
    public int linearSearch(int x) {
        for (int i = 0; i < total; i++)
            if (arr[i] == x) return i;
        return -1;
    }
    public int binarySearch(int x) { // Does not work with unsorted arrays.
        int first = 0, last = arr.length-1, middle = (first+last)/2;
        while (last >= first) {
            if (arr[middle] == x) return middle;
            if (arr[middle] > x) last = middle-1;
            else first = middle+1;
        }
        return -1;
    }
    public void delete(int x) {
        for (int i = 0; i < total; i++)
            if (arr[i] == x) {
                while (i < total-1)
                    arr[i] = arr[++i];
                total--; return;
            }
    }

    public static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length-1) IO.println(arr[i]);
            else IO.print(arr[i] + ", ");
        }
    }
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++)
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
        }
    }
    public static void selectionSort(int[] arr) {
        for (int i = 0, min; i < arr.length-1; i++) {
            min = i;
            for (int j = i+1; j < arr.length; j++)
                if (arr[j] < arr[min]) min = j;
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i], j;
            for (j = i-1; j >= 0 && arr[j] > temp; j--)
                arr[j+1] = arr[j];
            arr[j+1] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {5,223,53,63,23,453,6,645,6,4364,52,5656,21,3,21,2,1};
        /*selectionSort(arr);
        display(arr);
        bubbleSort(arr);
        display(arr);*/
        insertionSort(arr);
        display(arr);
    }
}