package explore02;

public class GoalTracker {
    ActivityTracker[] dailyActivity = new ActivityTracker[7];
    int[] goals = new int[3];
    public GoalTracker(int m, int e, int s) {
        goals[0] = m; goals[1] = e; goals[2] = s;
        for (int i = 0; i < 7; i++)
            dailyActivity[i] = new ActivityTracker(m, e, s);
    }
    public GoalTracker(int[] g, ActivityTracker[] a) {
        for (int i = 0; i < g.length; i++)
            goals[i] = g[i];
        for (int i = 0; i < a.length; i++)
            dailyActivity[i] = new ActivityTracker(a[i].moveGoal, a[i].exGoal, a[i].standGoal);
    }
    public void recordDailyActivity(int day, int move, int exercise, int stand) {
        dailyActivity[day].addActivity(move, exercise, stand);
    }
    public int getOverallCompletionRate() {
        int completed = 0;
        for (int i = 0; i < 7; i++)
            if (dailyActivity[i].completedGoals()) completed++;
        return completed;
    }
    public String bestDay() {
        String day;
        int cals = dailyActivity[0].actCals, index = 0;
        for (int i = 1; i < 7; i++)
            if (dailyActivity[i].actCals > cals) {
                cals = dailyActivity[i].actCals; index = i;
            }
        switch(index) {
            case 1: day = "Monday"; break;
            case 2: day = "Tuesday"; break;
            case 3: day = "Wednesday"; break;
            case 4: day = "Thursday"; break;
            case 5: day = "Friday"; break;
            case 6: day = "Saturday"; break;
            default: day = "Sunday";
        }
        return "Best day is "+day+" with "+dailyActivity[index].actCals+" calories burned.";
    }
}
