package dsa.linkedlists;

public class Queue {
    DoublyLinkedList queue;
    int nOfItems;
    public Queue() { queue = new DoublyLinkedList(); }

    public void enqueue(Comparable data) {
        nOfItems++;
        queue.insertLast(data);
    }
    public Comparable dequeue() {
        nOfItems--;
        return queue.removeFirst();
    }
    public Comparable peek() {
        Comparable data = queue.removeFirst();
        queue.insertFirst(data);
        return data;
    }
    @Override
    public String toString() { return queue.toString(); }
    public boolean isEmpty() { return queue.isEmpty(); }
    public int size() { return nOfItems; }
}
