import java.util.Scanner;

public class Eliminate {

    public static void main(String [] args) {
         Scanner sc = new Scanner(System.in);

         System.out.print("Enter a string: "); String s = sc.nextLine();
         System.out.print("Enter a character: "); char c = sc.next().charAt(0);
         System.out.print(eliminate(s, c));
     }

     public static String eliminate(String s, char c) {
        if (s.isEmpty()) return "";
        if (s.charAt(0) == c) return eliminate(s.substring(1), c);
        else return s.charAt(0) + eliminate(s.substring(1), c);
     }
}