package explore01;

import java.util.Scanner;

public class Graph {
	public static void main (String args []) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the x coordinate: "); int x = sc.nextInt();
		System.out.print("Enter the y coordinate: "); int y = sc.nextInt();

		if (x==0 && y==0)
			System.out.print("The point is at the origin.");
		else if (x>0 && y>0)
			System.out.print("The point is at the 1st quadrant.");
		else if (x<0 && y>0)
			System.out.print("The point is at the 2nd quadrant.");
		else if (x<0 && y<0)
			System.out.print("The point is at the 3rd quadrant.");
		else if (x>0 && y<0)
			System.out.print("The point is at the 4th quadrant.");
	}
}