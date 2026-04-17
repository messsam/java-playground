// Shuffling the 'args' array of strings.

public class Tester {
    public static void main(String[] args) { display(shuffle(args)); }
    public static void display(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length-1) System.out.print(arr[i]);
            else System.out.print(arr[i] + " ");
        }
    }
    public static String[] shuffle(String[] arr) {
        String[] newArr = new String[arr.length];
        for (String i : arr) {
            int random; do { random = (int)(Math.random()*arr.length); }
            while (newArr[random] != null);
            newArr[random] = i;
        }
        return newArr;
    }
}