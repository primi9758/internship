import java.util.Scanner;

public class naloga3 {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        int p, n, c;
        c = 0;
        p = 1;
        boolean works = true;

        while (sc.hasNextInt()) {
            n = sc.nextInt();

            if (c > 0) {
                if (n % p != 0) {
                    System.out.printf(": This sequence stops at index %d.", c);
                    works = false;
                    break;
                }
            }

            if (works == true) {
                System.out.printf("%d ", n);
            }

            p = n;
            c++;
        }

    }
}