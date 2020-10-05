import java.util.Scanner;

public class Convert {
    public static void main(String[] args) {
        final double rate= 23000;

        Scanner scanner = new Scanner(System.in);

        double usd;
        System.out.println("Enter vlaue: ");
        usd = scanner.nextDouble();

        double vnd;
        vnd = usd * rate;
        System.out.println(usd + "usd is: " + vnd + "vnd");
    }
}
