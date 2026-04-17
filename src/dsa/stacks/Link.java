package dsa.stacks;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.time.LocalTime;

public class Link {
    final private String URL;
    final private String date;
    final private String time;
    private int frequency;

    public Link(String URL) {
        this.URL = URL;
        this.frequency = 0;
        SimpleDateFormat SDT = new SimpleDateFormat("yyy-MM-dd");
        Calendar cal = Calendar.getInstance();
        Date Date = cal.getTime();
        date = SDT.format(Date);
        time = LocalTime.now().toString();
    }
    public Link(String URL, int freq) { this(URL); frequency = freq; }
    public String getURL() { return URL; }
    public String getDate() { return date; }
    public String getLocalTime() { return time; }
    public int getFrequency() { return frequency; }
    public void setFrequency(int freq) { frequency = freq; }

    @Override
    public String toString() {
        return URL + " " + date + " " + time + ", Frequency: " + frequency;
    }
}