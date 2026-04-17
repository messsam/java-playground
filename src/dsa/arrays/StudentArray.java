package dsa.arrays;

public class StudentArray {
    Student[] arr; int total;
    StudentArray(int size) { arr = new Student[size]; }

    public String toString() {
        StringBuilder users = new StringBuilder();
        for (int i = 0; i < total; i++) users.append(arr[i]).append("\n");
        return users.toString();
    }
    public void insert(Student s) {
        if (total == arr.length) { System.out.println("Invalid."); return; }
        System.out.println("Successfully inserted "+s.name+" at index "+total+".");
        arr[total++] = s;
    }
    public void delete(Student s) {
        for (int i = 0; i < total; i++)
            if (arr[i].equals(s)) {
                for (; i < total-1; i++)
                    arr[i] = arr[i+1];
                System.out.println("Successfully deleted "+s.name+".");
                total--; return;
            }
        System.out.println("Invalid.");
    }
    public void sort() {
        for (int i = 1, j; i < total; i++) {
            Student temp = arr[i];
            for (j = i; j > 0 && arr[j-1].name.compareTo(temp.name) > 0; j--)
                arr[j] = arr[j-1];
            arr[j] = temp;
        }
    }

    static void main(String[] args) {
        StudentArray array = new StudentArray(10);
        array.insert(new Student("Mohand","Essam", 29300, 0.7));
        array.insert(new Student("John", "Doe", 34202, 1.3));
        array.delete(array.arr[0]); IO.println(array.arr[0]);
        array.insert(new Student("Mohand", "Essam", 29300, 0.7));
        array.insert(new Student("Ahmed", "Gamal", 45378, 0.9));
        array.insert(new Student("Alaa", "Refaat", 33326, 2.3));
        array.insert(new Student("Sara", "Maged", 87690, 2));
        array.insert(new Student("Youssef", "Ahmed", 35321, 4));
        array.insert(new Student("Osama", "Shaarawy", 86978, 1.88));
        System.out.println(array); array.sort(); System.out.print(array);
    }
}