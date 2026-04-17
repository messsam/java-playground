public class BogoSort {
    static void main(String[] args) {
        int[] arr = new int[] {53,453,53,252,4322,456,2,4,56,6,4};
        bogoSort(arr);
        display(arr);
    }
    static void bogoSort(int[] arr) {
        while (!isSorted(arr))
            shuffle(arr);
    }
    static void shuffle(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int rand = (int)(Math.random()*arr.length);
            int temp = arr[i];
            arr[i] = arr[rand];
            arr[rand] = temp;
        }
    }
    static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length-1; i++)
            if (arr[i] > arr[i+1]) return false;
        return true;
    }
    static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            if (i == arr.length-1) System.out.print(arr[i]);
            else System.out.print(arr[i]+", ");
    }
}