class User {
    private String username, password;

    User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    void setUsername(String username) { this.username = username; }
    void setPassword(String password) { this.password = password; }
    String username() { return username; }
    String password() { return password; }
}