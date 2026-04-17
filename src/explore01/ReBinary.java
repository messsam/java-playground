package explore01;

import java.util.Scanner;

public class ReBinary {
	public static void main(String args []) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a decimal number: "); int x = sc.nextInt();
		System.out.print(binary(x));
	}
	public static String binary(int x) {
		if (x == 0) return "";
		return binary(x/2) + x%2;
	}
	public static String binary2(int x) {
		if (x/2 == 0) return x%2+"";
		return binary2(x/2) + x%2;
	}
}