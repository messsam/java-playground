import java.util.Scanner;
public class Digs {
    public static void main(String[] args) {
        if (args.length == 0) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a string with numbers: ");
            System.out.print(digits2(sc.nextLine()));
        } else { System.out.print(digits(string(args))); }
    }
    public static int digits(String s) {
        int digits = 0;
        for (int i = s.length()-1, j = 1; i > 0; i--)
            if (Character.isDigit(s.charAt(i))) {
                digits += (s.charAt(i)-'0')*j; j *= 10;
            }
        return digits;
    }
    public static int digits2(String s) {
        int digits = 0;
        for (int i = 0; i < s.length(); i++)
            if (Character.isDigit(s.charAt(i))) {
                digits *= 10; digits += (s.charAt(i)-'0');
            }
        return digits;
    }
    public static String string(String[] args) {
        StringBuilder string = new StringBuilder();
        for (String s : args) string.append(s);
        return string.toString();
    }
}