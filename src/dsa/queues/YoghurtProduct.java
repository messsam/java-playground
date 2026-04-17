import java.time.LocalDateTime;

public class YoghurtProduct implements Comparable {
    int ID; double price; LocalDateTime expDate;
    public YoghurtProduct(int ID, double price) {
        this.ID = ID; this.price = price;
        this.expDate = LocalDateTime.now().plusMonths(2);
    }
    @Override
    public String toString() {
        return "ID: "+ID+", Price: "+price+", Expiry date: "+expDate;
    }
    @Override
    public int compareTo(Object o) {
        YoghurtProduct other = (YoghurtProduct) o;
        return this.expDate.compareTo(other.expDate);
    }
}