package explore02;

public class Swap {
    public static void main(String[] args) { System.out.print(swap(args)); }
    public static String swap(String[] arr) {
        StringBuilder string = new StringBuilder();
        for (int i = arr.length-1; i >= 0; i--) {
            for (int j = arr[i].length()-1; j >= 0; j--)
                string.append(arr[i].charAt(j));
            string.append(" ");
        }
        return string.toString();
    }
}