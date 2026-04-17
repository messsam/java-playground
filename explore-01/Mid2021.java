import java.util.Scanner;

public class Mid2021 {
	public static void main(String args []) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: "); String s = sc.nextLine();
		print(s);
	}
	public static void print(String s) {
		int G; for (G = 0; s.charAt(G) != ' '; G++) {}
		int space1 = G; int i; String neu = "";
		for (i = s.length()-1; s.charAt(i) != ' '; i--)
			neu = "" + s.charAt(i) + neu; neu += " ";
		for (i--; i >= space1; i--)
			neu += s.charAt(i);
		for (int j = 0; j < space1; j++)
			neu += s.charAt(j);
		System.out.print(neu);
	}
}