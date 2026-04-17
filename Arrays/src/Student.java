public class Student {
    String name; int ID; double GPA;

    public Student() { name = "Default"; ID = 0; GPA = 0; }
    public Student(String username, int ID, double GPA) { this.name = username; this.ID = ID; this.GPA = GPA; }
    public String toString() { return "Name: "+ name +", ID: "+ID+", GPA: "+GPA; }
}