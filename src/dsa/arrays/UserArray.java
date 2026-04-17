package dsa.arrays;

public class UserArray {
    User[] arr; int total;
    UserArray(int size) { arr = new User[size]; }

    public String toString() {
        StringBuilder users = new StringBuilder();
        for (int i = 0; i < total; i++) users.append(arr[i]).append("\n");
        return users.toString();
    }
    void insert(User u) {
        if (total < arr.length) {
            for (int i = 0; i < total; i++)
                if (arr[i].toString().compareTo(u.toString()) >= 0) {
                    for (int j = total++; j > i; j--)
                        arr[j] = arr[j-1];
                    IO.println("Successfully inserted "+u.username+" at index "+i+".");
                    arr[i] = u; return;
                }
            IO.println("Successfully inserted "+u.username+" at index "+total+".");
            arr[total++] = u; return;
        }
        IO.println("Invalid.");
    }
    void delete(User u) {
        for (int i = 0; i < total; i++)
            if (arr[i].equals(u)) {
                while (i < total-1)
                    arr[i] = arr[++i];
                IO.println("Successfully deleted "+u.username+".");
                total--; return;
            }
        IO.println("Invalid.");
    }
    int biSearch(User u) {
        int first = 0, last = total-1, middle;
        while (last >= first) {
            middle = (first+last)/2;
            if (arr[middle].equals(u)) return middle;
            if (arr[middle].toString().compareTo(u.toString()) > 0) last = middle-1;
            else first = middle+1;
        }
        return -1;
    }

    static void main(String[] args) {
        UserArray array = new UserArray(10);
        array.insert(new User("Mohand", "34re", 29300));
        array.insert(new User("Momen", "erhdf", 34202));
        array.delete(array.arr[0]); IO.println(array.arr[0]);
        array.insert(new User("Mohand", "erye5", 29300));
        array.insert(new User("Ahmed", "5y4e", 45378));
        array.insert(new User("Alaa", "5ye4th", 33326));
        array.insert(new User("Sara", "hgfse", 87690));
        array.insert(new User("Youssef", "wqrwegj", 35321));
        array.insert(new User("Osama", "iyljfg3@", 86978));
        System.out.println(array.biSearch(array.arr[6]));
        System.out.print(array);
    }
}