package explore01;

import java.util.Scanner;

public class Vowels2 {
	public static void main (String args []) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a sentence: "); String s = sc.nextLine(); s = s.toLowerCase();
		System.out.println(); int con = 0; int vow = 0; int pc = 0; int spaces = 0;

		for (int i = 0; i<s.length(); i++) {
			switch(s.charAt(i)) {
				case 'a':case 'e': case 'u': case 'o': case 'i': vow++; break;
				case '.': case ',': case ';': case ':': case '?':case ']':
				case '[': case '{': case '}': case ')': case '(': case '*':
				case '&': case '!': case '"': pc++; break;
				case ' ': spaces++; break;
				default: con ++;
			}
		}
	    System. out.print("The sentence contains "+con+" consonants, "+vow+" vowels, "+pc+" punctuation charachters, and "+spaces+" spaces.");
	}
}