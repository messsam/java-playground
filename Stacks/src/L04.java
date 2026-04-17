class L04 {
    static void main(String[] args) {
        /*Stack strs = new Stack(3);
        Stack nums = new Stack(3);
        strs.push("Slim"); strs.push("Abd"); strs.push("Hend");
        nums.push(2); nums.push(3); nums.push(1);
        IO.println(createDuplicates(strs, nums));
        IO.println(isPalindrome("  Hell Eh"));*/
        IO.print(multiply(5, 4));
    }
    static String revStr(String s) {
        StringBuilder sb = new StringBuilder();
        Stack st = new Stack(s.length());
        for (int i = 0; i < s.length(); i++)
            st.push(s.charAt(i));
        while (!st.isEmpty())
            sb.append(st.pop());
        return sb.toString();
    }
    static String infixToPostfix(String infix) {
        Stack st = new Stack(infix.length()/2);
        StringBuilder postfix = new StringBuilder();
        for (int i = 0; i < infix.length(); i++) {
            char current = infix.charAt(i);
            if (current >= '0' && current <= '9')
                postfix.append(current);
            else if (current == '*')
                if (st.isEmpty() || (Character) st.peek() == '*') {
                    while (!st.isEmpty() && (Character) st.peek() != '+')
                        postfix.append(st.pop());
                    st.push(current);
                } else st.push(current);
            else if (current == '+') {
                while (!st.isEmpty())
                    postfix.append(st.pop());
                st.push(current);
            } else st.push(current);
        }
        while (!st.isEmpty())
            postfix.append(st.pop());
        return postfix.toString();
    }
    public static Stack createDuplicates(Stack strings, Stack integers) {
        Stack temp = new Stack(integers.size());
        int len = 0;
        while (!integers.isEmpty()) {
            len += (int) integers.peek();
            temp.push(integers.pop());
        }
        while (!temp.isEmpty())
            integers.push(temp.pop());
        Stack ans = new Stack(len);
        while (!strings.isEmpty()) {
            for (int i = (int) integers.pop(); i > 0; i--)
                ans.push(strings.peek());
            strings.pop();
        }
        return ans;
    }
    public static boolean isPalindrome(String s) {
        String[] strings = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String str : strings)
            sb.append(str.toLowerCase());
        Stack st = new Stack(sb.length()/2);
        int i = 0;
        while (i < sb.length()/2)
            st.push(sb.charAt(i++));
        i += sb.length()%2;
        while (!st.isEmpty())
            if ((char) st.pop() != sb.charAt(i++)) return false;
        return true;
    }
    public static boolean isValidPrefix(String prefix) {
        Stack temp = new Stack(prefix.length()/2+1);
        for (int i = prefix.length()-1; i >= 0; i--) {
            char c = prefix.charAt(i);
            if (c >= '0' && c <= '9'){
                temp.push(c); break;
        }
            else if (c == '+' || c == '-' || c == '*' || c == '/') {
                if (temp.size() < 2) return false;
                else temp.pop();
            }
        }
        return temp.size() == 1;
    }
    public static int multiply(int x, int y) {
        int res = x;
        for (int i = 1; i < y; i++) res += x;
        return res;
    }
    public static int largest(int x, int y, int z) {
        int largest = x;
        if (x > y && x > z) return x;
        if (y > x && y > z) return y;
        if (y > largest) largest = y;
        if (z > x && z > y) return y;
        return z > largest? z: largest;
    }
}