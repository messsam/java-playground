package explore01;

public class Arrange {
	public static String ranOrder(int x) {
		String order = "";
		for (int i = 1; i <= x; i++) {
			String n = ""; n += (int) (Math.random()*x);
			while (order.contains(n)) {
				n = ""; n += (int) (Math.random()*x); }
			order += n; }
		return order;
	}
	public static String shuffle(String s) {
		String n = ""; String order = ranOrder(s.length());
		for (int i = 0; i < s.length(); i ++)
			n += s.charAt(order.charAt(i) - '0');
		return n;
	}
}