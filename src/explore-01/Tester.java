public class Tester {
	public static void main(String[] args) {
		char c = args[0].charAt(0);
		String[] s = new String[args.length-1];
		for(int i = 0; i < s.length; i++)
			s[i] = args[i+1];
		System.out.print(occurs(c, s));
	}
	public static boolean occurs(char c, String[] arr) {
		for(int i = 0; i < arr.length; i++)
			if(!occurs(c, arr[i])) return false;
		return true;
	}
	public static boolean occurs(char c, String s) {
		for(int i = 0; i < s.length(); i++)
			if(s.charAt(i) == c) return true;
		return false;
	}
}