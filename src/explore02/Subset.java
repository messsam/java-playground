package explore02;

public class Subset {
    public static void main(String[] args) {
        int len1 = 0, len2 = 0, k = 0, i = 0, j = 0;
        for (; !args[k].equals("-"); k++, len1++);
        for (k++; k < args.length; k++, len2++);
        int[] arr1 = new int[len1];
        int[] arr2 = new int[len2];
        for (; !args[i].equals("-"); i++)
            arr1[i] = Integer.parseInt(args[i]);
        for (i++; i < args.length; i++, j++)
            arr2[j] = Integer.parseInt(args[i]);
        display(arr1); display(arr2);
        System.out.print(isSubset(arr1, arr2));
    }
    public static boolean isSubset(int[] arr1, int[] arr2) {
        for (int i = 0; i <= arr2.length-arr1.length; i++) {
            int correctIndex = 0;
            for (int j = 0; j < arr1.length; j++)
                if (arr1[j] == arr2[j + i])
                    correctIndex++;
            if (correctIndex == arr1.length)
                return true;
        }
        return false;
    }
    public static void display(int[] arr) {
        for (int i = 0 ; i < arr.length; i++) {
            if (i == arr.length-1) System.out.println(arr[i]);
            else System.out.print(arr[i] + ", ");
        }
    }
}