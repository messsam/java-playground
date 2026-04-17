package explore02;

public class Car {
    String make, model;
    boolean isRunning;
    static int count;
    int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
        count++;
    }

    public boolean isRunning() { return isRunning; }
    public int year() { return year; }
    public String make() { return make; }
    public String model() { return model; }
    public void start() {
        if (!isRunning) {
            System.out.println("Starting the car.");
            isRunning = true; }
        else System.out.println("The car is already run.");
    }
    public void stop() {
        if (isRunning) {
            System.out.println("Stopping the car.");
            isRunning = false; }
        else System.out.println("The car is already off.");
    }
    public String toString() { return "Make: " + make + ", Model: " + model + ", Year: " + year; }
    public boolean equals(Car c) { return toString().equals(c.toString()); }
}