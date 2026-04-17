public class DecToBin {
    public static void main(String[] args) {
        System.out.print(binary(Integer.parseInt(args[0])));
    }
    public static String binary(int x) {
        StringBuilder bi = new StringBuilder();
        for (; x > 0; x /= 2) { bi.insert(0, x%2); }
        return bi.toString();
    }
}