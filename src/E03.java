import java.util.Scanner;

public class E03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int gradusi = Integer.parseInt(scan.nextLine());
        String partOfDay = scan.nextLine();
        String outfit = "";
        String shoes = "";
        switch (partOfDay) {
            case "Morning":
                if (gradusi >= 10 && gradusi <= 18) {
                    outfit = "Sweatshirt";
                    shoes = "Sneakers";
                } else if (gradusi <= 24) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                } else if (gradusi >= 25) {
                    outfit = "T-Shirt";
                    shoes = "Sandals";
                }
                break;
            case "Afternoon":
                if (gradusi >= 10 && gradusi <= 18) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                } else if (gradusi <= 24) {
                    outfit = "T-Shirt";
                    shoes = "Sandals";
                } else if (gradusi >= 25) {
                    outfit = "Swim Suit";
                    shoes = "Barefoot";
                }
                break;
            case "Evening":
                if (gradusi >= 10 && gradusi <= 18) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                } else if (gradusi <= 24) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                } else if (gradusi >= 25) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                }
                break;
        }
        System.out.printf("It's %d degrees, get your %s and %s.", gradusi, outfit, shoes);

    }
}
