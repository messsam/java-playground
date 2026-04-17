package classes;

public abstract class Card {
    String recipient;

    protected Card() { recipient = "Unknown"; }
    protected Card(String recipient) {
        this.recipient = recipient;
    }

    protected abstract String greetings();
}