package dsa.arrays;

public class SortingAlgorithms {
    static void main(String[] args) {
        int[] arr = new int[]{5,35,5334,534545,256,45,656,54,42523,431,523,145,6,3,21,567,8,92,1};
        /*bubble(arr); display(arr);
        revBubble(arr); display(arr);
        bubble2(arr); display(arr);
        selection2(arr); display(arr);*/
        recBubble(arr); display(arr);
    }

    static void bubble(int[] arr) {
        boolean swaped = true;
        for (int i = 0, j, temp; i < arr.length-1 && swaped; i++) {
            swaped = false;
            for (j = 0; j < arr.length-1-i; j++)
                if (arr[j] > arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swaped = true;
                }
        }
    }
    static void bubble2(int[] arr) {
        boolean swaped = true;
        for (int i = 0, j, temp; i < arr.length-1 && swaped; i++) {
            swaped = false;
            for (j = arr.length-1; j > 0; j--)
                if (arr[j] < arr[j-1]) {
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swaped = true;
                }
        }
    }
    static void revBubble(int[] arr) {
        boolean swaped = true;
        for (int i = 0, j, temp; i < arr.length-1 && swaped; i++) {
            swaped = false;
            for (j = 0; j < arr.length-1-i; j++)
                if (arr[j] < arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swaped = true;
                }
        }
    }
    static void recBubble(int[] arr) { recHelper(arr, 0); }
    static void recHelper(int[] arr, int i) {
        if (i == arr.length-1) return;
        innerRec(arr, i, 0);
        recHelper(arr, ++i);
    }
    static void innerRec(int[] arr, int i, int j) {
        if (j == arr.length-1-i) return;
        if (arr[j] > arr[j+1]) {
            int temp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = temp;
        }
        innerRec(arr, i, j+1);
    }
    static void selection(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            int min = i;
            for (int j = i+1; j < arr.length; j++)
                if (arr[j] < arr[min]) min = j;
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
    static void selection2(int[] arr) {
        for (int i = 0, j, max, temp; i < arr.length-1; i++) {
            max = i;
            for (j = i+1; j < arr.length; j++)
                if (arr[j] > arr[max]) max = j;
            if (max != i) {
                temp = arr[i];
                arr[i] = arr[max];
                arr[max] = temp;
            }
        }
    }
    static void selection3(int[] arr) {
        for (int i = 0, count = 0, j, min, temp; i < arr.length-1 && count < arr.length-1-i; i++) {
            min = arr.length-1; count = 0;
            for (j = arr.length-2; j >= i; j--)
                if (arr[j] <= arr[min]) { min = j; count++; }
            if (min != i) {
                temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
    }
    static void revSelection(int[] arr) {
        for (int i = 0, j, max, temp; i < arr.length-1; i++) {
            max = arr.length-1-i;
            for (j = 0; j < arr.length-1-i; j++)
                if (arr[j] > arr[max]) max = j;
            if (max != arr.length-1-i) {
                temp = arr[arr.length-1-i];
                arr[arr.length-1-i] = arr[max];
                arr[max] = temp;
            }
        }
    }
    static void insertion(int[] arr) {
        for (int i = 1, j, temp; i < arr.length; i++) {
                temp = arr[i];
                for (j = i; j > 0 && arr[j-1] > temp; j--)
                    arr[j] = arr[j-1];
                arr[j] = temp;
                display(arr);
        }
    }
    static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length-1) IO.println(arr[i]);
            else IO.print(arr[i] + ", ");
        }
    }
    public static int islands(int[] arr) {
        if (arr.length == 0) return 0;
        int count = 0;
        for (int i = 0; i < arr.length-1; i++)
            if (arr[i] != 0 && arr[i+1] == 0)
                count++;
        if (arr[arr.length-1] != 0) count ++;
        return count;
    }
    static void RelSort(int[] a, int[] b) {
        int k = 0;
        for (int i = 0; i < b.length; i++)
            for (int j = 0; j < a.length; j++)
                if (a[j] == b[i]) {
                    int temp = a[k];
                    a[k++] = a[j];
                    a[j] = temp;
                }
        while (k < a.length-1) {
            int min = k;
            for (int i = k+1; i < a.length; i++)
                if (a[i] < a[min]) min = i;
            int temp = a[k];
            a[k++] = a[min];
            a[min] = temp;
        }
    }
    static void oddEvenSort(int[] arr) {
        for (int i = 0, j = 1; i < arr.length && j < arr.length; i += 2, j += 2) {
            int min = i, max = j;
            for (int p = i+2; p < arr.length; p += 2)
                if (arr[p] < arr[min]) min = p;
            for (int q = j+2; q < arr.length; q += 2)
                if (arr[q] > arr[max]) max = q;
            swap(i, min, arr); swap(j, max, arr);
        }
    }
    static void swap(int x, int y, int[] arr) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
    static void shakerSort(int[] arr) {
        boolean swaped = true;
        for (int i = 0; i < arr.length/2 && swaped; i++) {
            swaped = false;
            for (int j = 0; j < arr.length-1-i; j++)
                if (arr[j] > arr[j+1]) {
                    swaped = true;
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            for (int j = arr.length-1-i; j > 0; j--)
                if (arr[j] < arr[j-1]) {
                    swaped = true;
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            display(arr);
        }
    }
    static void shakerSort2(int[] arr) {
        boolean swaped = true;
        for (int i = 0; i < arr.length/2 && swaped; i++) {
            for (int j = 0, k = arr.length-1-i; j < arr.length-1-i; j++, k--) {
                swaped = false;
                if (arr[j] > arr[j+1]) {
                    swaped = true;
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                if (arr[k] < arr[k-1]) {
                    swaped = true;
                    int temp = arr[k];
                    arr[k] = arr[k-1];
                    arr[k-1] = temp;
                }
            }
            display(arr);
        }
    }
    static int[] inverseBubble(int[] arr) {
        for (int i = 0; i < arr.length/2; i++) {
            for (int j = 0, k = arr.length-1-i; j < arr.length-1-i; j++, k--) {
                if (arr[j] < arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                if (arr[k] > arr[k-1]) {
                    int temp = arr[k];
                    arr[k] = arr[k-1];
                    arr[k-1] = temp;
                }
            }
        } return arr;
    }
    static void selSortEnhanced(int[] arr) {
        for (int i = 0; i < arr.length/2; i++) {
            int min = i, max = arr.length-1-i;
            for (int j = i+1; j < arr.length-i; j++) {
                if (arr[j] < arr[min]) min = j;
                if (arr[j] > arr[max]) max = j;
            }
            int temp = arr[i]; arr[i] = arr[min]; arr[min] = temp;
            if (max == i) max = min;
            temp = arr[arr.length-1-i]; arr[arr.length-1-i] = arr[max]; arr[max] = temp;
            display(arr);
        }
    }
    public static void sortRelative(int[] a1, int[] a2) {
        int sum = 0, bubble = 0;
        for (int i = 0; i < a2.length; i++) {
            int count = 0;
            for (int j = 0; j < a1.length; j++)
                if (a1[j] == a2[i]) count++;
            sum += count;
            int end = bubble + count;
            while (bubble < end)
                for (int j = a1.length-1; j > bubble; j--)
                    if (a1[j] == a2[i]) {
                        bubble++;
                        int temp = a1[j-1];
                        a1[j-1] = a1[j];
                        a1[j] = temp;
                    }
        }
        for (int i = bubble; i < a1.length-1; i++) {
            int min = i;
            for (int j = i+1; j < a1.length; j++)
                if (a1[j] < a1[min]) min = j;
            a1[i] = a1[min];
        }
    }
}