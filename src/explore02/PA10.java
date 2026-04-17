package explore02;

public class PA10 {
    public static void main(String[] args) {
        int[][] arr = {{3,6,8,4,2,4,57}, {45,6,79}, {400, 2}, {5,7,8,4,3,5,6,7,4,22,4,6,8,9}};
        biggestFirst(arr);
        display(arr);
        System.out.print("Smallest: " + minRec(arr[0]));
    }
    public static void display(int[][] arr) {
        for (int[] i : arr)
            for (int j = 0; j < i.length; j++) {
                if (j == i.length-1) System.out.println(i[j]);
                else System.out.print(i[j] + ", ");
            }
    }
    public static void biggestFirst(int[][] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (sum(arr[i]) > sum(arr[0])) {
                int[] newArr = arr[0];
                arr[0] = arr[i];
                arr[i] = newArr;
            }
        }
    }
    public static int sum(int[] arr) {
        int sum = 0;
        for (int i : arr)
            sum += i;
        return sum;
    }
    public static int minRec(int[] arr) {
        return helper(arr, 1, arr[0]);
    }
    public static int helper(int[] arr, int index, int minimum) {
        if (arr[index] < minimum) minimum = arr[index];
        if (index == arr.length-1) return minimum;
        return helper(arr, ++index, minimum);
    }
}