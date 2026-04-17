import java.util.*;

public class Huh {
	public static void main (String args []) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number: "); int x = sc.nextInt(); int xx = x;
		System.out.print("Enter the second number: "); int y = sc.nextInt(); int yy = y;

        while (x != y) {
			if (x > y)
				x -= y;
			else
				y -= x;
		} System.out.print("The GCD for "+xx+" and "+yy+" is: "+x);
	}
}