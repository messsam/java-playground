package explore01;

import java.util.Scanner;
public class RevChuncker {
	public static void main(String args []) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: "); String s = sc.nextLine();
		System.out.print("Enter a key: "); int n = sc.nextInt();
		System.out.print(reverseChunck(s, n));
	}
	public static String reverseChunck(String s, int n) {
		String neu = ""; int remainder = s.length()%n;
		for (int i = 0; i < s.length() - remainder; i += n)
			for (int j = n-1; j >= 0; j--)
				neu += s.charAt(j+i);
		if (remainder > 0)
			for (int i = neu.length(); i < s.length(); i++)
				neu += s.charAt(i);
		return neu;
	}
}