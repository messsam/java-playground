import java.util.*;
public class SortedStringMid {
	public static void main(String args []) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: "); String s1 = sc.nextLine();
		System.out.print("Enter another one: "); String s2 = sc.nextLine();
		System.out.print(mergeStringSorted(s1, s2));
	}
	public static String mergeStringSorted(String s1, String s2) {
		if (s1.isEmpty())
			return s2;
		if (s2.isEmpty())
			return s1;
		if (s1.charAt(0) < s2.charAt(0))
			return "" + s1.charAt(0) + mergeStringSorted(s1.substring(1), s2);
		return "" + s2.charAt(0) + mergeStringSorted(s1, s2.substring(1));
	}
}