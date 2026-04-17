import java.util.Scanner;
import java.util.Random;


class GuessGame {
    Player p1, p2;

    GuessGame() {
        p1 = new Player("RandomPlayer_1");
        p2 = new Player("RandomPlayer_2");
    }
    GuessGame(String p1, String p2) {
        this.p1 = new Player(p1);
        this.p2 = new Player(p2);
    }

    void startGame() {
        Random randNum = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.print("Welcome!\nWhat's your name? ");
        String playername = sc.nextLine();
        int random, guess, guess1, guess2;
        System.out.print("Hello "+playername+"! ready to play? :) (type \"No\" to exit) ");
        String answer = sc.nextLine();
        if (answer.compareToIgnoreCase("no") == 0) {
            System.out.print("Okay, see you later!");
            return;
        }
        while (true) {
            random = randNum.nextInt(10);
            System.out.print("Guess a number from 0 to 9: ");
            guess = sc.nextInt();
            p1.guess(); p2.guess();
            if (guess == random) {
                System.out.print("You won! you guessed the number "+random+" correctly!");
                return;
            }
            else if (p1.getNumber() == random) {
                System.out.print(p1+" guessed the number "+random+" right! he won!");
                return;
            }
            else if (p2.getNumber() == random) {
                System.out.print(p2+" guessed the number "+random+" right! he won!");
                return;
            } else {
                System.out.print("None of you guessed the number right ;)\nLet's retry! (type \"No\" to exit) ");
                answer = sc.next();
                if (answer.compareToIgnoreCase("no") == 0) {
                    System.out.print("Okay, see you later!");
                    return;
                }
            }
        }
    }
}