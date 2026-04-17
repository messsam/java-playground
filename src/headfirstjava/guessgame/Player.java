package headfirstjava.guessgame;

import java.util.Random;

class Player {
    static Random randNum = new Random();
    int guessedNumber;
    String username;

    Player() {}
    Player(String username) { this.username = username; }
    Player(String username, int guessedNumber) {
        this(username);
        this.guessedNumber = guessedNumber;
    }

    @Override
    public String toString() { return username; }
    public void guess() { guessedNumber = randNum.nextInt(10); }
    public int getNumber() { return guessedNumber; }
    public String getUsername() { return username; }
}