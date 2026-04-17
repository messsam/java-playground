package dsa.arrays;

public class Student {
    String name, firstName, lastName;
    Subject[] subjects;
    int ID, section;
    double GPA;

    public Student() { name = firstName = lastName = "Unknown"; }
    public Student(String firstName, String lastName, int ID, double GPA) {
        this(firstName, lastName, ID, new Subject[0], 2, GPA);
    }
    public Student(String firstName, String lastName, int ID, Subject[] subjects, int section, double GPA) {
        this.name = firstName + " " + lastName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.section = section;
        this.ID = ID;
        this.GPA = GPA;
        setSubjects(subjects);
    }
    public void setSubjects(Subject[] subjects) {
        this.subjects = new Subject[subjects.length];
        for (int i = 0; i < subjects.length; i++)
            this.subjects[i] = new Subject(subjects[i].name, subjects[i].score, subjects[i].creditHours);
    }
    public void setScore(String s, double score) {
        for (Subject i : subjects)
            if (i.name.equals(s)) {
                i.score = score; break;
            }
    }
    public double getScore(String s) {
        for (Subject i : subjects)
            if (i.name.equals(s))
                return i.score;
        return -1;
    }
    public double highestScore() {
        double highest = subjects[0].score;
        for (Subject i : subjects)
            if (i.score > highest)
                highest = i.score;
        return highest;
    }
    public String highestSubject() {
        String highest = ""; double highestScore = highestScore();
        for (Subject i : subjects)
            if (i.score == highestScore) {
                highest = i.name; break;
            }
        return highest;
    }
    public double lowestScore() {
        double lowest = subjects[0].score;
        for (Subject i : subjects)
            if (i.score < lowest)
                lowest = i.score;
        return lowest;
    }
    public String lowestSubject() {
        String lowest = ""; double lowestScore = lowestScore();
        for (Subject i : subjects)
            if (i.score == lowestScore) {
                lowest = i.name; break;
            }
        return lowest;
    }
    public double GPA() {
        double sum = 0;
        for (Subject i : subjects)
            sum += i.score;
        return sum/subjects.length;
    }
    @Override public String toString() {
        StringBuilder s = new StringBuilder();
        for (Subject i : subjects)
            s.append(i.name).append(", ");
        return "First Name: "+firstName+", Last Name: "+lastName+
                "\nSection: "+section+"\nEnrolled Subjects: "+s;
    }
        public static void main(String[] args) {
            Subject[] subjects = new Subject[] {
                    new Subject("CSEN202", 101.3, 6),
                    new Subject("MATH204", 89.8, 2),
                    new Subject("CTRL201", 105, 2),
                    new Subject("BINF101", 98.666, 2),
                    new Subject("LAW104", 100.2, 2)
            };
            Student Mohand = new Student("Mohand", "Essam", 64-29300, subjects, 23, 1.1);
            System.out.println(Mohand.highestScore() + ", " + Mohand.highestSubject());
            System.out.println(Mohand.lowestScore() + ", " + Mohand.lowestSubject());
            System.out.println(Mohand.getScore("CSEN202"));
            Mohand.setScore("MATH204", 91.9);
            System.out.println(Mohand.getScore("MATH204"));
            System.out.println(Mohand.GPA());
            System.out.print(Mohand);
        }
}