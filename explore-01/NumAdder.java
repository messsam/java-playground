import java.util.Scanner;

public class NumAdder {
	public static void main (String args []) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a snetence: "); String s = sc.nextLine();
		System.out.print("The sum of the numbers in this sentence is: "+sumOfDigits(s));
	}

	public static int sumOfDigits(String s) {
		int sum = 0;
		for (int i = 0; i < s.length(); i++) {
			String num = "";
			for (; i < s.length() && Character.isDigit(s.charAt(i)); i++)
				num += s.charAt(i);
			if (!num.isEmpty()) sum += Integer.parseInt(num); }
		return sum;
	}
}