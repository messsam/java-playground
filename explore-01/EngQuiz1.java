import java.util.Scanner;

public class EngQuiz1 {
	public static void main(String args []) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: "); String s = sc.next();
		String num = ""; String c = ""; int product = 1;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '0' || s.charAt(i) == '1' || s.charAt(i) == '2' || s.charAt(i) == '3' ||
				s.charAt(i) == '4' || s.charAt(i) == '5' || s.charAt(i) == '6' || s.charAt(i) == '7' ||
				s.charAt(i) == '8' || s.charAt(i) == '9')
					num += s.charAt(i);
			else c += s.charAt(i); }
		for (int i = 0; i < c.length()-1; i++) {
			if (c.charAt(i) != c.charAt(i+1)) {
				if ((int) c.charAt(i) - (int) c.charAt(i+1) < 0)
					product *= (int) c.charAt(i+1) - (int) c.charAt(i);
				else product *= (int) c.charAt(i) - (int) c.charAt(i+1); }}
		if (product == Integer.parseInt(num))
			System.out.println(true);
		else
			System.out.println(false);
	}
}