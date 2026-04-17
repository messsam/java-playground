import java.util.Scanner;
public class Arrays {
    public static void main(String[] args) {
        /*int[] arr1 = new int[Integer.parseInt(args[0])];
        int[] arr2 = new int[Integer.parseInt(args[1])];
        int j = 2;
        for (int i = 0; i < arr1.length; i++)
            arr1[i] = Integer.parseInt(args[j++]);
        for (int i = 0; i < arr2.length; i++)
            arr2[i] = Integer.parseInt(args[j++]);
        display(minMaxResult(arr1, arr2));*/
        findMaxDifferencePair(new String[] {"apple", "banana", "cherry", "date", "elderberry"});
        System.out.println(specialParse("s1r5"));
        System.out.println(recSpecialParse("s1r5"));
        display(moveZeros(new int[] {0,0,1,0,3,0,5,0,6}));
        System.out.println(isMultiple((new int[][] {{1,6}, {6,7}})));
    }
    public static int sum(int[] arr) {
        int sum = 0;
        for (int x : arr) sum += x;
        return sum;
    }
    public static int max1(int[] arr) {
        int max = arr[0];
        for (int x : arr)
            if (x > max) max = x;
        return max;
    }
    public static int max2(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++)
            if (arr[i] > max) max = arr[i];
        return max;
    }
    public static int[] odd(int[] arr) {
        int index = 0; int[] neu = new int[arr.length/2];
        for (int i = 1; i < arr.length; i += 2)
            neu[index++] = arr[i];
        return neu;
    }
    public static void display(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length-1) System.out.println(arr[i]);
            else System.out.print(arr[i] + ", ");
        }
    }
    public static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length-1) System.out.println(arr[i]);
            else System.out.print(arr[i] + ", ");
        }
    }
    public static void display(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length-1) System.out.println(arr[i]);
            else System.out.print(arr[i] + ", ");
        }
    }
    public static void display(int[][] arr) {
        for (int i = 0; i < arr.length; i++)
            display(arr[i]);
    }
    public static void display(double[][] arr) {
        for (int i = 0; i < arr.length; i++)
            display(arr[i]);
    }
    public static boolean occurs(char c, String s) {
        for (int i = 0; i < s.length(); i++)
            if (s.charAt(i) == c) return true;
        return false;
    }
    public static boolean occurs(char c, String[] s) {
        for (int i = 0; i < s.length; i++)
            if (!occurs(c, s[i])) return false;
        return true;
    }
    public static boolean occursArr(char c, String[] s) {
        for (String x : s)
            if (!occurs(c, x)) return false;
        return true;
    }
    public static boolean isRagged(int[][] arr) {
        for (int i = 1; i < arr.length; i++)
            if (arr[i-1].length != arr[i].length) return false;
        return true;
    }
    public static boolean isRagged(double[][] arr) {
        for (int i = 1; i < arr.length; i++)
            if (arr[i-1].length != arr[i].length) return false;
        return true;
    }
    public static int[] getCol(int[][] arr, int x) {
        int[] newArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++)
            newArray[i] = arr[i][x];
        return newArray;
    }
    public static int[][] twoDArray(int x) {
        return new int[x][x];
    }
    public static void filler(int[][] arr, int x) {
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr[i].length; j++)
                arr[i][j] = x;
    }
    public static int[][] triangle(int x) {
        int[][] newArray = new int[x][];
        for (int i = 0; i < x; i++) {
            newArray[i] = new int[i+1];
            for (int j = 0; j <= i; j++)
                newArray[i][j] = j+1; }
        return newArray;
    }
    public static int[] expand(int[] arr, int n) {
        if (n < 1) return new int[0];
        int[] newArr = new int[arr.length*n]; int count = 0;
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < n; j++)
                    newArr[count++] = arr[i] / n;
        return newArr;
    }
    public static void split1(int[] array, int pivot) {
        int j = array.length-1;
        for (int i = 0; i < j; i++)
            while (array[i] > pivot && i < j) { swap(array, i, j--); }
    }
    public static void split2(int[] array, int pivot) {
        int i = 0; int j = array.length-1;
        while (i < j) {
            if (array[i] > pivot) swap(array, i, j--);
            else i++;
        }
    }
    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first]; arr[first] = arr[second]; arr[second] = temp;
    }
    public static String random(int x) {
        StringBuilder rand = new StringBuilder(); int num;
        for (int i = 0 ; i < x; i++) {
            do { num = (int)(Math.random() * x); }
            while (occurs((char)(num+'0'), rand.toString()));
            rand.append(num); }
        return rand.toString();
    }
    public static String[] shuffle1(String[] arr) {
        String rand = random(arr.length);
        String[] shuffle = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            shuffle[i] = arr[rand.charAt(i)-'0']; }
        return shuffle;
    }
    public static String[] shuffle2(String[] arr) {
        String[] rand = new String[arr.length]; int num;
        for (int i = 0; i < arr.length; i++) {
            do { num = (int)(Math.random()*arr.length); }
            while (rand[num] != null);
            rand[num] = arr[i]; }
        return rand;
    }
    public static void swap(int[] arr) {
        int j = arr.length - 1;
        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j--] = temp;
        }
    }
    public static int firstLonely(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) { if (arr[i] != arr[i+1]) return arr[i]; }
            else if (i == arr.length-1) { if (arr[i] != arr[i-1]) return arr[i]; }
            else if (arr[i] != arr[i+1] && arr[i] != arr[i-1]) return arr[i];
        }   return -1;
    }
    public static int[] insertZero(int[] arr) {
        int evens = 0, j = 0;
        for (int i : arr)
            if (i%2 == 0) evens++;
        int[] newArr = new int[arr.length+evens];
        for (int i : arr) {
            if (i%2 == 0) { newArr[j] = i; newArr[++j] = 0; ++j; }
            else newArr[j++] = i; }
        return newArr;
    }
    public static double absoluteDifference(double[] arr) {
        double absoluteDiff = Double.POSITIVE_INFINITY;
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr.length; j++)
                if (i != j && Math.abs(arr[i] - arr[j]) < absoluteDiff)
                    absoluteDiff = Math.abs(arr[i] - arr[j]);
        return absoluteDiff;
    }
    public static int[] prod(int[] arr) {
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int prod = 1;
            for (int j = 0; j < arr.length; j++)
                if (j != i) prod *= arr[j];
            newArr[i] = prod;
        }   return newArr;
    }
    public static String alpha(String s) {
        StringBuilder newS = new StringBuilder();
        for (int i = 0; i < s.length(); i++)
            if (Character.isLetter(s.charAt(i)))
                newS.insert(0, s.charAt(i));
        return newS.toString();
    }
    public static String reversedAlpha(String s) {
        if (s.isEmpty()) return "";
        if (Character.isLetter(s.charAt(0)))
            return reversedAlpha(s.substring(1)) + s.charAt(0);
        else return reversedAlpha(s.substring(1));
    }
    public static int maxProduct(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++)
            if (arr[i] > max) max = arr[i];
        return helper1(arr, 0, max, arr[0]);
    }
    public static int helper1(int[] arr, int i, int max, int sec) {
        if (i == arr.length) return max*sec;
        if (arr[i] > sec && arr[i] != max) sec = arr[i];
        return helper1(arr, ++i, max, sec);
    }
    public static boolean symmetric(int[][] arr) {
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr[j].length; j++)
                if (arr[i][j] != arr[j][i]) return false;
        return true;
    }
    public static int[] minMaxResult(int[] arr1, int[] arr2) {
        int[] newArr = new int[(arr1.length > arr2.length? arr1.length: arr2.length)];
        for (int i = 0; i < newArr.length; i++) {
            if (i >= arr1.length) newArr[i] = arr2[i];
            else if (i >= arr2.length) newArr[i] = arr1[i];
            else if (i%2 == 0) newArr[i] = arr1[i] < arr2[i]? arr1[i]: arr2[i];
            else newArr[i] = arr1[i] > arr2[i]? arr1[i]: arr2[i];
        }
        return newArr;
    }
    public static void findMaxDifferencePair(String[] s) {
        String s1 = s[0], s2 = s[0]; int max = s1.length() - s2.length();
        for (int i = 0; i < s.length; i++)
            for (int j = i; j < s.length; j++)
                if (Math.abs(s[i].length() - s[j].length()) > max) {
                    s1 = s[i]; s2 = s[j]; max = Math.abs(s1.length() - s2.length());
                }
        System.out.println("The string are: "+s1+", "+s2);
    }
    public static int specialParse(String s) {
        String nums = "";
        for (int i = 0; i < s.length(); i++)
            if (Character.isDigit(s.charAt(i)))
                nums += s.charAt(i);
        return Integer.parseInt(nums);
    }
    public static int recSpecialParse(String s) {
        return Integer.parseInt(helper2(s));
    }
    public static String helper2(String s) {
        if (s.isEmpty()) return "";
        if (Character.isDigit(s.charAt(0)))
            return s.charAt(0) + helper2(s.substring(1));
        else return helper2(s.substring(1));
    }
    public static int[] moveZeros(int[] arr) {
        int[] newArr = new int[arr.length];
        return helper3(arr, newArr, 0, 0);
    }
    public static int[] helper3(int[] arr1, int[] arr2, int i, int j) {
        if (i == arr1.length) return arr2;
        if (arr1[i] != 0) arr2[j++] = arr1[i];
        return helper3(arr1, arr2, ++i, j);
    }
    public static boolean isMultiple(int[][] arr) {
        for (int i = 1; i < arr.length; i++)
            for (int j = 0; j < arr[i].length; j++)
                if (arr[i][j] % arr[i - 1][j] != 0)
                    return false;
        return true;
    }
}