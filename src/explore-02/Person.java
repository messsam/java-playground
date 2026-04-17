public class Person {
    String name, dateOfBirth;
    int age, birthYear, birthMonth, birthDay;

    Person() { name = "Unknown."; }
    Person(String s) {
        if (Character.isDigit(s.charAt(0))) {
            dateOfBirth = s; birthDay = day(s);
            birthMonth = month(s); birthYear = year(s);
        }
        else name = s;
    }
    Person(String name, int age, String dateOfBirth) {
        this.name = name; this.age = age; this.dateOfBirth = dateOfBirth;
        birthDay = day(dateOfBirth); birthMonth = month(dateOfBirth);
        birthYear = year(dateOfBirth);
    }

    public void increaseAge() { age++; }
    public String toString() {
        return "Name: "+name+", Age: "+age+", Date of Birth: "+dateOfBirth;
    }

    public static int day(String DOB) {
        StringBuilder day = new StringBuilder();
        for (int i = 0; DOB.charAt(i) != '/'; i++)
            day.append(DOB.charAt(i));
        return Integer.parseInt(day.toString());
    }
    public static int month(String DOB) {
        StringBuilder month = new StringBuilder(); int x = 0;
        for (int i = 0; x < 2; i++) {
            if (DOB.charAt(i) == '/') x++;
            if (x == 1 && DOB.charAt(i) != '/') month.append(DOB.charAt(i)); }
        return Integer.parseInt(month.toString());
    }
    public static int year(String DOB) {
        StringBuilder year = new StringBuilder(); int x = 0;
        for (int i = 0; i < DOB.length(); i++) {
            if (DOB.charAt(i) == '/') x++;
            if (x == 2 && DOB.charAt(i) != '/') year.append(DOB.charAt(i)); }
        return Integer.parseInt(year.toString());
    }
}