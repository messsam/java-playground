import java.util.Scanner;
public class GCD {
    static void main() {
        Scanner sc = new Scanner(System.in);
        IO.print("Number: "); int x = sc.nextInt();
        IO.print(nthPrime(x));
    }
    static int gcd(int x, int y) {
        while (x != y) {
            if (x > y) x = x-y;
            else y = y-x;
        }
        return x;
    }
    static int add(String x, String y) {
        int carry = 0, len = Math.max(x.length(), y.length());
        StringBuilder res = new StringBuilder();
        for (int i = 1; i <= len; i++) {
            int sum;
            if (i > x.length()) sum = (y.charAt(y.length()-i)-'0') + carry;
            else if (i > y.length()) sum = (x.charAt(x.length()-i)-'0') + carry;
            else sum = (y.charAt(y.length()-i)-'0') + (x.charAt(x.length()-i)-'0') + carry;
            res.insert(0, sum%10);
            carry = sum>9? 1: 0;
        }
        if (carry == 1) res.insert(0, 1);
        return Integer.parseInt(res.toString());
    }
    static int add(int x, int y) {
        int res = 0, carry = 0, i = 1;
        while (x != 0 || y != 0 || carry != 0) {
            int sum = x%10 + y%10 + carry;
            res += sum%10 * i;
            i *= 10;
            x /= 10;
            y /= 10;
            carry = sum > 9? 1: 0;
        }
        return res;
    }
    static boolean prime(int x) {
        if (x == 2) return true;
        if (x <= 1 || x%2 == 0) return false;
        for (int i = 3; i*i <= x; i += 2)
            if (x%i == 0) return false;
        return true;
    }
    static int nthPrime(int x) {
        for (int num = 2, count = 0; true; num++)
            if (prime(num))
                if (++count == x)
                    return num;
    }
}