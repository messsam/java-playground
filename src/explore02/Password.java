package explore02;

public class Password {
    private String password;
    Password(String pass) { password = pass; }

    public void setPassword(String password) {
        this.password = password;
    }
    String encrypt() {
        StringBuilder s = new StringBuilder();
        for (int i = password.length()-1; i >= 0; i--) {
            if (password.toLowerCase().charAt(i) == 'a' || password.toLowerCase().charAt(i) == 'e'
            || password.toLowerCase().charAt(i) == 'i' || password.toLowerCase().charAt(i) == 'o'
            || password.toLowerCase().charAt(i) == 'u') s.append('*');
            else s.append(password.charAt(i)); }
        return s.toString();
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

    public static void main(String[] args) {
        Password p = new Password("helloWorld123#");
        System.out.print(p.encrypt());

    }
}
