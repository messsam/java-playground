package dsa.stacks;

public interface StackInterface {
    public void push(Object x);
    public Object pop();
    public Object peek();
    public int size();
    public boolean isEmpty();
    public boolean isFull();
    public int getIndex(Object x);
}
