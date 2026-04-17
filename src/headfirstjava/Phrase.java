package headfirstjava;

import java.util.Random;

class Phrase {
    public static void main() {
        Random rand = new Random();
        String[] one = new String[] {"Mohand", "John", "Doe", "Maxxing"};
        String[] two = new String[] {"is", "was"};
        String[] three = new String[] {"Boring", "Cringe", "Cool", "Chill", "GOAT"};
        System.out.print(one[rand.nextInt(one.length)]+" "+two[rand.nextInt(two.length)]+" "+three[rand.nextInt(three.length)]);
    }
}