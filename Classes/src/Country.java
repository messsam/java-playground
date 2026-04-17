public class Country {
    String name;
    String continent;
    int numOfCitizens;
    int polState;
    boolean royal;

    public Country(String name, String continent, int num, int pol, boolean royal) {
        this.name = name;
        this.continent = continent;
        numOfCitizens = num;
        polState = pol;
        this.royal = royal;
    }
    public String getState() {
        String s = "";
        switch (polState) {
            case 4: s = "Peace"; break;
            case 3: s = "increase intelligence"; break;
            case 2: s = "Increase in force readiness"; break;
            case 1: s = "war"; break;
            default: s = "Not defined."; }
        return s;
    }
    public boolean getRoyalState() {
        return royal;
    }
    public void setDefCon(int p) {
        polState = p;
    }
    public void increaseCitizen(int c) {
        numOfCitizens += c;
    }
    public String display() { return name + ", " + continent + ", " + numOfCitizens + ", " + this.getState() + ", " + royal; }
    public int compareTo(Country a) {
        return numOfCitizens - a.numOfCitizens;
    }
    public static int compareTo(Country a, Country b) {
        return a.numOfCitizens - b.numOfCitizens;
    }

    public static void main(String[] args) {
        Country a = new Country("USA", "North America", 300000000, 4, true);
        Country b = new Country("UK", "Europe", 89000000, 3, false);
        System.out.println(a.display() + "\n" + b.display());
        a.setDefCon(1);
        int x = a.compareTo(b);
        if (x > 0) System.out.print("The larger country is: " + a.name);
        else if (x == 0) System.out.print("Both are equal.");
        else System.out.print("The larger country is: " + b.name);
    }
}