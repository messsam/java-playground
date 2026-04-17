import java.util.*;
class People {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Person> persons = new ArrayList<>();
        while (true) {
            System.out.print("Enter a new person (Name, Age, Date of birth. \"Quit\" to exit): "); String x = sc.nextLine();
            if (x.equalsIgnoreCase("quit")) break;
            else persons.add(create(x));
        }
        display(persons);
    }
    public static Person create(String s) {
        StringBuilder name = new StringBuilder(), DateOfBirth = new StringBuilder(), age = new StringBuilder(); int i;
        for (i = 0; s.charAt(i) != ' '; i++) name.append(s.charAt(i));
        for (++i; s.charAt(i) != ' '; i++) age.append(s.charAt(i));
        for (++i; i < s.length(); i++) DateOfBirth.append(s.charAt(i));
        return new Person(name.toString(), Integer.parseInt(age.toString()), DateOfBirth.toString());
    }
    public static void display(ArrayList<Person> persons) {
        for (Person p : persons)
            System.out.println(p);
    }
}