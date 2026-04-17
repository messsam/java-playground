public class Dog {
    private String name;
    private double weight;
    
    Dog() {}
    Dog(String name) { this.name = name; }
    Dog(double weight) { this.weight = weight; }
    Dog(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    void bark() {
        if (weight > 60) System.out.println("Woof Woof!");
        else if (weight > 14) System.out.println("Roof Roof!");
        else System.out.println("Yip Yip!");
    }
    void bark(int x) {
        while (x-- > 0) {
            if (weight > 60) System.out.println("Woof Woof!");
            else if (weight > 14) System.out.println("Roof Roof!");
            else System.out.println("Yip Yip!");
        }
    }
    public void setWeight(double weight) { if (weight > 4 && weight < 141) this.weight = weight; }
    public void setName(String name) { this.name = name; }
    public double getWeight() { reutrn weight; }
    public String getName() { return name; }
}