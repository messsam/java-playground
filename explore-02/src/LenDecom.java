public class LenDecom {
    public static void main(String[] args) {
        StringBuilder sentence = new StringBuilder();
        for (String s : args) { sentence.append(s); }
        System.out.print(decompress(sentence.toString().toLowerCase()));
    }
    public static String decompress(String s) {
        StringBuilder newS = new StringBuilder();
        for (int i = 0; i < s.length(); i++)
            if (!exists(newS.toString(), s.charAt(i))) {
                int count = 0;
                for (int j = 0; j < s.length(); j++)
                    if (s.charAt(i) == s.charAt(j))
                        count++;
                newS.append(count).append(s.charAt(i)).append(" ");
            }
        return newS.toString();
    }
    public static boolean exists(String s, char c) {
        if (s.isEmpty()) return false;
        if (s.charAt(0) == c) return true;
        return exists(s.substring(1), c);
    }
}   