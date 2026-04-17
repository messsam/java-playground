package dsa.linkedlists;

public class LinkedList {
    private Node head;

    public boolean isEmpty() { return head == null; }
    public void insertFirst(Comparable obj) {
        Node temp = new Node(obj);
        temp.next = head;
        head = temp;
    }
    public void insertLast(Comparable obj) {
        if (head == null) {
            insertFirst(obj);
            return;
        }
        Node temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = new Node(obj);
    }
    public Comparable removeFirst() {
        if (head == null) return null;
        Node temp = head;
        head = head.next;
        temp.next = null;
        return temp.data;
    }
    public Comparable removeLast() {
        Node temp = head;
        if (temp == null) return null;
        if (temp.next == null) head = null;
        else {
            while (temp.next.next != null)
                temp = temp.next;
            Node temporary = temp.next;
            temp.next = null;
            temp = temporary;
        }
        return temp.data;
    }
    public Comparable remove(Comparable obj) {
        if (head == null) return null;
        if (head.data.compareTo(obj) == 0) {
            Comparable res = head.data;
            head = head.next;
            return res;
        }
        Node temp = head;
        while (temp.next != null) {
            if (temp.next.data.compareTo(obj) == 0) {
                Comparable res = temp.next.data;
                temp.next = temp.next.next;
                return res;
            }
            temp = temp.next;
        }
        return null;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Node temp = head; temp != null; temp = temp.next)
            sb.append(temp.data.toString()).append(" -> ");
        return sb.append("null").toString();
    }

    private static class Node {
        Comparable data;
        Node next; // Self-referential class. (Class recursion)

        @Override
        public String toString() { return data.toString(); }
        public Node(Comparable data) { this.data = data; }
        public Node() {}
    }

    // Additions. (PA)
    public int size() {
        int size = 0;
        for (Node temp = head; temp != null; temp = temp.next)
            size++;
        return size;
    }
    private Node removeLastElement() {
        Node temp = head, last;
        if (temp == null || temp.next == null) return temp;
        while (temp.next.next != null)
            temp = temp.next;
        last = temp.next;
        temp.next = null;
        return last;
    }
    public void print() { printHelper(head); }
    private void printHelper(Node temp) {
        if (temp == null) { System.out.print("null"); return; }
        System.out.print(temp + " -> ");
        printHelper(temp.next);
    }
    public void mixedElements() {
        if (head == null || head.next == null) return;
        Node curr = head;
        int size = size();
        for (int i = 0; i < size/2 && curr.next.next != null; i++) {
            Node temp = curr.next;
            curr.next = removeLastElement();
            curr.next.next = temp;
            curr = temp;
        }
    }
    public void reverse() {
        for (Node curr = head, next = null, temp; curr != null; curr = temp) {
            if (curr.next == null) head = curr;
            temp = curr.next;
            curr.next = next;
            next = curr;
        }
    }
    public void removeSequence(int m, int n) {
        if (isEmpty() || size() <= m) return;
        Node curr = new Node(0), temp;
        for (curr.next = head; curr.next != null; curr.next = temp.next) {
            for (int count = m; curr.next != null && count > 0; count--)
                curr = curr.next;
            temp = curr;
            for (int count = n; temp.next != null && count > 0; count--)
                temp = temp.next;
        }
    }
    public void removeDuplicates() {
        for (Node curr = head; curr != null; curr = curr.next)
            while (curr.next != null && curr.data.compareTo(curr.next.data) == 0)
                curr.next = curr.next.next;
    }
    public void addOnes() {
        for (Node curr = head; curr != null; curr = curr.next)
            curr.data = (int) curr.data +1;
    }
    public void addOnesRec() {
        addHelper(head);
    }
    public void addHelper(Node curr) {
        if (curr == null) return;
        curr.data = (int) curr.data +1;
        addHelper(curr.next);
    }
    public void cut() {
        int size = size();
        for (int i = 0; i < size/2 + size%2; i++) {
            Node last;
            for (last = head; last.next != null; last = last.next);
            last.next = head;
            Node temp = head.next;
            head.next = null;
            head = temp;
        }
    }
    public void insertLastRec(Comparable data) {
        if (head == null) head = new Node(data);
        else insertHelper(head, data);
    }
    public void insertHelper(Node curr, Comparable data) {
        if (curr.next == null) curr.next = new Node(data);
        else insertHelper(curr.next, data);
    }
    public static LinkedList nodeToList(Node num) {
        LinkedList list = new LinkedList();
        while ((int) num.data != 0) {
            list.insertFirst(((int) num.data) % 10);
            num.data = ((int) num.data) / 10;
        }
        return list;
    }
    public static void main(String[] args) {
        IO.print(nodeToList(new Node(3456)));
    }
    public static void merge(LinkedList ll) {
        Node zeroOne = ll.head, zeroTwo;
        for (zeroTwo = ll.head.next; zeroTwo != null; zeroTwo = zeroTwo.next) {
            if ((int) zeroTwo.data == 0) {
                int sum = 0;
                for (Node temp = zeroOne.next; temp != zeroTwo; temp = temp.next)
                    sum += (int) temp.data;
                zeroOne.data = sum;
                zeroOne.next = zeroTwo;
                zeroOne = zeroTwo;
            }
        }
    }
}
