package dsa.linkedlists;

public class DoublyLinkedList {
    Node head, tail;

    public boolean isEmpty() { return head == null; }
    public void insertFirst(Comparable data) {
        Node temp = new Node(data);
        if (isEmpty()) head = tail = temp;
        else {
            temp.next = head;
            head.previous = temp;
            head = temp;
        }
    }
    public void insertLast(Comparable data) {
        Node temp = new Node(data);
        if (isEmpty()) head = tail = temp;
        else {
            temp.previous = tail;
            tail.next = temp;
            tail = temp;
        }
    }
    public Comparable removeFirst() {
        if (isEmpty()) return null;
        Comparable data = head.data;
        if (head == tail) head = tail = null;
        else {
            head = head.next;
            head.previous = null;
        }
        return data;
    }
    public Comparable removeLast() {
        if (isEmpty()) return null;
        Comparable data = tail.data;
        if (head == tail) head = tail = null;
        else {
            tail = tail.previous;
            tail.next = null;
        }
        return data;
    }
    public boolean remove(Comparable key) {
        Node curr;
        for (curr = head; curr != null && curr.data.compareTo(key) != 0; curr = curr.next);
        if (curr == null) return false;
        if (curr == head && curr == tail) head = tail = null;
        else {
            if (curr == head) head = curr.next;
            if (curr == tail) tail = curr.previous;
            if (curr.previous != null) curr.previous.next = curr.next;
            if (curr.next != null) curr.next.previous = curr.previous;
        }
        return true;
    }
    public boolean occurs(Comparable key) {
        for (Node curr = head; curr != null; curr = curr.next)
            if (curr.data.compareTo(key) == 0) return true;
        return false;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("null <-> ");
        for (Node temp = head; temp != null; temp = temp.next)
            sb.append(temp.data.toString()).append(" <-> ");
        return sb.append("null").toString();
    }

    private static class Node {
        Comparable data;
        Node next, previous;

        @Override
        public String toString() { return data.toString(); }
        public Node(Comparable data) { this.data = data; }
        public Node() {}
    }



    // Additions. (PA)
    public boolean occursRec(Comparable key) {
        return occursHelper(head, key);
    }
    public boolean occursHelper(Node curr, Comparable key) {
        if (curr.data.compareTo(key) == 0) return true;
        if (curr.next == null) return false;
        return occursHelper(curr.next, key);
    }
    public boolean insertAfter(Comparable data, Comparable key){
        Node node = new Node(data), curr;
        for (curr = head; curr != null && curr.data.compareTo(key) != 0; curr = curr.next);
        if (curr == null) return false;
        node.next = curr.next;
        if (curr.next != null) curr.next.previous = node;
        else tail = node;
        curr.next = node;
        node.previous = curr;
        return true;
    }
    public boolean insertBefore(Comparable data, Comparable key) {
        Node node = new Node(data), curr;
        for (curr = head; curr != null && curr.data.compareTo(key) != 0; curr = curr.next);
        if (curr == null) return false;
        node.previous = curr.previous;
        if (curr.previous != null) curr.previous.next = node;
        else head = node;
        curr.previous = node;
        node.next = curr;
        return true;
    }
    public void insertSorted(Comparable data) {
        if (isEmpty()) { insertFirst(data); return; }
        Node curr;
        for (curr = head; curr != null && curr.data.compareTo(data) < 0; curr = curr.next);
        if (curr == null) insertLast(data);
        else if (curr.previous == null) insertFirst(data);
        else {
            Node node = new Node(data);
            node.previous = curr.previous;
            curr.previous.next = node;
            curr.previous = node;
            node.next = curr;
        }
    }
    public void insertionSort() {
        DoublyLinkedList temp = new DoublyLinkedList();
        while (!isEmpty())
            temp.insertSorted(removeFirst());
        head = temp.head;
        tail = temp.tail;
    }
    public void reverse() {
        head = tail;
        while (head.previous != null) {
            Node newTail = head.previous;
            head.previous = newTail.previous;
            if (newTail.previous != null)
                newTail.previous.next = head;
            newTail.next = null;
            newTail.previous = tail;
            tail.next = newTail;
            tail = newTail;
        }
    }
    public void reverse2() {
        Node curr = tail;
        while (curr != null) {
            if (curr.next == null) head = curr;
            if (curr.previous == null) tail = curr;
            Node temp = curr.previous;
            curr.previous = curr.next;
            curr.next = temp;
            curr = curr.next;
        }
    }
    public void reverseRec() {
        reverseHelper(tail);
    }
    public void reverseHelper(Node curr) {
        if (curr == null) return;
        if (curr.next == null) head = curr;
        if (curr.previous == null) tail = curr;
        Node temp = curr.previous;
        curr.previous = curr.next;
        curr.next = temp;
        reverseHelper(curr.next);
    }
    public int count() {
        int count = 0;
        for (Node curr = head; curr != null; curr = curr.next)
            count++;
        return count;
    }
    public int countRec() {
        return countHelper(head);
    }
    public int countHelper(Node curr) {
        if (curr == null) return 0;
        return 1 + countHelper(curr.next);
    }
    public void pairs(int x) {
        Node first = head, last = tail;
        while (first != last && last.next != first) {
            if ((int) first.data + (int) last.data == x) {
                System.out.println("("+first.data+", "+last.data+")");
                first = first.next;
                last = last.previous;
            }
            else if ((int) first.data + (int) last.data > x)
                last = last.previous;
            else first = first.next;
        }
    }
}