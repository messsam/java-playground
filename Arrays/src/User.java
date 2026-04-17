public class User {
    String username; int ID;

    public User() { username = "Default"; ID = 00000; }
    public User(String username, int ID) { this.username = username; this.ID = ID; }
    public String toString() { return "Name: "+username+", ID: "+ID; }
}