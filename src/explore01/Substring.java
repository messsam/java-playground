package explore01;

import java.util.*;

public class Substring {
	public static void main (String args []) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: "); String s = sc.nextLine();
		System.out.print("Enter a word: "); String w = sc.next();

		System.out.print(substring(w, s));


	}

	public static boolean substring (String x, String y) {
		boolean flag = false;

		for (int i = 0; i < y.length() - x.length()+1 && flag == false; i++) {
			int j = i; String temp = "";
			for (int l = 0; l < x.length(); l++) {
				temp += y.charAt(j); j++; }
			flag = x.equals(temp); }

		return flag;
	}
}