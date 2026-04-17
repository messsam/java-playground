package dsa.stacks;

public class L03 {
    static void main(String[] args) {
        display(NSE(new int[] {13, 7, 6, 12}));
    }

    static boolean bracket(String s) {
        intStack stack = new intStack(s.length());
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{')
                stack.push(s.charAt(i));
            else if (s.charAt(i) == ')' || s.charAt(i) == ']' || s.charAt(i) == '}') {
                if (stack.isEmpty()) return false;
                if (stack.peek() == '(' && s.charAt(i) != ')'
                        || stack.peek() == '[' && s.charAt(i) != ']'
                        || stack.peek() == '{' && s.charAt(i) != '}') return false;
                stack.pop();
            }
        }
        return stack.isEmpty();
    }

    static String reverse(String s) {
        intStack stack = new intStack(s.length());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++)
            stack.push(s.charAt(i));
        while (!stack.isEmpty())
            sb.append((char) stack.pop());
        return sb.toString();
    }
    static void reverse (intStack st){
        intStack one = new intStack(st.size());
        intStack two = new intStack(st.size());
        while (!st.isEmpty())
            one.push(st.pop());
        while (!one.isEmpty())
            two.push(one.pop());
        while (!two.isEmpty())
            st.push(two.pop());
    }
    static int getIndex(int x, intStack st) {
        intStack temp = new intStack(st.size());
        int index = -1;
        for (int i = 0; !st.isEmpty(); i++) {
            if (st.peek() == x) { index = i; break; }
            temp.push(st.pop());
        }
        while (!temp.isEmpty())
            st.push(temp.pop());
        return index;
    }
    static int postfixEval(String s) {
        intStack temp = new intStack(s.length()/2+1);
        for (int i = 0; i < s.length(); i += 2) {
            char character = s.charAt(i);
            if (character >= '0' && character <= '9')
                temp.push(character-'0');
            else {
                int second = temp.pop(), first = temp.pop();
                switch(character) {
                    case '+': temp.push(first+second); break;
                    case '-': temp.push(first-second); break;
                    case '*': temp.push(first*second); break;
                    case '/': temp.push(first/second); break;
                }
            }
        }
        return temp.pop();
    }
    public static intStack decomp(intStack x) {
        intStack y = new intStack(x.size());
        intStack temp_x = new intStack(x.size());
        intStack temp_y = new intStack(x.size());
        while (!x.isEmpty())
            if (x.size()%2 == 0) temp_x.push(x.pop());
            else temp_y.push(x.pop());
        while (!temp_x.isEmpty())
            x.push(temp_x.pop());
        while (!temp_y.isEmpty())
            y.push(temp_y.pop());
        return y;
    }
    static boolean check(intStack st) {
        int firstH = 0, secondH = 0, size = st.size();
        intStack temp = new intStack(size);
        for (int i = 0; !st.isEmpty(); i++) {
            temp.push(st.peek());
            if (i < size/2) firstH += st.pop();
            else if (i == size/2 && size%2 == 1) st.pop();
            else secondH += st.pop();
        }
        while (!temp.isEmpty())
            st.push(temp.pop());
        return firstH == secondH;
    }
    static boolean check2(intStack st) {
        intStack temp = new intStack(st.size());
        int size = st.size(), sum = 0;
        for (int i = 0; !st.isEmpty(); i++) {
            temp.push(st.peek());
            if (i < size/2) sum += st.pop();
            else if (i == size/2 && size%2 == 1) st.pop();
            else sum -= st.pop();
        }
        while (!temp.isEmpty())
            st.push(temp.pop());
        return sum == 0;
    }
    static void remove(intStack st, int i) {
        intStack temp = new intStack(st.size());
        while (st.size() > i)
            temp.push(st.pop());
        st.pop();
        while (!temp.isEmpty())
            st.push(temp.pop());
    }
    static void sortSt(intStack st) {
        intStack temp = new intStack(st.size());
        for (int i = 0; !st.isEmpty(); i++) {
            int min = Integer.MAX_VALUE;
            while (!st.isEmpty()) {
                if (min > st.peek()) min = st.peek();
                temp.push(st.pop());
            }
            boolean removed = false;
            while (temp.size() != i) {
                if (temp.peek() == min && !removed) { temp.pop(); removed = true; }
                else st.push(temp.pop());
            }
            temp.push(min);
        }
        while (!temp.isEmpty())
            st.push(temp.pop());
    }
    static intStack reverse1(intStack st) {
        intStack reverse = new intStack(st.size());
        while (!st.isEmpty())
            reverse.push(st.pop());
        return reverse;
    }
    static intStack reverse2(intStack st) {
        intStack reverseOne = new intStack(st.size());
        intStack reverseTwo = new intStack(st.size());
        while (!st.isEmpty()) {
            reverseOne.push(st.pop());
            reverseTwo.push(st.pop());
        }
        while (!reverseTwo.isEmpty())
            st.push(reverseTwo.pop());
        return reverseOne;
    }
    static void reverse3(intStack st) {
        reverse(st);
    }
    static intStack mirror(intStack st) {
        intStack mirror = new intStack(st.size()*2);
        intStack temp = new intStack(st.size());
        intStack tempOne = new intStack(st.size());
        intStack tempTwo = new intStack(st.size());
        while (!st.isEmpty()) {
            tempOne.push(st.peek()); temp.push(st.pop());
        }
        while (!temp.isEmpty())
            tempTwo.push(temp.pop());
        while (!tempOne.isEmpty())
            mirror.push(tempOne.pop());
        while (!tempTwo.isEmpty())
            mirror.push(tempTwo.pop());
        return mirror;
    }
    static int[] NSE(int[] arr) {
        int[] NSE = new int[arr.length];
        for (int i = 0; i < arr.length-1; i++)
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]) { NSE[i] = arr[j]; break; }
                NSE[i] = -1;
            }
        NSE[arr.length-1] = -1;
        return NSE;
    }
    static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            if (i == arr.length-1) IO.println(arr[i]);
            else IO.print(arr[i] + ", ");
    }
}
