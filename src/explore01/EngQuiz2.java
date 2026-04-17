package explore01;

import java.util.Scanner;

public class EngQuiz2 {
	public static void main(String args []) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: "); int x = sc.nextInt();
		int num = x % 10, max = 0, min = 10, xx = x, index1 = 0, index2 = 0;

		for (int i = 10; x > 9; i *= 10) {
			if ((x%100)/10 > x%10 && (x%100)/10 > (x%1000)/100 && (x%100)/10 > max)
			{ max = (x%100)/10; index1 = i; }
			else if ((x%100)/10 < x%10 && (x%100)/10 < (x%1000)/100 && (x%100)/10 < min)
			{ min = (x%100)/10; index2 = i; }
			x /= 10; }
		for (int j = 10; xx > 9; j *= 10) {
			if (j == index1) num += min*j;
			else if (j == index2) num += max*j;
			else num += ((xx%100)/10) * j;
			xx /= 10; }
		System.out.println("Max is "+max+" index "+index1+"\nMin is "+min+" index "+index2);
		System.out.print(num);
	}
}