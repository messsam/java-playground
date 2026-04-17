public class Password {
    String password;
    Password(String pass) { password = pass; }
    String encrypt() {
        StringBuilder s = new StringBuilder();
        for (int i = password.length()-1; i >= 0; i--) {
            if (password.toLowerCase().charAt(i) == 'a' || password.toLowerCase().charAt(i) == 'e'
            || password.toLowerCase().charAt(i) == 'i' || password.toLowerCase().charAt(i) == 'o'
            || password.toLowerCase().charAt(i) == 'u') s.append('*');
            else s.append(password.charAt(i)); }
        return s.toString();
    }

    public static void main(String[] args) {
        Password p = new Password("helloWorld123#");
        System.out.print(p.encrypt());

    }
}
