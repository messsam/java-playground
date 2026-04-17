package classes;

public class Time {
    // Variables / Fields.
    int hours, minutes, seconds;

    // Constructors.
    public Time() {}
    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }
    public Time(String t) {
        hours = hrs(t);
        minutes = mins(t);
        seconds = secs(t);
    }

    // Methods / Behaviors.
    public int hours() { return hours; }
    public int minutes() { return minutes; }
    public int seconds() { return seconds; }
    public void addHrs(int x) {
        int temp = hours + x;
        if (temp >= 23) hours = temp % 24;
        else hours += x;
    }
    public void addMins(int x) {
        int temp = minutes + x;
        if (temp >= 59) { minutes = temp % 60; addHrs(1); }
        else minutes += x;
    }
    public void addSecs(int x) {
        int temp = seconds + x;
        if (temp >= 59) { seconds = temp % 60; addMins(1); }
        else seconds += x;
    }
    public void setTime(String t) {
        hours = hrs(t);
        minutes = mins(t);
        seconds = secs(t);
    }
    @Override public String toString() {
        return hours+":"+minutes+":"+seconds;
    }

    private static int hrs(String s) {
        StringBuilder hrs = new StringBuilder();
        for (int i = 0; s.charAt(i) != ':'; i++)
            hrs.append(s.charAt(i));
        return Integer.parseInt(hrs.toString());
    }
    private static int mins(String s) {
        StringBuilder min = new StringBuilder();
        for (int i = 0, j = 0; j < 2; i++) {
            if (s.charAt(i) == ':') j++;
            if (j == 1) min.append(Character.isDigit(s.charAt(i+1))? s.charAt(i+1):"");
        }
        return Integer.parseInt(min.toString());
    }
    private static int secs(String s) {
        StringBuilder sec = new StringBuilder();
        for (int i = 0, j = 0; i < s.length(); i++) {
            if (j == 2) sec.append(s.charAt(i));
            if (s.charAt(i) == ':') j++;
        }
        return Integer.parseInt(sec.toString());
    }
}