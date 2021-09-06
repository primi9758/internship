import java.util.Scanner;

public class naloga2 {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        int coin;
        int registry = 0;

        while (sc.hasNextInt()) {
            coin = sc.nextInt();
            if (coin == 1) {
                registry++;
            } else if (coin == 2) {
                registry--;
                if (registry < 0) {
                    System.out.print("BNAKRUPTCY");
                    break;
                }
            } else {
                System.out.print("You can only pay with a 1 or 2 EUR coin.");
                break;
            }
        }

        if (registry == 1) {
        System.out.printf("There is %d coin for 1 EUR remaining in the registry.", registry);
        } else if (registry > 1) {
        System.out.printf("There are %d coins for 1 EUR remaining in the registry.", registry);
        }
    }
}