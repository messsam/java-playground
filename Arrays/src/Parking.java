public class Parking {
    int[] slots;
    int count;
    public Parking(int total) { slots = new int[total]; }

    public String toString() {
        StringBuilder string = new StringBuilder("[");
        for (int i = 0; i < count; i++) {
            if (i == count-1) string.append(slots[i]).append("]");
            else string.append(slots[i]).append(", ");
        }
        return string.toString();
    }

    public void insert(int n) {
        if (count == slots.length) { System.out.println("Invalid."); return; }
        System.out.println("Successfully inserted "+n+" in index "+count+".");
        slots[count++] = n;
    }
    public void delete(int n) {
        for (int i = 0; i < count; i++)
            if (slots[i] == n) {
                while (i < count-1)
                    slots[i] = slots[++i];
                System.out.println("Successfully deleted "+n+".");
                count--; return;
            }
        System.out.print("Invalid.");
    }

    //Linear Search.
    public int Search(int n) {
        for (int i = 0; i < count; i++)
            if (slots[i] == n) return i;
        return -1;
    }

    public static void main(String[] args) {
        Parking park = new Parking(6);
        park.insert(2727); park.insert(23);
        park.insert(0); park.insert(44);
        System.out.println(park);
        park.delete(2727);
        System.out.println(park);
        System.out.println(park.slots[0]);
    }
}