public class Test {
    public static void main(String[] args) {
        /*int[] arr1 = new int[Integer.parseInt(args[0])];
        int[] arr2 = new int[Integer.parseInt(args[1])];
        int i = 2;
        for (int j = 0; j < arr1.length; j++)
            arr1[j] = Integer.parseInt(args[i++]);
        for (int j = 0; j < arr2.length; j++)
            arr2[j] = Integer.parseInt(args[i++]);
        display(minMaxResult(arr1, arr2));*/
        int[] arr = {0,1,2,3};
        display(moveZeros(arr));
    }
    /*public static int[] minMaxResult(int[] arr1, int[] arr2) {
        int[] arr = new int[arr1.length>arr2.length? arr1.length: arr2.length];
        for (int i = 0; i < arr.length; i++) {
            if (i >= arr1.length) arr[i] = arr2[i];
            else if (i >= arr2.length) arr[i] = arr1[i];
            else if (i%2 == 0) arr[i] = arr1[i]<arr2[i]? arr1[i]: arr2[i];
            else arr[i] = arr1[i]>arr2[i]? arr1[i]: arr2[i];
        }
        return arr;
    }*/
    public static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length-1) System.out.print(arr[i]);
            else System.out.print(arr[i] + ", ");
        }
    }
    public static int[] moveZeros(int[] arr) {
        int[] newArr = new int[arr.length];
        helper(arr, newArr, 0, 0);
        return newArr;
    }
    public static void helper(int[] arr, int[] newArr, int i, int j) {
        if (i == arr.length) return;
        if (arr[i] != 0) newArr[j++] = arr[i];
        helper(arr, newArr, ++i, j);
    }
}