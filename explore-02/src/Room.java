public class Room {
    int roomNumber, daysRented, bedsNumber;
    double rentalRate; String guestName;

    public Room(String guestName, int roomNumber, int bedsNumber, double rentalRate, int daysRented) {
        this.roomNumber = roomNumber; this.bedsNumber = bedsNumber;
        this.guestName = guestName; this.rentalRate = rentalRate;
        this.daysRented = daysRented;
    }

    public double calculateTotal() { return rentalRate*daysRented; }
    public void addBed() {
        if (bedsNumber < 2) {
            bedsNumber++;
            System.out.println("The current number of beds is: " + bedsNumber);
        }
        else System.out.println("The maximum number of beds has been reached. (2)");
    }
    public String toString() {
        return "Guest name: " + guestName + "\nRoom number: " + roomNumber
                + "\nBeds number: " + bedsNumber + "\nThe rental rate: " + rentalRate
                + "\nRented for: " + daysRented + (daysRented==1?" Day.\n":" Days.\n");
    }

    public static void main(String[] args ) {
        Room r1 = new Room("Blake", 123, 1 , 123.50, 5);
        System.out.println(r1);
        System.out.println(r1.calculateTotal());
        r1.addBed();
        System.out.println(r1);
        r1.addBed();
    }
}