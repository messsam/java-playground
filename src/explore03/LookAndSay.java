import java.util.Scanner;

public class LookAndSay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Nth number: ");
        int x = sc.nextInt();
        lookAndSay(x);
    }
    public static void lookAndSay(int x) {
        System.out.println("1");
        lookAndSay(x, 1, "1");
    }
    public static void lookAndSay(int x, int y, String s) {
        if (x == y) return;
        String num = helper(s);
        System.out.println(num);
        lookAndSay(x, ++y, num);
    }
    public static String helper(String s) {
        StringBuilder say = new StringBuilder();
        for (int i = 0; i < s.length(); i = 0) {
            while (i < s.length() && s.charAt(i) == s.charAt(0)) { i++; }
            say.append(i).append(s.charAt(0));
            s = s.substring(i); }
        return say.toString();
    }
}