public class BooleanSort {
    static void main(String[] args) {
        display(indexSort2(new int[] {2,4,56,35,435,435,223,41,5,2,35,52}));
    }
    static int[] booleanSort(int[] arr) {
        int max = arr[0];
        for (int i : arr)
            if (i > max) max = i;
        boolean[] booleanArr = new boolean[max+1];
        for (int i : arr)
            booleanArr[i] = true;
        int[] arr2 = new int[arr.length];
        for (int i = 0, j = 0; i < arr2.length;)
            for (; j < booleanArr.length; j++)
                if (booleanArr[j])
                    for (int k = 0; k < occurrences(j, arr); k++)
                        arr2[i++] = j;
        return arr2;
    }
    static int[] countingSort(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i : arr)
            if (i > max) max = i;
        int[] flag = new int[max+1];
        for (int i : arr)
            flag[i]++;
        int[] res = new int[arr.length];
        for (int i = 0, j = 0; i < flag.length; i++)
            while (flag[i]-- > 0)
                res[j++] = i;
        return res;
    }
    public static int[] indexSort(int[] arr) {
        int[] res = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            int pos = 0;
            for(int j = 0; j < arr.length; j++)
                if(arr[i] > arr[j] || (arr[i] == arr[j] && i > j)) pos++;
            res[pos] = arr[i];
        }
        return res;
    }
    static int[] indexSort2(int[] arr) {
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int pos = 0;
            for (int j : arr)
                if (arr[i] > j) pos++;
            res[pos + occurrences(arr[i], res)] = arr[i];
        }
        return res;
    }
    static int occurrences(int x, int[] arr) {
        int count = 0;
        for (int i : arr)
            if (i == x) count++;
        return count;
    }
    static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length-1) System.out.print(arr[i]+"\n");
            else System.out.print(arr[i]+", ");
        }
    }
    static void display(boolean[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length-1) System.out.print(arr[i]+"\n");
            else System.out.print(arr[i]+", ");
        }
    }
}