public class Polynomial {
    int[] coefficients;
    public Polynomial() { coefficients = new int[0]; }
    public Polynomial(int[] coefficients) {
        this.coefficients = new int[coefficients.length];
        for (int i = 0; i < coefficients.length; i++)
            this.coefficients[i] = coefficients[i];
    }
    public int degree() {
        for (int i = 0, j = coefficients.length-1; i < coefficients.length; i++, j--)
            if (coefficients[i] != 0) return j;
        return -1;
    }
    public String toString() {
        StringBuilder string = new StringBuilder();
        for (int i = 0, j = coefficients.length-1; i < coefficients.length; i++, j--)
            if (coefficients[i] != 0) {
                if (i == coefficients.length-1) string.append(coefficients[i]);
                else string.append(coefficients[i]).append("X^").append(j).append(" + ");
            }
        return string.toString();
    }
    public int[] add(Polynomial p) {
        int[] newList = new int[this.coefficients.length];
        for (int i = 0; i < this.coefficients.length; i++)
            if (coefficients[i] != 0)
                newList[i] = this.coefficients[i] + p.coefficients[i];
        return newList;
    }
    public static int[] add(Polynomial p1, Polynomial p2) {
        int[] newList = new int[p1.coefficients.length];
        for (int i = 0; i < p1.coefficients.length; i++)
            if (p1.coefficients[i] != 0)
                newList[i] = p1.coefficients[i] + p2.coefficients[i];
        return newList;
    }
    public static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length-1) System.out.println(arr[i]);
            else System.out.print(arr[i] + ", ");
        }
    }
    public static void main(String[] args) {
        Polynomial p1 = new Polynomial();
        Polynomial p2 = new Polynomial(new int[] {0,4,6,0,0,0,4,3,2,0,0,6});
        Polynomial p3= new Polynomial(new int[] {56,5,0,0,0,0,0,3,0,0,0,2,0});
        Polynomial p4 = new Polynomial(new int[] {0,9,2,0,0,0,88,1,24,0,0,6});
        System.out.println(p2.degree() + " " + p3.degree());
        display(p2.add(p4));
        display(add(p2, p4));
        System.out.println(p1);
        System.out.println(p4);
    }
}