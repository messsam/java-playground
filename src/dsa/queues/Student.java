public class Student implements Comparable {
    String name, major;
    int ID;

    public Student(String name, int ID, String major) {
        this.ID = ID;
        this.name = name;
        this.major = major;
    }
    @Override
    public String toString() {
        return "Name: "+name+", ID: "+ID+", Major: "+major;
    }
    @Override
    public int compareTo(Object o) {
        Student s = (Student) o;
        return this.ID - s.ID;
    }
}
