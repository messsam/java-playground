public class PalNum implements Comparable {
    String num;
    public PalNum(int num) { this.num = ""+num; }

    public boolean isPal() {
        for (int i = 0, j = num.length()-1; i < j; i++, j--)
            if (num.charAt(i) != num.charAt(j)) return false;
        return true;
    }

    @Override
    public String toString() { return num; }
    @Override
    public int compareTo(Object o) {
        PalNum other = (PalNum) o;
        if (isPal() && !other.isPal()) return -1;
        if (!isPal() && other.isPal()) return 1;
        return Integer.parseInt(num) - Integer.parseInt(other.num);
    }

    static void main() {
        PriorityQueue pq = new PriorityQueue(4);
        pq.insert(new PalNum(234)); pq.insert(new PalNum(47674));
        pq.insert(new PalNum(34)); pq.insert(new PalNum(33));
        System.out.println(pq);
    }
}