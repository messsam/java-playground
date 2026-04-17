import java.util.*;

public class Lap1 {
	public static void main (String args []) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first angle: "); int one = sc.nextInt();
		System.out.print("Enter the second angle: "); int two = sc.nextInt();
		System.out.print("Enter the third angle: "); int three = sc.nextInt();

		if (one<0 || two<0 || three<0)
			System.out.print("A triangle cannot have a negative angle.");
		else if (one>180 || two>180 || three>180)
			System.out.print("Error. Each agnle must be less than 180!");
		else if (one + two + three == 180)
			System.out.print("A valid triangle!");
		else
			System.out.print("Non valid triangle.");
	}
}