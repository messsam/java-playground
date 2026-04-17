public class Airplane {

    // attributes & Constructors.
    String name;
    int NumOfSeats;
    double EmptyWeight = 300, FuelConsumption = 2000;

    public Airplane() { name = ""; EmptyWeight = 0; FuelConsumption = 0; }
    public Airplane(String name, int NumOfSeats) { this.name = name; this.NumOfSeats = NumOfSeats; }
    public Airplane(String name, int NumOfSeats, double EmptyWeight, double FuelConsumption) {
        this.name = name;
        this.NumOfSeats = NumOfSeats;
        this.EmptyWeight = EmptyWeight;
        this.FuelConsumption = FuelConsumption;
    }

    // Methods / Behaviors.
    public String getName() { return name; }
    public int getSeats() { return NumOfSeats; }
    public double getEmptyWeight() { return EmptyWeight; }
    public double getFuelConsumption() { return FuelConsumption; }
    public void addSeats(int x) {NumOfSeats += x; }
    public void display() {
        System.out.println("Airplane Name: "+name+",\nNumber of Seats: "+NumOfSeats
                +",\nEmpty Weight: "+EmptyWeight+",\nFuel Consumption: "+FuelConsumption);
    }
    public void compareTo(Airplane a) {
        int difference = NumOfSeats - a.NumOfSeats;
        if (difference == 0)
            System.out.println("Both are equal in seat count.");
        else if (difference > 0)
            System.out.println(name+" has "+difference+" more seats. ("+name+": "+NumOfSeats+", "+a.name+": "+a.NumOfSeats+")");
        else System.out.println(a.name+" has "+(-difference)+" more seats. ("+name+": "+NumOfSeats+", "+a.name+": "+a.NumOfSeats+")");
    }

    // Main & Static methods.
    public static void display(Airplane a) {
        System.out.println("Airplane Name: "+a.name+",\nNumber of Seats: "+a.NumOfSeats
                +",\nEmpty Weight: "+a.EmptyWeight+",\nFuel Consumption: "+a.FuelConsumption);
    }
    public static void compareTo(Airplane a, Airplane b) {
        int difference = a.NumOfSeats - b.NumOfSeats;
        if (difference == 0)
            System.out.println("Both are equal in seat count.");
        else if (difference > 0)
            System.out.println(a.name+" has "+difference+" more seats. ("+a.name+": "+a.NumOfSeats+", "+b.name+": "+b.NumOfSeats+")");
        else System.out.println(b.name+" has "+(-difference)+" more seats. ("+a.name+": "+a.NumOfSeats+", "+b.name+": "+b.NumOfSeats+")");
    }
    public static void main(String[] args) {
        Airplane a1 = new Airplane("Boeing 1", 200);
        Airplane a2 = new Airplane("Boeing 2", 160, 22, 70000);
        System.out.println(a1.getSeats());
        System.out.println(a1.getSeats());
        System.out.println(a1.getName());
        a2.display();
        a2.addSeats(200);
        a2.addSeats(-20);
        a1.addSeats(100);
        a1.compareTo(a2);
        compareTo(a2, a1);
        display(a1);
    }
}