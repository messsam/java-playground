package explore01;

import java.util.Scanner;

public class ShuffledGuess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.next().toLowerCase(), random = ran(word.length());
        StringBuilder rand = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            String c = ""; c += random.charAt(i);
            rand.append(word.charAt(Integer.parseInt(c)));
        }

        System.out.println("Welcome to wordle!\n\nThe shuffled word is: ( "+rand.toString()+" ). Good luck!");
        do {
            System.out.print("Enter your guess ('Quit' to exit): ");
            String ans = sc.next().toLowerCase();
            if (ans.equals(word)) {
                System.out.print("That's correct, you won!"); break;
            }
            else if (ans.equals("quit")) {
                System.out.print("You lost the game. The correct word was: "+word+"."); break;
            }
            else if (ans.length() != word.length())
                do {
                    System.out.print("Wrong number of characters. Guess again: ");
                    ans = sc.next().toLowerCase();
                } while (ans.length() != word.length());
            System.out.print("Nice try. The characters guessed in the right place are: ");
            correct(ans, word);
        } while (true); sc.close();
    }

    public static String ran(int x) {
        StringBuilder random = new StringBuilder();
        for (int i = 0; i < x; i++) {
            String c; do {
                c = ""; c += (int) (Math.random() * x);
            } while (random.toString().contains(c));
            random.append(c); }
        return random.toString();
    }

    public static void correct(String c, String s) {
        StringBuilder cor = new StringBuilder();
        for (int i = 0; i < s.length(); i++)
            if (c.charAt(i) == s.charAt(i)) cor.append(c.charAt(i)).append(' ');
        if (cor.toString().isEmpty()) System.out.println("none.");
        else System.out.println(cor);
    }
}