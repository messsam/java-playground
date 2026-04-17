package classes;

public class BirthdayCard extends Card {
    public BirthdayCard(String recipient) {
        super(recipient);
    }

    @Override protected String greetings() {
        return "Happy Birthday, " + recipient + ".";
    }
}