public class Password {
	public static void main(String[] args) {
		String pass = "MohandHello123";
		System.out.print(encrypt(pass));
	}
	public static String encrypt(String x) {
		String encryption = "";
		for (int i = x.length()-1; i >= 0; i--) {
			if (x.toLowerCase().charAt(i) == 'a' || x.toLowerCase().charAt(i) == 'e'
				|| x.toLowerCase().charAt(i) == 'o' || x.toLowerCase().charAt(i) == 'u'
					|| x.toLowerCase().charAt(i) == 'i')
						encryption += '*';
			else encryption += x.charAt(i); }
		return encryption;
	}
}