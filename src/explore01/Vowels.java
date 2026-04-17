import java.util.Scanner;

public class Vowels {
	public static void main (String args []) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a sentence: "); String sen = sc.nextLine();
		System.out.println();
		int con = 0; int vow = 0; int spaces = 0; int pc = 0;

		for (int i = 0; i < sen.length(); i++) {
			if (sen.charAt(i)=='a' || sen.charAt(i)=='A' || sen.charAt(i)=='e' ||
				sen.charAt(i)=='E' || sen.charAt(i)=='u' || sen.charAt(i)=='U' ||
				sen.charAt(i)=='i' || sen.charAt(i)=='I' || sen.charAt(i)=='o' ||
				sen.charAt(i)=='O') vow++;
			else if (sen.charAt(i)=='!' || sen.charAt(i)=='@' || sen.charAt(i)=='#' ||
				sen.charAt(i)=='$' || sen.charAt(i)=='%' || sen.charAt(i)=='&' ||
				sen.charAt(i)==',' || sen.charAt(i)=='.' || sen.charAt(i)=='?' ||
				sen.charAt(i)=='-' || sen.charAt(i)=='_' || sen.charAt(i)==':' ||
				sen.charAt(i)==';' || sen.charAt(i)=='^' || sen.charAt(i)=='`' ||
				sen.charAt(i)=='~' || sen.charAt(i)=='*' || sen.charAt(i)=='(' ||
				sen.charAt(i)==')' || sen.charAt(i)=='[' || sen.charAt(i)=='"' ||
				sen.charAt(i)==']' || sen.charAt(i)=='{' || sen.charAt(i)=='}') pc++;
			else if (sen.charAt(i)==' ') spaces++;
			else con++;
		}

		System. out.print("The sentence contains "+con+" consonants, "+vow+" vowels, "+pc+" punctuation charachters, and "+spaces+" spaces.");
	}
}