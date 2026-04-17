package explore01;

import java.util.Scanner;

public class Maximum {
	public static void main (String args []) {
		System.out.println(max(1,5));
		System.out.println(max(1.5,5.5));
		System.out.println(max("Hello","World"));
	}

	public static int max (int x, int y) {
		if (x > y) return x; return y; }
	public static double max (double x, double y) {
		if (x > y) return x; return y; }
	public static String max (String x, String y) {
		if (x.compareTo(y) > 0) return x; return y;
	}
}