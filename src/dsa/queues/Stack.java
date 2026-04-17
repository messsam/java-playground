public class Stack {
    final private Object[] stack;
    private int top = -1;
    public Stack(int size) { stack = new Object[size]; }

    public void push(Object x) { if (!isFull()) stack[++top] = x; }
    public Object pop() { return stack[top--]; }
    public Object peek() { return stack[top]; }
    public int size() { return top+1; }
    public boolean isEmpty() { return top == -1; }
    public boolean isFull() { return top == stack.length-1; }
    public String toString() {
        if (isEmpty()) return "Stack is empty.";
        StringBuilder s = new StringBuilder();
        for (int i = top; i >= 0; i--)
            s.append(stack[i]).append("\n");
        return s.toString();
    }
    public int getIndex(Object x) {
        for (int i = 0; i < size(); i++)
            if (stack[top-i] == x) return i;
        return -1;
    }
}