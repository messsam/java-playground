package explore01;

import java.util.*;

public class One {
	 public static void main (String args []) {

	 	Scanner sc = new Scanner(System.in); String out;
	 	System.out.print("Enter your birth month: "); int month = sc.nextInt();
	 	System.out.print("Enter your birth day: "); int day = sc.nextInt();

	 	if (month == 0 || day == 0 || day > 31)
	 		System.out.print("Error.");
	 	else {
	 		switch(month) {
	 			case 1: out = day<=19?"Capricorn.":"Aquarius."; System.out.print(out); break;
	 			case 2: out = day<=17?"Aquarius.":(day<=28?"Pisces.":"Error."); System.out.print(out); break;
	 			case 3: out = day<=19?"Pisces.":"Aries."; System.out.print(out); break;
	 			case 4: out = day<=19?"Aries.":(day<=30?"Taurus.":"Error."); System.out.print(out); break;
	 			case 5: out = day<=20?"Taurus.":"Gemini."; System.out.print(out); break;
	 			case 6: out = day<=20?"Gemini.":(day<=30?"Cancer.":"Error."); System.out.print(out); break;
	 			case 7: out = day<=22?"Cancer.":"Leo."; System.out.print(out); break;
	 			case 8: out = day<=22?"Leo.":"Virgo."; System.out.print(out); break;
	 			case 9: out = day<=22?"Virgo.":(day<=30?"Libra.":"Error."); System.out.print(out); break;
	 			case 10: out = day<=22?"Libra.":"Scorpio."; System.out.print(out); break;
	 			case 11: out = day<=21?"Scorpio.":(day<=30?"Sagittarius.":"Error."); System.out.print(out); break;
	 			case 12: out = day<=21?"Sagittarius.":"Capricorn."; System.out.print(out); break;
	 			default: System.out.print("Error.");
	 		}
	 	}
	}
}