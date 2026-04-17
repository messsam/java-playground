public class SuperMarket {
    String name;
    PriorityQueue products;

    public SuperMarket(String name, int nOfProducts) {
        products = new PriorityQueue(nOfProducts);
        this.name = name;
    }
    public void insert(YoghurtProduct p) { products.insert(p); }
    public double newPrice(int productID) {
        Stack temp = new Stack(products.size());
        YoghurtProduct p = null;
        double discount = 0.5;
        boolean found = false;
        while (!products.isEmpty()) {
            p = (YoghurtProduct) products.remove();
            if (p.ID == productID) {
                found = true;
                break;
            }
            else {
                YoghurtProduct yh = !products.isEmpty()? (YoghurtProduct) products.peek(): p;
                discount = discount > 0 && p.compareTo(yh) != 0? discount-0.05: discount;
                temp.push(p);
            }
        }
        while (!temp.isEmpty()) {
            YoghurtProduct prod = (YoghurtProduct) temp.pop();
            products.insert(prod);
        }
        if (found) return p.price-(p.price*discount);
        return -1;
    }
}