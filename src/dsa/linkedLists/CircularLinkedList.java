package dsa.linkedLists;

public class CircularLinkedList {
    Node head, tail;

    public void insertFirst(Comparable data) {
        Node node = new Node(data);
        if (!isEmpty()) {
            node.next = head;
            head.previous = node;
            head = node;
            head.previous = tail;
            tail.next = head;
        }
        else head = tail = node;
    }
    public void insertLast(Comparable data) {
        Node node = new Node(data);
        if (!isEmpty()) {
            node.previous = tail;
            tail.next = node;
            tail = node;
            tail.next = head;
            head.previous = tail;
        }
        else head = tail = node;
    }
    public Comparable removeFirst() {
        if (isEmpty()) return null;
        Comparable data = head.data;
        head = head.next;
        return data;
    }
    public Comparable removeLast() {
        if (isEmpty()) return null;
        Comparable data = tail.data;
        tail = tail.previous;
        return data;
    }
    public boolean isEmpty() {
        return head == null;
    }
    @Override
    public String toString() {
        if (isEmpty()) return null;
        StringBuilder string = new StringBuilder();
        for (Node curr = head; curr != tail; curr = curr.next)
            string.append(curr.data.toString()).append(" <-> ");
        return string.append(tail.data.toString()).append("-> Head").toString();
    }
    @Override
    public boolean equals(Object object) {
        CircularLinkedList other = (CircularLinkedList) object;
        return toString().equals(other.toString());
    }

    private class Node {
        Comparable data;
        Node next, previous;
        Node(Comparable data) { this.data = data; }
    }
}
