package dsa.queues;

public class University implements Comparable {
    String name;
    int rank;
    
    public University(String name, int rank) {
        this.name = name;
        this.rank = rank;
    }

    @Override
    public String toString() { return "Name: "+name+", Rank: "+rank; }
    @Override
    public int compareTo(Object o) {
        University other = (University) o;
        return rank != other.rank? rank - other.rank: name.compareTo(other.name);
    }
}