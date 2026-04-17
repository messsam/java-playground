import java.util.Scanner;

public class Censor {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter a string: "); String s = sc.nextLine();
         System.out.print("Enter a character: "); char c = sc.next().charAt(0);
         System.out.println(replace3(s, c));
         System.out.println(replace2(s, c));
         replace1(s, c);
     }

     public static void replace1(String s, char c) {
         if (s.isEmpty()) return;
         if (s.charAt(0) == c) System.out.print("*");
         else System.out.print(s.charAt(0));
         replace1(s.substring(1), c);
     }

     public static String replace2(String s, char c) {
         StringBuilder neu = new StringBuilder();
         for (int i = 0; i < s.length(); i++) {
             if (s.charAt(i) == c) neu.append("*");
             else neu.append(s.charAt(i)); }
         return neu.toString();
     }

     public static String replace3(String s, char c) {
         if (s.isEmpty()) return "";
         if (s.charAt(0) == c) return "*" + replace3(s.substring(1), c);
         else return s.charAt(0) + replace3(s.substring(1), c);
     }
}