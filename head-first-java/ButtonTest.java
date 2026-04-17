public class ButtonTest {
    static void main() {
        WoodenButton wb = new WoodenButton("Black_Button", "Wooden_Button", "Mongolian_Wood", 432);
        System.out.print(wb.getNumber()+"\n"+wb.getName()+"\n"+wb);
    }
}

class Button {
    String name, type;
    int number;
    Button (String name, String type, int number) {
        this.name = name;
        this.type = type;
        this.number = number;
    }
    int getNumber() { return this.number; }
    String getName() { return this.name; }
    @Override
    public String toString() {
        return name+", "+type+", "+number;
    }
}

class WoodenButton extends Button {
    String woodMake;
    WoodenButton(String name, String type, String woodMake, int number) {
        super(name, type, number);
        this.woodMake = woodMake;
    }
    @Override
    public String toString() {
        return name+", "+type+", "+woodMake+", "+number;
    }
}