import java.util.Scanner;

public class Pascal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = sc.nextInt(); sc.close();
        pascal(x);
    }
    public static void pascal(int x) {
        int[][] pascal = new int[x][];
        for (int i = 0; i < x; i++) {
            pascal[i] = new int [i+1];
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == pascal[i].length - 1) pascal[i][j] = 1;
                else pascal[i][j] = pascal[i-1][j-1] + pascal[i-1][j]; } }
        display(pascal);
    }
    public static void display(int[][] arr) {
        for (int[] i : arr)
            for (int j = 0; j < i.length; j++) {
                if (j == i.length-1) System.out.println(i[j]);
                else System.out.print(i[j] + ", ");
            }
    }
}