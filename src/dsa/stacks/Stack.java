package dsa.stacks;

public class Stack implements StackInterface {
    final private Object[] stack;
    private int top = -1;
    public Stack(int size) { stack = new Object[size]; }

    @Override
    public void push(Object x) { if (!isFull()) stack[++top] = x; }
    @Override
    public Object pop() { return stack[top--]; }
    @Override
    public Object peek() { return stack[top]; }
    @Override
    public int size() { return top+1; }
    @Override
    public boolean isEmpty() { return top == -1; }
    @Override
    public boolean isFull() { return top == stack.length-1; }
    @Override
    public String toString() {
        if (isEmpty()) return "Stack is empty.";
        StringBuilder s = new StringBuilder();
        for (int i = top; i >= 0; i--)
            s.append(stack[i]).append("\n");
        return s.toString();
    }
    @Override
    public int getIndex(Object x) {
        for (int i = 0; i < size(); i++)
            if (stack[top-i] == x) return i;
        return -1;
    }
}