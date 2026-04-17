import java.util.Scanner;
public class CompoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("== Compound Interest Calculator ==\n");
        System.out.print("Enter the principal monthly amount: $"); double p = sc.nextDouble();
        System.out.print("Enter the annual interest rate: %"); double r = sc.nextDouble()/100/12;
        System.out.print("How long is the installment plan? (In months) "); int m = sc.nextInt();
        double result = p; for (int i = 1; i < m; i++, result += p) { result = result + result*r; }
        System.out.print("\nThe amount after "+m+" months will be: $"+result+"\n");
    }
}