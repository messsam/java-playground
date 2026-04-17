import java.util.Scanner;

public class Average {
	public static void main (String args []) {

		Scanner sc = new Scanner(System.in);
		int min = 2147483647; int max = -1; double sum = 0; double count = 0;

		while (true) {
			System.out.print("Enter a number: "); int x = sc.nextInt(); if (x < 0) break;
			else { sum += x; count += 1; if (x > max) max = x; if (x<min) min = x; }}

		double avg = sum/count;
		System.out.println("Maximum is: "+max);
		System.out.println("Minimum is: "+min);
		System.out.print("Average is: "+avg);
	}
}