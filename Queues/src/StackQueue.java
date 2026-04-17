public class StackQueue {
    final private Stack queue, temp;
    public StackQueue(int size) { queue = new Stack(size); temp = new Stack(size); }
    public void enqueue(Object o) { queue.push(o); }
    public Object dequeue() {
        while (!queue.isEmpty())
            temp.push(queue.pop());
        Object front = temp.pop();
        while (!temp.isEmpty())
            queue.push(temp.pop());
        return front;
    }
    public Object peek() {
        while (!queue.isEmpty())
            temp.push(queue.pop());
        Object front = temp.peek();
        while (!temp.isEmpty())
            queue.push(temp.pop());
        return front;
    }
    public int size() { return queue.size(); }
    public boolean isEmpty() { return queue.isEmpty(); }
    public boolean isFull() { return queue.isFull(); }
}
