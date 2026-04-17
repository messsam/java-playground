package classes;

import org.junit.*;
import static org.junit.Assert.*;

public class CardTestDrive {
    @Test public void valentineTest() {
        Card vc = new ValentineCard("John");
        assertEquals("Love and Kisses.", vc.greetings());
    }
    @Test public void HolidayTest() {
        Card hc = new HolidayCard("John", Season.Summer);
        assertEquals("Summer's Greetings, John.", hc.greetings());
    }
    @Test public void birthdayTest() {
        Card bc = new BirthdayCard("John");
        assertEquals("Happy Birthday, John.", bc.greetings());
    }
}
