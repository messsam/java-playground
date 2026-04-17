import java.util.Scanner;

public class StrManipulation {

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        System.out.print(Quiz1(s));
    }

    public static String Quiz1(String s) {
        StringBuilder neu = new StringBuilder(); int sum = 0;
        for (int i = s.length()-2; i >= 0; i--) { //Starts from (end - 1) till beginning.
            if (Character.isDigit(s.charAt(i)))
                sum += s.charAt(i) - '0';
            else  neu.append(s.charAt(i)); }
        neu.insert(0, sum);
        return neu.toString();
    }
}
