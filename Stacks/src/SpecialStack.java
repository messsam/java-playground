public class SpecialStack {
    private intStack stack;
    private intStack min;
    public SpecialStack(int size) {
        stack = new intStack(size);
        min = new intStack(size);
    }
    public void push(int x) {
        stack.push(x);
        min.push(min.isEmpty()? x: (min.peek() > x? x: min.peek()));
    }
    public int pop() {
        min.pop();
        return stack.pop();
    }
    public int size() { return stack.size(); }
    public int peek() { return stack.peek(); }
    public int getMin() { return min.peek(); }
    public boolean isEmpty() { return stack.isEmpty(); }
    public boolean isFull() { return stack.isFull(); }
    public void printStacks() {
        System.out.println(stack);
        System.out.println(min);
    }

    public static void main(String[] args) {
        SpecialStack s = new SpecialStack(10);
        s.push(20);
        s.printStacks();
        s.push(15);
        s.printStacks();
        s.push(17);
        s.printStacks();
        s.push(10);
        s.printStacks();
        s.push(3);
        s.printStacks();
        s.push(5);
        s.printStacks();
        System.out.println(s.getMin());
        IO.println(s.pop());
        IO.println(s.pop() + "\n");
        s.printStacks();
        System.out.println(s.getMin());
        IO.println(s.pop() + "\n");
        s.printStacks();
        System.out.println(s.getMin());
    }
}