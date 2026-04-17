package dsa.arrays;

public class SortedArray {
    int[] arr; int total;
    public SortedArray(int size) { arr = new int[size]; }

    /* SORTED INSERTION.
    Insertion has 3 states: array is full (exit), insert at first/middle (Shift bigger elements to the right),
    or the inserted num is the biggest in the array (insert at last index "total"). Increase the total if inserted. */
    public void insert(int x) {
        if (total == arr.length) { System.out.println("Invalid."); return; } // Full, exit.
        for (int i = 0; i < total; i++)
            if (arr[i] >= x) { // Shift bigger elements.
                for (int j = total++; j > i; j--)
                    arr[j] = arr[j-1];
                System.out.println("Successfully inserted "+x+" at index "+i+".");
                arr[i] = x; return; // Insert at first/middle, & exit.
            }
        System.out.println("Successfully inserted "+x+" at index "+total+".");
        arr[total++] = x; // x is the biggest; insert at last index.
    }

    /* SORTED DELETION.
    Deletion has 2 states: the element exists (is deleted, & bigger elements "if exist" are shifted to the left),
    or does not exist (exit). */
    public void delete(int x) {
        for (int i = 0; i < total; i++)
            if (arr[i] == x) { // Found. Shift bigger elements, & decrease the total.
                while (i < total-1)
                    arr[i] = arr[++i];
                System.out.println("Successfully deleted "+x+".");
                total--; return;
            }
        System.out.println("Invalid."); // Not found. Exit.
    }

    /* LINEAR SEARCH.
    Linear search has 2 states: the element is found (return its index), or is not found (return -1). */
    public int search(int x) {
        for (int i = 0; i < total; i++)
            if (arr[i] == x) return i; // Found. Exit.
        return -1; // Not found. Return -1.
    }

    /* ITERATIVE BINARY SEARCH.
    Binary search has 2 states: the element is found (return its index), or is not found (return -1). */
    public int biSearch(int x) {
        int first = 0, last = total-1;
        while (last >= first) {
            int middle = (first+last)/2;
            if (arr[middle] == x) return middle; // Found. Exit.
            if (arr[middle] > x) last = middle-1; // Enter first half.
            else first = middle+1; // Enter second half.
        }
        return -1; // Not found. Return -1;
    }

    /* RECURSIVE BINARY SEARCH.
    Binary search has 2 states: the element is found (return its index), or is not found (return -1). */
    public int biSearchRec(int x) { return biHelper(x, 0, total-1); }
    public int biHelper(int x, int first, int last) {
        // Opposite condition with the iterative one; since we do not want to access it, actually.
        if (last < first) return -1; // Not found. Return -1.
        int middle = (first+last)/2;
        if (arr[middle] == x) return middle; // Found. Exit.
        if (arr[middle] > x) return biHelper(x, first, middle-1); // Enter a deeper layer (first half).
        else return biHelper(x, middle+1, last); // Enter a deeper layer (second half).
    }

    public String toString() {
        StringBuilder string = new StringBuilder("[");
        for (int i = 0; i < total; i++) {
            if (i == total-1) string.append(arr[i]).append("]");
            else string.append(arr[i]).append(", ");
        }
        return string.toString();
    }

    static void main(String[] args) {
        SortedArray arr = new SortedArray(7);
        arr.insert(1); arr.insert(5); arr.insert(9);
        arr.insert(19); arr.insert(20);
        System.out.println(arr);
        arr.insert(8); arr.delete(19);
        System.out.println(arr);
        arr.insert(56); arr.insert(4); arr.insert(76);
        System.out.println(arr);
        System.out.println(arr.biSearchRec(9));
    }
}