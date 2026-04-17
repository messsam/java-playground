package dsa.queues;

public class Patient implements Comparable {
    String name;
    int severity;

    public Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }

    @Override
    public String toString() {
        return "Name: "+name+", Degree of severity: "+severity;
    }
    @Override
    public int compareTo(Object o) {
        Patient other = (Patient) o;
        return this.severity - other.severity;
    }
}