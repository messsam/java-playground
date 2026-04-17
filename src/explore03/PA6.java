package explore03;

import java.util.Scanner;

public class PA6 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: "); int x = sc.nextInt();
        System.out.print("Enter another number: "); int y = sc.nextInt();
        System.out.print("Enter the power: "); int e = sc.nextInt();
        System.out.print("Enter a string: "); String s = sc.nextLine();
        System.out.print("Enter a character: "); char c = sc.next().charAt(0);
        System.out.print(replace(s, c));
        if (x < 1) System.out.print("Not valid.");
        else System.out.print(prime(x, --x));
        System.out.print(sumOfDigits(x) + "\n" + numOfDigits(x));
        System.out.print(countRec(s, c));
        System.out.print(putAtFront(s, c, ""));
        System.out.print(reverse(s));
        System.out.println(powerRec(x, e));
        countDown(x);
        System.out.println(factorial(x));
        System.out.print(perfect(x));
        System.out.print(multiplyRec(x, y));
        if (y <= 0) System.out.print("Error."); //Modulus
        else System.out.print(modulusRec(x, y));
    }
    public static String mergeRec(String s, String c) {
        if (s.isEmpty() && c.isEmpty()) return "";
        else if (s.isEmpty()) return c.charAt(0) + mergeRec(s, c.substring(1));
        else if (c.isEmpty()) return s.charAt(0) + mergeRec(s.substring(1), c);
        else return "" + s.charAt(0) + c.charAt(0) + mergeRec(s.substring(1), c.substring(1));
    }
    public static String replace(String s, char c) {
        if (s.isEmpty()) return "";
        if (s.charAt(0) == c) return "*" + replace(s.substring(1), c);
        else return s.charAt(0) + replace(s.substring(1), c);
    }
    public static boolean prime(int x, int d) {
        if (d <= 1) return true;
        if (x % d == 0) return false;
        return prime(x, --d);
    }
    public static int sumOfDigits(int x) {
        if (x == 0) return 0;
        return x%10 + sumOfDigits(x/10);
    }
    public static int numOfDigits(int x) {
        if (x == 0) return 0;
        return 1 + numOfDigits(x/10);
    }
    public static int countRec(String s, char c) {
        if (s.isEmpty()) return 0;
        if (s.charAt(0) == c)
            return 1 + countRec(s.substring(1), c);
        return countRec(s.substring(1), c);
    }
    public static String putAtFront(String s, char c, String a) { //a is an empty string initially.
        if (s.isEmpty()) return a;
        if (s.charAt(0) == c) return c + putAtFront(s.substring(1), c, a);
        a += s.charAt(0); return putAtFront(s.substring(1), c, a);
    }
    public static String reverse(String s) {
        if (s.isEmpty()) return s;
        return reverse(s.substring(1)) + s.charAt(0);
    }
    public static void countDown(int x) {
        if (x == 0) { System.out.print("Blastoff!"); return; }
        System.out.println(x);
        countDown(--x);
    }
    public static int powerRec(int x, int e) {
        if (e == 0) return 1;
        if (e%2 == 0) {
            int num = powerRec(x, e/2);
            return num * num; }
        return x * powerRec(x, --e);
    }
    public static double constantRec(int x) {
        if (x == 0) return 1;
        return 1.0/factorial(x) + constantRec(--x);
    }
    public static int factorial(int x) {
        if (x <= 1) return 1;
        return x * factorial(--x);
    }
    public static int multiplyRec(int x, int y) {
        if (y == 0) return 0;
        if (y%2 == 0) {
            int num = multiplyRec(x, y/2);
            return num + num;
        }
        return x + multiplyRec(x, --y);
    }
    public static int modulusRec(int x, int y) {
        if (x < y) return x;
        return modulusRec(x-y, y);
    }
    public static String search(String s, char c) {
        return search(s, c, false);
    }
    public static String search(String s, char c, boolean flag) {
        if (s.isEmpty() && !flag) return "-1";
        if (s.isEmpty()) return s;
        if (s.charAt(s.length()-1) == c) {
            flag = true;
            return search(s.substring(0, s.length() - 1), c, flag) + " " + (s.length() - 1); }
        return search(s.substring(0, s.length()-1), c, flag);
    }
    public static boolean perfect(int x) {
        return SumOfDivisors(x, x-1) == x;
    }
    public static int SumOfDivisors(int x, int num) {
        if (num == 0) return 0;
        if (x%num == 0) return num + SumOfDivisors(x, --num);
        return SumOfDivisors(x, --num);
    }
}