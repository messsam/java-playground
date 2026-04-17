package dsa.stacks;

public class intStack {
    private int[] stack;
    private int top = -1;
    intStack(int size) { stack = new int[size]; }
    void push(int x) { if (!isFull()) stack[++top] = x; }
    int pop() { return stack[top--]; }
    int peek() { return stack[top]; }
    int size() { return top+1; }
    boolean isEmpty() { return top == -1; }
    boolean isFull() { return top == stack.length-1; }
    public String toString() {
        if (isEmpty()) return "Stack is empty.";
        StringBuilder s = new StringBuilder();
        for (int i = top; i >= 0; i--)
            s.append(stack[i]).append("\n");
        return s.toString();
    }
    int getIndex(int x) {
        for (int i = 0; i < size(); i++)
            if (stack[top-i] == x) return i;
        return -1;
    }
    void reverse() {
        for (int i = 0; i < size()/2; i++) {
            int temp = stack[i];
            stack[i] = stack[size()-i-1];
            stack[size()-i-1] = temp;
        }
    }
}