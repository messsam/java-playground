package dsa.queues;

public class EmergencyRoom {
    PriorityQueue queue;
    int roomNumber;

    public EmergencyRoom(int roomNumber, int capacity) {
        this.roomNumber = roomNumber;
        queue = new PriorityQueue(capacity);
    }
    public void newPatient(String n, int p) {
        queue.insert(new Patient(n, p));
    }
    public Patient nextPatient() {
        return (Patient) queue.remove();
    }

    @Override
    public String toString() {
        return queue.toString();
    }
}