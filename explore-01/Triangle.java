import java.util.*;

public class Triangle {
	public static void main (String args []) {

		Scanner sc = new Scanner(System.in); String one = ""; String two = ""; String three = ""; int i = 0;
		System.out.print("Enter the angles of the triangle: "); String s = sc.nextLine();

		for (;i < s.length() && s.charAt(i) != ' '; i++)
			one += s.charAt(i); i++;
		for (;i < s.length() && s.charAt(i) != ' '; i++)
			two += s.charAt(i); i++;
		for (;i < s.length() && s.charAt(i) != ' '; i++)
			three += s.charAt(i);

		int o = Integer.parseInt(one); int t = Integer.parseInt(two); int r = Integer.parseInt(three);

		if (o > 180 || t > 180 || r > 180 || o+t+r != 180)
			System.out.print("Error.");
		else
			System.out.print("This is a valid triangle.");
	}
}