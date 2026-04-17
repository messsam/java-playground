public class ActivityTracker {
    int actCals, exMins, stanHrs, moveGoal, exGoal, standGoal;
    public ActivityTracker(int moveGoal, int exGoal, int standGoal) {
        this.moveGoal = moveGoal; this.exGoal = exGoal; this.standGoal = standGoal;
    }
    public void setGoals(int moveGoal, int exGoal, int standGoal) {
        this.moveGoal = moveGoal; this.exGoal = exGoal; this.standGoal = standGoal;
    }
    public void addActivity(int cals, int ex, int stand) {
        actCals = cals; exMins = ex; stanHrs = stand;
    }
    public String getProgress() {
        return "Movement progress: %" + (double)((actCals*moveGoal)/100) +
                "\nExercise progress: %" + (double)((exMins*exGoal)/100) +
                "\nStanding progress: %" + (double)((stanHrs*standGoal)/100);
    }
    public String toString() {
        return "You achieved "+actCals+"/"+moveGoal+" KCAL, "+exMins+"/"+exGoal+" MIN, and "+stanHrs+"/"+standGoal+" HR today!";
    }
    public boolean completedGoals() {
        return actCals >= moveGoal && exMins >= exGoal && stanHrs >= standGoal;
    }
}