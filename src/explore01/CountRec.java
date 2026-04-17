import java.util.Scanner;

public class CountRec {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");String s = sc.nextLine();
		System.out.print("Enter a character: "); char c = sc.next().charAt(0);
		System.out.print(countRec(s, c));
	}
	public static int countRec(String s, char c) {
		if (s.isEmpty()) return 0;
		if (s.charAt(0) == c)
			return 1 + countRec(s.substring(1), c);
		return countRec(s.substring(1), c);
	}
}