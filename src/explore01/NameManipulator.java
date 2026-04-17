package explore01;

import java.util.Scanner;

public class NameManipulator {
	public static void main (String args []) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name and behold the magic. Keep it small or i'll do it myself ;) ");
		String name = sc.next(); name = name.toLowerCase(); String manipulated = ""; int i;

		if (name.length() % 2 != 0) {
			for (i = 0; i < name.length()-2; i += 2) {
				System.out.print("" + name.charAt(i+1) + name.charAt(i));
			}   System.out.print("" + name.charAt(i));
		} else  {
			for (i = 0; i < name.length()-1; i += 2) {
				System.out.print("" + name.charAt(i+1) + name.charAt(i));
			}
		}
	}
}