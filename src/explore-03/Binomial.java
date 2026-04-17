import java.util.Scanner;

public class Binomial {

     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

         System.out.print("Enter the size of the set: "); int n = sc.nextInt();
         System.out.print("Enter the number of opportunities: "); int k = sc.nextInt();
         if (n >= k) System.out.print("Error. N should be less than K.");
         else System.out.print("There are " + binomial(n, k) + " ways to choose " + k + " objects out of " + n);
    }

    public static int binomial(int n, int k) {
         if (n == 0 || n == k) return 1;
         return binomial(n-1, k) + binomial(n-1, k-1);
    }
}