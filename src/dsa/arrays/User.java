package dsa.arrays;

public class User {
    String username, password;
    int ID;

    public User() {
        this("Undefined", "Undefined", 000000);
    }
    public User(String username, String password) {
        this(username, password, 000000);
    }
    public User(String username, String password, int ID) {
        this.username = username;
        this.password = password;
        this.ID = ID;
    }

    void setUsername(String username) { this.username = username; }
    void setPassword(String password) { this.password = password; }
    String getUsername() { return username; }
    String getPassword() { return password; }

    @Override public String toString() { return "Name: "+username+", ID: "+ID; }
}