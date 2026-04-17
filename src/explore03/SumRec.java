import java.util.Scanner;
public class SumRec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: "); int x = sc.nextInt();
        System.out.print(Sum(x));
    }
    public static int Sum(int x) {
        if (x == 1) return x;
        return x + Sum(--x);
    }
}