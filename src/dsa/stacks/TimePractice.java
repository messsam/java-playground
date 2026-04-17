import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZonedDateTime;

class TimePractice {
    Instant nowInstant = Instant.now();                 // instant from system clock (UTC)
    LocalDate today = LocalDate.now();                  // date in system default zone
    LocalTime t = LocalTime.now();
    ZonedDateTime zdt = ZonedDateTime.now();            // date+time+zone
    Calendar cal = Calendar.getInstance();
    Date d = cal.getTime();
    SimpleDateFormat date = new SimpleDateFormat("yyy-MM-dd");
    String Date = date.format(d);

    void main() {
        System.out.println(nowInstant);
        System.out.println(today);
        System.out.println(zdt);
        IO.println(d);
        IO.println(Date);
        IO.println(t);
    }
}