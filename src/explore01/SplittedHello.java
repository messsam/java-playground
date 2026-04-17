package explore01;

import java.util.Scanner;

public class SplittedHello {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: "); String s = sc.nextLine();
        System.out.print("Enter another string: "); String c = sc.nextLine();
        MergeRec(s, c);
    }
    public static void MergeRec (String s, String c) {
        if (s.isEmpty() && c.isEmpty()) return;
        if (!s.isEmpty()) System.out.print(s.charAt(0) + " ");
        if (!c.isEmpty()) System.out.print(c.charAt(0) + " ");
        if (!s.isEmpty() && !c.isEmpty()) MergeRec(s.substring(1), c.substring(1));
        if (s.isEmpty()) MergeRec(s, c.substring(1));
        if (c.isEmpty()) MergeRec(s.substring(1), c);
    }
}