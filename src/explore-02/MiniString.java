public class MiniString {
    char[] miniString;

    public MiniString() { miniString = new char[0]; }
    public MiniString(char[] c) {
        miniString = new char[c.length];
        for (int i = 0; i < c.length; i++)
            miniString[i] = c[i];
    }
    public int length() { return miniString.length; }
    public char charAt(int x) { return miniString[x]; }
    public void display() {
        for (char c : miniString)
            System.out.print(c);
    }
    public static void main(String[] args) {
        MiniString a = new MiniString(new char[] {'m','o','h','a','n','d'});
        MiniString b = new MiniString(new char[] {'e','s','s','a','m'});
        MiniString c = new MiniString();
        a.display(); System.out.print(" "); b.display(); System.out.println();
        System.out.println(a.length());
        System.out.println(b.charAt(3));
        System.out.print("C: "); c.display();

    }
}