package statistics;

public class CentralTendency {
    public static void main(String[] args) {
        args = new String[20];
        for (int i = 0; i < 20; i++)
            args[i] = Integer.toString((int)(Math.random()*20));
        try {
            double sum = 0;
            System.out.print("Values: ");
            for (int i = 0; i < 20; i++) {
                String current = args[i];
                sum += Integer.parseInt(current);
                if (i == 19) System.out.print(current);
                else System.out.print(current + ", ");
            }
            System.out.println("\nMean: " + sum/args.length);
        } catch (Exception e) {
            System.out.print("Please retry again and enter only valid numbers.");
        }
    }

    public void alternativeMain(String[] args) {
        try {
            int sum = 0;
            System.out.print("Values: ");
            for (int i = 0; i < args.length; i++) {
                if (i == args.length - 1) System.out.println(args[i]);
                else System.out.print(args[i] + ", ");
                sum += Integer.parseInt(args[i]);
            }
        } catch (Exception e) {
            System.out.print("Please retry again and enter only valid numbers.");
        }
    }
}