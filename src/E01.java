import java.util.Scanner;

public class E01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double x1 = Double.parseDouble(scan.nextLine());
        double y1 = Double.parseDouble(scan.nextLine());
        double x2 = Double.parseDouble(scan.nextLine());
        double y2 = Double.parseDouble(scan.nextLine());
        double x = Double.parseDouble(scan.nextLine());
        double y = Double.parseDouble(scan.nextLine());

        if (x > x1 && x < x2) {
            if (y == y1 || y == y2) {
                System.out.println("Border");
            }
        } else if (y < y1 && y > y2) {
            if (x == x1 || x == x2) {
                System.out.println("Border");
            } else {
                System.out.println("Inside / Outside");
            }

        }

    }
}