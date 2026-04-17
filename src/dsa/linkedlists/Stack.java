package dsa.linkedlists;

public class Stack {
    LinkedList stack;
    int nOfItems;
    public Stack() { stack = new LinkedList(); }

    public void push(Comparable o) {
        nOfItems++;
        stack.insertFirst(o);
    }
    public Comparable pop() {
        nOfItems--;
        return stack.removeFirst();
    }
    public Comparable peek() {
        Comparable top = stack.removeFirst();
        stack.insertFirst(top);
        return top;
    }
    public int size() {
        return nOfItems;
    }
    public boolean isEmpty() {
        return stack.isEmpty();
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Stack temp = new Stack();
        int max = nOfItems;
        while (!isEmpty()) {
            if (nOfItems != max) sb.insert(0, ", ").insert(0, peek());
            else sb.insert(0, peek());
            temp.push(pop());
        }
        while (!temp.isEmpty())
            push(temp.pop());
        return sb.toString();
    }
}
