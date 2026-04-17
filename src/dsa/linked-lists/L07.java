public class L07 {
     static void main() {
         LinkedList ll = new LinkedList();
         ll.insertLast(1); ll.insertLast(2);
         ll.insertLast(3); ll.insertLast(3);
         IO.println(ll);
         alternatingSplit(ll);
     }
     public static LinkedList mixedElements(LinkedList ll) {
         LinkedList res = new LinkedList();
         while (!ll.isEmpty()) {
             res.insertLast(ll.removeFirst());
             if (!ll.isEmpty()) res.insertLast(ll.removeLast());
         }
         return res;
     }
     public static void addOnes(LinkedList ll) {
         for (int i = ll.size(); i > 0; i--)
             ll.insertLast((int) ll.removeFirst()+1);
     }
     public static LinkedList cut(LinkedList ll) {
         LinkedList cut = new LinkedList(), temp = new  LinkedList();
         while (!ll.isEmpty()) {
             cut.insertLast(ll.removeFirst());
             if (!ll.isEmpty()) temp.insertFirst(ll.removeLast());
         }
         while (!temp.isEmpty())
             cut.insertFirst(temp.removeLast());
         return cut;
     }
     public static DoublyLinkedList insertionSort(DoublyLinkedList dll) {
         DoublyLinkedList sorted = new DoublyLinkedList();
         while (!dll.isEmpty()) {
             Comparable first = dll.removeFirst();
             int count = 0;
             while (!sorted.isEmpty()) {
                 Comparable temp = sorted.removeFirst();
                 if (temp.compareTo(first) >= 0) {
                     sorted.insertFirst(temp);
                     break;
                 }
                 dll.insertLast(temp);
                 count++;
             }
             sorted.insertFirst(first);
             while (count > 0) {
                 sorted.insertFirst(dll.removeLast());
                 count--;
             }
         }
         return sorted;
     }
     public static int count(DoublyLinkedList dll) {
         DoublyLinkedList temp = new DoublyLinkedList();
         int count;
         for (count = 0; !dll.isEmpty(); count++)
             temp.insertLast(dll.removeFirst());
         while (!temp.isEmpty())
             dll.insertLast(temp.removeFirst());
         return count;
     }
     public static void insertLast(LinkedList ll, Comparable data) {
         LinkedList temp = new LinkedList();
         while (!ll.isEmpty())
             temp.insertFirst(ll.removeFirst());
         ll.insertFirst(data);
         while (!temp.isEmpty())
             ll.insertFirst(temp.removeFirst());
     }
     public static Comparable removeLast(LinkedList ll) {
         LinkedList temp = new LinkedList();
         while (!ll.isEmpty())
             temp.insertFirst(ll.removeFirst());
         Comparable res = temp.removeFirst();
         while (!temp.isEmpty())
             ll.insertFirst(temp.removeFirst());
         return res;
     }
     public static LinkedList reverse(LinkedList ll) {
         LinkedList rev = new LinkedList(), temp = new LinkedList();
         while(!ll.isEmpty()) rev.insertFirst(ll.removeFirst());
         return rev;
     }
     public static void reverseTwo(LinkedList ll) {
         LinkedList rev = new LinkedList();
         while (!ll.isEmpty()) rev.insertFirst(ll.removeFirst());
         while (!rev.isEmpty()) ll.insertLast(rev.removeFirst());
     }
     public static void removeDuplicates(LinkedList ll) {
         LinkedList temp = new LinkedList();
         temp.insertFirst(ll.removeFirst());
         while (!ll.isEmpty()) {
             int first = (int) ll.removeFirst();
             int last = (int) temp.removeLast();
             if (first != last) {
                 temp.insertLast(last);
                 temp.insertLast(first);
             }
             else temp.insertLast(last);
         }
         while(!temp.isEmpty())
             ll.insertLast(temp.removeFirst());
     }
     public static void split(LinkedList ll) {
         LinkedList subListOne = new LinkedList();
         LinkedList subListTwo = new LinkedList();
         while (!ll.isEmpty()) {
             subListOne.insertLast(ll.removeFirst());
             if (!ll.isEmpty())
                 subListTwo.insertFirst(ll.removeLast());
         }
         System.out.print("First sublist: "+subListOne+", Second sub list: "+subListTwo);
     }
    public static void alternatingSplit(LinkedList ll) {
        LinkedList subListOne = new LinkedList();
        LinkedList subListTwo = new LinkedList();
        while (!ll.isEmpty()) {
            subListOne.insertLast(ll.removeFirst());
            if (!ll.isEmpty())
                subListTwo.insertLast(ll.removeFirst());
        }
        System.out.print("First sublist: "+subListOne+", Second sub list: "+subListTwo);
    }
}