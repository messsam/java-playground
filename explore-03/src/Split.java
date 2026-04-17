public class Split {
    public static void main(String[] args) {
        int[] arr = {13, -42, 8, 35, -7, 46, 28, -19};
        split(arr, 10, 0); split(arr, 10);
        System.out.println(); display(arr);
        System.out.println(); split(arr, 10, 0);
        System.out.println();
        System.out.print(sum(arr));
    }

    // i is initialized at 0.
    public static void split(int[] array, int pivot, int i) {
        if (i == array.length) return;
        if (array[i] < pivot) {
            System.out.print(array[i] + ", ");
            split(array, pivot, ++i);
        }
        else split(array, pivot, ++i);
        if (array[--i] >= pivot)
            System.out.print(array[i] + ", ");
    }
    public static void split(int[] array, int pivot) {
        int j = array.length-1;
        for (int i = 0; i < j; i++)
            while (array[i] > pivot) {
                int temp = array[i];
                array[i] = array[j];
                array[j--] = temp;
            }
    }
    public static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length-1) System.out.print(arr[i]);
            else System.out.print(arr[i] + ", ");
        }
    }
    public static int sum(int[] arr) {
        return helper1(arr, 0);
    }
    public static int helper1(int[] arr, int i) {
        if (i == arr.length-1) return arr[i];
        else return arr[i] + helper1(arr, ++i);
    }
    public static int helper2(int[] arr, int i) {
        if (i == 0) return arr[i];
        else return arr[i] + helper2(arr, --i);
    }
}